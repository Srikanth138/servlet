
<%
String user=(String)session.getAttribute("userId");
if(user==null)
{
response.sendRedirect("login.jsp?status=Please Enter username and password");
}
 %>
<%@page import="com.nit.dao.UserDAO"%>
<%@page import="java.util.TreeSet"%>
<%@page import="java.util.List"%>
<%@page import="com.nit.controller.CustomerOrder"%>
<%@page import="com.nit.beans.RestaurantBean"%>
<%@page import="java.util.Set"%><jsp:include page="header.jsp"></jsp:include>
<!-- END section -->

<section class="site-section element-animate">
	<div class="container">



		<%
            UserDAO dao=new UserDAO();
            
			List<RestaurantBean> list=dao.getOrdersByCystomer((String)session.getAttribute("userId"));
			if(!list.isEmpty() && list.size()>0)
			{
			%>
		<table class="table">
			<tr>
				<th>Food</th>
				<th>Quantity</th>
				<th>Price</th>
				<th>User Loc</th>
				<th>Order Time</th>
				<th>Dead Line</th>
				<th>Res Name</th>
				<th>Res Loc</th>
				<th>Status</th>
			</tr>


			<%
			
			for(RestaurantBean rb:list)
			{
			
			%>
			<tr>
				<td><%=rb.getFood() %></td>
				<td><%=rb.getQuantity() %></td>
				<td><%=rb.getPrice() %></td>
				<td><%=rb.getUserLocation()%></td>
				<td><%=rb.getOrderTime() %></td>
				<td><%=rb.getDeadLine() %> Mins</td>
				<td><%=rb.getRestaurantName() %></td>
				<td><%=rb.getLocation() %></td>
				<td><%=rb.getStatus() %></td>
			</tr>
			<%
			}
			}



             %>
		</table>


	</div>
	<!--
          <div class="col-md-4">
            
            <div class="block-23">
              <h3 class="heading mb-5">Contact Information</h3>
              <ul>
                <li><span class="icon ion-android-pin"></span><span class="text">203 Fake St. Mountain View, San Francisco, California, USA</span></li>
                <li><a href="#"><span class="icon ion-ios-telephone"></span><span class="text">+2 392 3929 210</span></a></li>
                <li><a href="#"><span class="icon ion-android-mail"></span><span class="text">info@yourdomain.com</span></a></li>
                <li><span class="icon ion-android-time"></span><span class="text">Monday &mdash; Friday 8:00am - 5:00pm</span></li>
              </ul>
            </div>
          </div>
          
        -->
	</div>

	</div>
</section>
<!-- END section -->



<footer class="site-footer">
	<div class="container">

		<div class="row pt-5">
			<div class="col-md-12 text-center copyright">

				<p class="float-md-left">
					<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->

					<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
				</p>
				<p class="float-md-right">
					<a href="#" class="fa fa-facebook p-2"></a> <a href="#"
						class="fa fa-twitter p-2"></a> <a href="#"
						class="fa fa-linkedin p-2"></a> <a href="#"
						class="fa fa-instagram p-2"></a>

				</p>
			</div>
		</div>
	</div>
</footer>
<!-- END footer -->

<!-- loader -->
<div id="loader" class="show fullscreen">
	<svg class="circular" width="48px" height="48px">
		<circle class="path-bg" cx="24" cy="24" r="22" fill="none"
			stroke-width="4" stroke="#eeeeee" />
		<circle class="path" cx="24" cy="24" r="22" fill="none"
			stroke-width="4" stroke-miterlimit="10" stroke="#f4b214" /></svg>
</div>

<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/jquery-migrate-3.0.0.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/jquery.waypoints.min.js"></script>
<script src="js/jquery.stellar.min.js"></script>
<script src="js/jquery.animateNumber.min.js"></script>


<script
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
<script src="js/google-map.js"></script>


<script src="js/main.js"></script>
</body>
</html>