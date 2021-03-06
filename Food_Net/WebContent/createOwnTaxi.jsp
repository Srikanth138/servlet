
<%@page import="com.nit.dao.UserDAO"%>
<%@page import="java.util.TreeSet"%><jsp:include page="header.jsp"></jsp:include>
<!-- END section -->

<section class="site-section element-animate">
	<div class="container">
		<div class="row">
			<div class="col-md-8 pr-md-5">
				<form action="UploadOwnTaxi" method="get">
					<h3>
						<font color='red'><b><u>Taxi Driver Details:</u></b></font>
					</h3>
					<br />
					<div class="row">
						<div class="col-md-4 form-group">
							<label for="email">Name</label> <input type="text" name="name"
								class="form-control py-2" required>
						</div>
						<div class="col-md-4 form-group">
							<label for="phone">Phone</label> <input type="text" name="phone"
								pattern="[6-9]{1}[0-9]{9}"
								title="10 Digits Mobile Number(Ex:9848022338)"
								class="form-control py-2" required>
						</div>
						<div class="col-md-4 form-group">
							<label for="email">Email</label> <input type="email" name="email"
								class="form-control py-2" required>
						</div>

						<div class="col-md-4 form-group">
							<label for="email">Source Location</label> <select name="source"
								class="form-control py-2" required>
								<%
                      UserDAO dao=new UserDAO();
                      TreeSet<String> list=dao.getLocations();
                      if(!list.isEmpty() && list.size()>0)
                      {
                      for(String str:list)
                      {
                      %>
								<option><%=str %></option>
								<%
                      }
                      }
                      
                       %>
							</select>
						</div>


						<div class="col-md-4 form-group">
							<label for="email">Destination Location</label> <select
								name="destination" class="form-control py-2" required>
								<%
                      TreeSet<String> list1=dao.getLocations();
                      if(!list1.isEmpty() && list1.size()>0)
                      {
                      for(String str:list)
                      {
                      %>
								<option><%=str %></option>
								<%
                      }
                      }
                      
                       %>
							</select>
						</div>

					</div>





					<div class="row">
						<div class="col-md-6 form-group">
							<input type="submit" value="Upload" class="btn btn-primary">
						</div>
					</div>
				</form>
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