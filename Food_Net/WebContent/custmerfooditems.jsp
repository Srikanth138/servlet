
<%
String user=(String)session.getAttribute("userId");
if(user==null)
{
response.sendRedirect("login.jsp?status=Please Enter username and password");
}
 %>
<%@page import="com.nit.dao.UserDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.nit.beans.RestaurantBean"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>

<jsp:include page="header.jsp"></jsp:include>
<!-- END section -->

<div class="site-section bg-light">
	<div class="container">
		<div class="row">

			<div class="col-md-6 col-lg-8 order-md-2">
				<div class="row">
					<%
            UserDAO dao=new UserDAO();
            List<RestaurantBean> list=null;
            if(request.getParameter("search")==null)
            {
            list=dao.getFoodItems();
            }
            else
            {
            String s=request.getParameter("search");
            list=dao.getFoodItems(s);
            }


            System.out.println("sie---"+list.size());
            if(!list.isEmpty() && list.size()>0)
            {
            int i=0;
            for(RestaurantBean rb:list)
            {
              i++;
			session.setAttribute(i+"img", rb.getImageBytes());
			
            %>

					<div class="col-md-12 col-lg-6 mb-5">
						<div class="block-19">
							<figure>

								<a href="course-single.html"><img src="image.jsp?val=<%=i%>"
									alt="Image" height="230" width="295"></a>
							</figure>
							<div class="text">
								<h2 class="heading">
									<a href=""><%= rb.getRestaurantName()%> </a>
								</h2>
								<p class="mb-4"><%=rb.getFood() %><br />
									<%=rb.getLocation() %></p>
								<div class="meta d-flex align-items-center">
									<div class="number">
										<span>Rs.<%=rb.getPrice() %></span>
									</div>
									<div class="price text-right">
										<del class="mr-3"></del>

										<a
											href="customerOrder.jsp?id=<%=rb.getId() %>&name=<%=rb.getRestaurantName() %>&food=<%=rb.getFood() %>&location=<%=rb.getLocation() %>&price=<%=rb.getPrice() %>"><span>Order</span></a>

									</div>
								</div>
							</div>
						</div>

					</div>


					<%
            }
            }
            
             %>



				</div>
			</div>


			<div class="modal fade" id="order" role="dialog">
				<div class="modal-dialog modal-md">
					<div class="modal-content">

						<form action="./AdminAcceptOrder" method="get" name="myForm">
							<div class="modal-header">
								<center>
									<!--<button type="button" class="close" data-dismiss="modal">&times;</button>
							-->
									<h4 class="modal-title">Food Order</h4>
							</div>
							<div class="modal-body">

								<font color="blue"><b>Restaurant Name</b></font> <br> <input
									type="text" name="name" id="na" class="form-control"
									readonly="readonly" /><br /> <font color="blue"><b>Restaurant
										Location</b></font> <br> <input type="text" name="location" id="lo"
									class="form-control" readonly="readonly" /><br /> <font
									color="blue"><b>User Location</b></font> <br> <input
									type="text" name="location" id="lo" class="form-control"
									required /><br />




							</div>

							<div class="modal-footer">
								<button type="button" class="btn btn-seconday"
									data-dismiss="modal">Close</button>
								<input type="submit" class="btn btn-primary"
									value="Save changes">
							</div>
						</form>



					</div>
				</div>
			</div>




			<!-- END content -->
			<div class="col-md-6 col-lg-4 order-md-1">

				<div class="block-24 mb-5">
					<h3 class="heading">Foods</h3>
					<ul>
						<%
               Map<String,Integer>  data=dao.getFoodsCategories();
               System.out.println("size--size-"+data.size());
               if(!data.isEmpty() && data.size()>0)
               {
               for(String i:data.keySet())
               {
               %>
						<li><a href="#" onclick="return false;"><%=i %><span><%=data.get(i) %></span></a></li>
						<%
               }
               }
                %>


					</ul>
				</div>





			</div>
			<!-- END Sidebar -->
		</div>
	</div>
</div>



<!--<div class="py-5 block-22">
      <div class="container">
        <div class="row align-items-center">
          <div class="col-md-6 mb-4 mb-md-0 pr-md-5">
            <h2 class="heading">Create cool websites</h2>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nisi accusantium optio und.</p>
          </div>
          <div class="col-md-6">
            <form action="#" class="subscribe">
              <div class="form-group">
                <input type="email" class="form-control email" placeholder="Enter email">
                <input type="submit" class="btn btn-primary submit" value="Subscribe">
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  
    -->
<footer class="site-footer">
	<div class="container">
		<!--<div class="row mb-5">
          <div class="col-md-6 col-lg-3 mb-5 mb-lg-0">
            <h3>University</h3>
            <p>Perferendis eum illum voluptatibus dolore tempora consequatur minus asperiores temporibus.</p>
          </div>
          <div class="col-md-6 col-lg-3 mb-5 mb-lg-0">
            <h3 class="heading">Quick Link</h3>
            <div class="row">
              <div class="col-md-6">
                <ul class="list-unstyled">
                  <li><a href="#">Home</a></li>
                  <li><a href="#">About Us</a></li>
                  <li><a href="#">Courses</a></li>
                  <li><a href="#">Pages</a></li>
                </ul>
              </div>
              <div class="col-md-6">
                <ul class="list-unstyled">
                  <li><a href="#">News</a></li>
                  <li><a href="#">Support</a></li>
                  <li><a href="#">Contact</a></li>
                  <li><a href="#">Privacy</a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3 mb-5 mb-lg-0">
            <h3 class="heading">Blog</h3>
            <div class="block-21 d-flex mb-4">
              <div class="text">
                <h3 class="heading mb-0"><a href="#">Consectetur Adipisicing Elit</a></h3>
                <div class="meta">
                  <div><a href="#"><span class="ion-android-calendar"></span> May 29, 2018</a></div>
                  <div><a href="#"><span class="ion-android-person"></span> Admin</a></div>
                  <div><a href="#"><span class="ion-chatbubble"></span> 19</a></div>
                </div>
              </div>
            </div>  
            <div class="block-21 d-flex mb-4">
              <div class="text">
                <h3 class="heading mb-0"><a href="#">Dolore Tempora Consequatur</a></h3>
                <div class="meta">
                  <div><a href="#"><span class="ion-android-calendar"></span> May 29, 2018</a></div>
                  <div><a href="#"><span class="ion-android-person"></span> Admin</a></div>
                  <div><a href="#"><span class="ion-chatbubble"></span> 19</a></div>
                </div>
              </div>
            </div>  
            <div class="block-21 d-flex mb-4">
              <div class="text">
                <h3 class="heading mb-0"><a href="#">Perferendis eum illum</a></h3>
                <div class="meta">
                  <div><a href="#"><span class="ion-android-calendar"></span> May 29, 2018</a></div>
                  <div><a href="#"><span class="ion-android-person"></span> Admin</a></div>
                  <div><a href="#"><span class="ion-chatbubble"></span> 19</a></div>
                </div>
              </div>
            </div>  
          </div>
          <div class="col-md-6 col-lg-3 mb-5 mb-lg-0">
            <h3 class="heading">Contact Information</h3>
            <div class="block-23">
              <ul>
                <li><span class="icon ion-android-pin"></span><span class="text">203 Fake St. Mountain View, San Francisco, California, USA</span></li>
                <li><a href="#"><span class="icon ion-ios-telephone"></span><span class="text">+2 392 3929 210</span></a></li>
                <li><a href="#"><span class="icon ion-android-mail"></span><span class="text">info@yourdomain.com</span></a></li>
                <li><span class="icon ion-android-time"></span><span class="text">Monday &mdash; Friday 8:00am - 5:00pm</span></li>
              </ul>
            </div>
          </div>
        </div>
        -->
		<div class="row pt-5">
			<div class="col-md-12 text-center copyright">

				<p class="float-md-left">
					<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
					<!--
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank" class="text-primary">Colorlib</a>
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



<div class="modal fade" id="accept" role="dialog">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">

			<form action="./AdminAcceptOrder" method="get" name="myForm">
				<div class="modal-header">
					<center>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Reject Order</h4>
				</div>
				<div class="modal-body">
					<input type="hidden" name="rid" value="" id="rid"> <input
						type="hidden" name="reject" value="reject"> <font
						color="blue"><b>Comment</b></font> <br>
					<textarea rows="3" cols="4" class="form-control" name="comment"
						required> </textarea>


				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-seconday" data-dismiss="modal">Close</button>
					<input type="submit" class="btn btn-primary" value="Save changes">
				</div>
			</form>
		</div>
	</div>
</div>


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

<script src="js/main.js"></script>


<script type="text/javascript">

$(function(){


 $(".open-Order").click(function(){
		  $('#na').val($(this).data('na'));
		  $('#lo').val($(this).data('lo'));
	    $("#order").modal("show");
	  });
	  
	  
	  
	  $(".open-Accept").click(function(){
		   $('#aid').val($(this).data('id'));
		  
	    $("#accept").modal("show");
	  });
	  
	  
	  
	  
});
	  
	 


</script>

</body>
</html>