package com.nit.dao;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.nit.beans.PassengerBean;
import com.nit.beans.RegistrationBean;
import com.nit.beans.RestaurantBean;
import com.nit.beans.TaxiDriverBean;
import com.nit.util.Constants;
import com.nit.util.DBConnectionClass;
import com.nit.util.SqlConstants;


public class UserDAO extends DBConnectionClass {
	public static Connection con;
	PreparedStatement ps,pst;
	private boolean flag;

	public UserDAO() {
		
		con = getConnection();
		try
		{
			
			
			
		pst=con.prepareStatement("select id,ordertime from orders where status='ASSIGNED'");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			long mins=new Date().getTime()-rs.getTimestamp(2).getTime()/(60 * 1000);
			if(mins>=30)
			{
				ps=con.prepareStatement("update orders set status='DELIVERED' where id=?");
				ps.setInt(1, rs.getInt(1));
				ps.executeUpdate();
				ps.close();
			}
		}
		
		pst.close();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String d=sdf.format(new Date());
		PreparedStatement pst1=con.prepareStatement("select id,pickup_time from taxi where" +
				" to_char(pickup_time,'dd-MM-yyyy')!='"+d+"'");
		
		ResultSet r=pst1.executeQuery();
		while(r.next())
		{
		
			PreparedStatement pt=con.prepareStatement("delete from passenger where taxi_id=?");
			pt.setInt(1, r.getInt(1));
			pt.executeUpdate();
			pt.close();
			

			PreparedStatement pr=con.prepareStatement("delete from taxi where id=?");
			pr.setInt(1, r.getInt(1));
			pr.executeUpdate();
			pr.close();
			
			
		}
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		

	}

	public List<TaxiDriverBean> viewDrivers()
	{
		List<TaxiDriverBean> list=new ArrayList<TaxiDriverBean>();
		try
		{
		pst=con.prepareStatement("select * from taxi");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			TaxiDriverBean t=new TaxiDriverBean();
			t.setCurrentLocation(rs.getString(5));
			t.setDropTime(rs.getTimestamp(7));
			t.setEmail(rs.getString(4));
			t.setName(rs.getString(2));
			t.setPhone(rs.getString(3));
			t.setPickUpTime(rs.getTimestamp(6));
			list.add(t);
		}
		}catch(Exception  e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	
	public List<PassengerBean> viewPassengers()
	{
		List<PassengerBean> list=new ArrayList<PassengerBean>();
		try
		{
		pst=con.prepareStatement("select * from passenger");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			PassengerBean t=new PassengerBean();
			t.setDestinationLocation(rs.getString(5));
			t.setName(rs.getString(3));
			t.setPickUpTime(rs.getString(6));
			t.setSourceLocation(rs.getString(4));
			list.add(t);
		}
		}catch(Exception  e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	public int assignAllRouteOrders(String id)
	{
		int i=0;
	try
	{
		pst=con.prepareStatement("select location from taxi where id=?");
		pst.setInt(1, Integer.parseInt(id));
		ResultSet rs=pst.executeQuery();
		if(rs.next())
		{
			PreparedStatement p=con.prepareStatement("Select id,user_location from orders where status='PENDING'");
			ResultSet r=p.executeQuery();
			while(r.next())
			{
				String userlocation=r.getString(2);
				PreparedStatement ps=con.prepareStatement("select * from routes where source=?");
				ps.setString(1, rs.getString(1));
				ResultSet rt=ps.executeQuery();
				while(rt.next())
				{
					if(userlocation.equals(rt.getString(3)))
					{
						PreparedStatement pr=con.prepareStatement("update orders set status='ASSIGNED' where id=?");
						pr.setInt(1, r.getInt(1));
						pr.executeUpdate();
						i++;
					}
					else
					{
						String points[]=rt.getString(4).split(",");
						for(String point:points)
						{
							if(userlocation.equals(point))
							{
								PreparedStatement pr=con.prepareStatement("update orders set status='ASSIGNED' where id=?");
								pr.setInt(1, r.getInt(1));
								pr.executeUpdate();
								i++;
							}
						}
					}
					
					
					
				}
			}
			
		}
		
		
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return i;
	}
	
	
	public boolean checkLoginIDExisted(String loginid) {
		boolean f = false;
		try {
			ps = con
					.prepareStatement(SqlConstants.SQL_CHECK_LOGIN);
			ps.setString(1, loginid);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				f = true;
			}
			ps.close();
		rs.close();
		}
		

		catch (Exception e) {
			
		} 
		return f;
	}

	

	public boolean insertUserInfo(RegistrationBean reb) {
		
		
		try {
			int i = 0;
			
			pst = con
					.prepareStatement(SqlConstants.SQL_INSERT_USER_INFO);
			pst.setString(1, reb.getUserId());
			pst.setString(2, reb.getPassword());
			pst.setString(3, reb.getUserName());
			pst.setString(4, reb.getMobile());
			pst.setString(5, reb.getMail());
			
			pst.setString(6, reb.getAddress());
			pst.setString(7, reb.getRole());
			
			
	
			i = pst.executeUpdate();
			if (i == 1) {
				flag = true;
				con.commit();
			} else {
				flag = false;
				con.rollback();
			}
			pst.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
			flag = false;
			try {
				con.rollback();
			} catch (SQLException sex1) {
				sex1.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
			try {
				con.rollback();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}  
		return flag;
	}


	public RegistrationBean loginCheck(RegistrationBean regbean) 
	{
		String loginid = regbean.getUserId();
		String password = regbean.getPassword();
		RegistrationBean regbean1 = new RegistrationBean();
		try {
			
			pst = con
			.prepareStatement(SqlConstants.SQL_LOGIN_CHECK);
			pst.setString(1, loginid);
			pst.setString(2, password);

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				regbean1.setRole(rs.getString(1));
				regbean1.setUserName(rs.getString(2));
				
			} else {
				flag = false;
				regbean1.setRole("");
				regbean1.setUserName("");
				
				
			}
			pst.close();
		} catch (SQLException ex) {
			System.out.println(ex);
			
			flag = false;
		} 

		return regbean1;
		
	}

	public int uploadRestaurant(RestaurantBean r) {
		try
		{
		pst=con.prepareStatement("insert into restaurant(id,name,phone,email,location,hours,food,image,price) values((SELECT NVL(MAX(id),0)+1 FROM restaurant),?,?,?,?,?,?,?,?)");
		pst.setString(1,r.getRestaurantName());
		pst.setString(2,r.getPhone() );
		pst.setString(3,r.getEmail());
		pst.setString(4, r.getLocation());
		pst.setString(5, r.getHours());
		pst.setString(6, r.getFood());
		File f=new File(r.getImage());
		FileInputStream fis=new FileInputStream(f);
		pst.setBinaryStream(7,fis,fis.available());
		pst.setString(8,r.getPrice());
		return pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}

	public int saveTaxiDriver(TaxiDriverBean r) {
		try
		{
		pst=con.prepareStatement("insert into taxi(id,name,phone,email,location,pickup_time,drop_time) values((SELECT NVL(MAX(id),0)+1 FROM taxi),?,?,?,?,?,?)");
		pst.setString(1,r.getName());
		pst.setString(2,r.getPhone() );
		pst.setString(3,r.getEmail());
		pst.setString(4,r.getCurrentLocation());
		pst.setTimestamp(5, r.getPickUpTime());
		pst.setTimestamp(6, r.getDropTime());
		return pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}

	public int savePassenger(PassengerBean r) {
		try
		{
		pst=con.prepareStatement("insert into passenger(id,taxi_id,name,source,destination,pickup) values((SELECT NVL(MAX(id),0)+1 FROM passenger),?,?,?,?,?)");
		pst.setInt(1,r.getTaxiId());
		pst.setString(2,r.getName());
		pst.setString(3,r.getSourceLocation() );
		pst.setString(4,r.getDestinationLocation());
		pst.setString(5,r.getPickUpTime());
		return pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}

	
	public List<TaxiDriverBean> getTaxiDrivers()
	{
		List<TaxiDriverBean> list=new ArrayList<TaxiDriverBean>();
		try
		{
			pst=con.prepareStatement("select id,name from taxi");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				TaxiDriverBean tb=new TaxiDriverBean();
				tb.setId(rs.getInt(1));
				tb.setName(rs.getString(2));
				list.add(tb);
			}
			pst.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	
	public TaxiDriverBean getTaxiDetails(int id)
	{
		TaxiDriverBean tb=new TaxiDriverBean();
		try
		{
			pst=con.prepareStatement("select * from taxi");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				tb.setId(rs.getInt(1));
				tb.setName(rs.getString(2));
				tb.setPhone(rs.getString(3));
				tb.setEmail(rs.getString(4));
				tb.setCurrentLocation(rs.getString(5));
				tb.setPickUpTime(rs.getTimestamp(6));
			}
			pst.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return tb;
	}
	
	
	public List<Integer> checkTaxiAvailability(RestaurantBean rb)
	{
		List<Integer> list=new ArrayList<Integer>();
		
		@SuppressWarnings("unused")
		String status="";
	try
	{
		pst=con.prepareStatement("select id,pickup_time from taxi where location=?");
		System.out.println("rest location---"+rb.getLocation());
		
		pst.setString(1, rb.getLocation());
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			Timestamp taxiTime=rs.getTimestamp(2);
			long diff=(taxiTime.getTime()- rb.getOrderTime().getTime())/ (60 * 1000);
			//System.out.println("taxi time---"+taxiTime+"===order time time---"+rb.getOrderTime());
			
			Date taxiDate=new Date(taxiTime.getTime());
			Date orderDate=new Date(rb.getOrderTime().getTime());
			
			/*System.out.println("check 1--"+taxiTime.after(rb.getOrderTime()));
			System.out.println("check 2--"+diff);
			System.out.println("check 3--"+taxiDate.compareTo(new Date()));
			System.out.println("check 3--"+orderDate.compareTo(new Date()));
			System.out.println("tax date--"+taxiDate);
			System.out.println("roder date--"+orderDate);*/
			
			
			if(taxiTime.after(rb.getOrderTime()) &&  diff<=Constants.MINS && taxiDate.compareTo(orderDate)==1)
			{
				System.out.println("inside if");
			ps=con.prepareStatement("select destination from passenger where taxi_id=?");
			ps.setInt(1, rs.getInt(1));
			ResultSet rs1=ps.executeQuery();
			while(rs1.next())
			{
				String source=rb.getLocation();
				@SuppressWarnings("unused")
				String destination=rs1.getString(1);
				PreparedStatement p=con.prepareStatement("select * from routes where source=?");
				p.setString(1,source);
				ResultSet r=p.executeQuery();
				while(r.next())
				{
					if(r.getString(3).equals(rb.getUserLocation()))
					{
						if(!list.contains(rs.getInt(1)))
						list.add(rs.getInt(1));
						status=Constants.AVAILABLE;
					}
					else
					{
						for(String s:r.getString(4).split(","))
						{
							if(s.equals(rb.getUserLocation()))
							{
								if(!list.contains(rs.getInt(1)))
								list.add(rs.getInt(1));
								status=Constants.AVAILABLE;
							}
							
						}
					}
					
				}
			}
		}
			
			
		
		
		}
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return list;
	}
	
	public TreeSet<String> getLocations()
	{
		Set<String> list=new HashSet<String>();
		try
		{
			pst=con.prepareStatement("select source,destination,points from routes");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				if(!list.contains(rs.getString(1)))
				{
					list.add(rs.getString(1));
				}
					
				if(!list.contains(rs.getString(2)))
				{
					list.add(rs.getString(2));
				}
				String[] points=rs.getString(3).split(",");
				for(String str:points)
				{
					if(!list.contains(str))
					{
					list.add(str);
					}
				}
				
			}
			pst.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		TreeSet<String> t=new TreeSet<String>();
		t.addAll(list);
		
		return t;
	}
	
	
	public List<RestaurantBean> getFoodItems()
	{
		
		
		
		
		List<RestaurantBean> list=new ArrayList<RestaurantBean>();
		try
		{
			pst=con.prepareStatement("select * from restaurant");
			
			
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				RestaurantBean tb=new RestaurantBean();
				tb.setId(rs.getInt(1));
				tb.setRestaurantName(rs.getString(2));
				tb.setPhone(rs.getString(3));
				tb.setEmail(rs.getString(4));
				tb.setLocation(rs.getString(5));
				tb.setHours(rs.getString(6));
				tb.setFood(rs.getString(7));
				tb.setImageBytes(rs.getBytes(8));
				tb.setPrice(rs.getString(9));
				list.add(tb);
			}
			pst.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}

	
	public Map<String,Integer>  getFoodsCategories()
	{
		Map<String,Integer> map=new HashMap<String,Integer>();
		try
		{
		pst=con.prepareStatement("select count(food),food from restaurant group by food");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			map.put(rs.getString(2),rs.getInt(1));
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return map;
	}
	
	public List<RestaurantBean> getFoodItems(String search)
	{
		
		List<RestaurantBean> list=new ArrayList<RestaurantBean>();
		try
		{
			pst=con.prepareStatement("select * from restaurant where food like '%"+search+"%'");
			
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				RestaurantBean tb=new RestaurantBean();
				tb.setId(rs.getInt(1));
				tb.setRestaurantName(rs.getString(2));
				tb.setPhone(rs.getString(3));
				tb.setEmail(rs.getString(4));
				tb.setLocation(rs.getString(5));
				tb.setHours(rs.getString(6));
				tb.setFood(rs.getString(7));
				tb.setImageBytes(rs.getBytes(8));
				tb.setPrice(rs.getString(9));
				list.add(tb);
			}
			pst.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
public List<RestaurantBean> getOrders()
{
	
	List<RestaurantBean> list=new ArrayList<RestaurantBean>();
	try
	{
		
		pst=con.prepareStatement("select o.id,o.quantity,o.price,o.user_location," +
				"o.ordertime,o.dead_line,r.name,r.location,r.food from orders o inner join restaurant r on r.id=o.res_id where o.status='PENDING'");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			RestaurantBean tb=new RestaurantBean();
			tb.setId(rs.getInt(1));
			tb.setQuantity(rs.getInt(2));
			tb.setPrice(rs.getString(3));
			tb.setUserLocation(rs.getString(4));
			tb.setOrderTime(rs.getTimestamp(5));
			tb.setDeadLine(rs.getString(6));
			tb.setRestaurantName(rs.getString(7));
			tb.setLocation(rs.getString(8));
			tb.setFood(rs.getString(9));
			list.add(tb);
		}
		pst.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return list;
}


public List<RestaurantBean> getOrdersByCystomer(String id)
{
	
	List<RestaurantBean> list=new ArrayList<RestaurantBean>();
	try
	{
		
		pst=con.prepareStatement("select o.id,o.quantity,o.price,o.user_location," +
				"o.ordertime,o.dead_line,r.name,r.location,r.food,o.status from orders o inner join restaurant r on r.id=o.res_id where o.user_id=?");
		pst.setString(1, id);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			RestaurantBean tb=new RestaurantBean();
			tb.setId(rs.getInt(1));
			tb.setQuantity(rs.getInt(2));
			tb.setPrice(rs.getString(3));
			tb.setUserLocation(rs.getString(4));
			tb.setOrderTime(rs.getTimestamp(5));
			tb.setDeadLine(rs.getString(6));
			tb.setRestaurantName(rs.getString(7));
			tb.setLocation(rs.getString(8));
			tb.setFood(rs.getString(9));
			tb.setStatus(rs.getString(10));
			list.add(tb);
		}
		pst.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return list;
}


	public int saveOrder(RestaurantBean rb) {
		try
		{
		pst=con.prepareStatement("insert into orders(id,res_id,quantity,price,user_location,ordertime,dead_line,status,user_id) values((SELECT NVL(MAX(id),0)+1 FROM orders),?,?,?,?,?,?,?,?)");
		pst.setInt(1,rb.getId());
		pst.setInt(2,rb.getQuantity());
		pst.setString(3,rb.getPrice());
		pst.setString(4,rb.getUserLocation());
		pst.setTimestamp(5,rb.getOrderTime());
		pst.setString(6,rb.getDeadLine());
		pst.setString(7,rb.getStatus());
		pst.setString(8,rb.getUserId());
		return pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}




	public int addRoute(String start, String end, String points) {
		try
		{
		pst=con.prepareStatement("insert into routes(id,source,destination,points) values((SELECT NVL(MAX(id),0)+1 FROM routes),?,?,?)");
		pst.setString(1,start);
		pst.setString(2,end);
		pst.setString(3,points);
		return pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}



	public int saveOwnTaxiDriver(TaxiDriverBean t) {
		int i=0;
		try
		{
		pst=con.prepareStatement("insert into owntaxi(id,name,phone,email,source,destination) values((SELECT NVL(MAX(id),0)+1 FROM owntaxi),?,?,?,?,?)");
		pst.setString(1,t.getName());
		pst.setString(2,t.getPhone() );
		pst.setString(3,t.getEmail());
		pst.setString(4,t.getSource());
		pst.setString(5, t.getDestination());
		pst.executeUpdate();
		 
		pst=con.prepareStatement("select id,user_location from orders where status='PENDING'");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			String userLocation=rs.getString(2);
			PreparedStatement p=con.prepareStatement("select * from routes where source=?");
			p.setString(1,t.getSource());
			ResultSet r=p.executeQuery();
			while(r.next())
			{
				if(userLocation.equals(r.getString(3)))
				{
					PreparedStatement pr=con.prepareStatement("update orders set status='ASSIGNED' where id=?");
					pr.setInt(1,rs.getInt(1));
					pr.executeUpdate();
					pr.close();
					i++;
				}
				else
				{
					String points[]=r.getString(4).split(",");
					for(String s:points)
					{
						if(userLocation.equals(s))
						{
							PreparedStatement pr=con.prepareStatement("update orders set status='ASSIGNED' where id=?");
							pr.setInt(1,rs.getInt(1));
							pr.executeUpdate();
							pr.close();
							i++;
						}
					}
				}
			}
			
		}
		
		
		
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}
	
	
}
		
		


	
	
	
	
	

	
	


