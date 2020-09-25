package test;
import javax.servlet.*;
import javax.servlet.http.*;
public class CountUserListener implements HttpSessionListener{
	public static ServletContext ctx=null;
	public static int total=0,current=0;
	public void sessionCreated(HttpSessionEvent e){
		total++;
		current++;
		
		ctx=e.getSession().getServletContext();
		ctx.setAttribute("totalusers", total);
		ctx.setAttribute("currentusers", current);
		System.out.println("Session created....");
	}
	public void sessionDestroyed(HttpSessionEvent e){
		current--;
		ctx.setAttribute("currentusers", current);
		System.out.println("Session Destroyed....");
	}
}
