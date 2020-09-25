
<%@page import="com.nit.dao.UserDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.TreeSet"%><jsp:include page="header.jsp"></jsp:include>
<!-- END section -->

<section class="site-section">
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-7">
				<div class="form-wrap">
					<h2 class="mb-5">Register new account</h2>
					<form action="RegisterAction" method="post">
						<div class="row">
							<div class="col-md-12 form-group">
								<label for="name">User Id</label> <input type="text"
									name="userId" class="form-control py-2 " required>
							</div>
						</div>

						<div class="row">
							<div class="col-md-12 form-group">
								<label for="name">User Name</label> <input type="textt"
									name="userName" class="form-control py-2 " required>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12 form-group">
								<label for="name">Mobile</label> <input type="number"
									name="mobile" pattern="[6-9]{1}[0-9]{9}"
									title="10 Digits Mobile Number(Ex:9848022338)"
									class="form-control py-2 " required>
							</div>
						</div>

						<div class="row">
							<div class="col-md-12 form-group">
								<label for="name">Email Address</label> <input type="email"
									name="mail" class="form-control py-2">
							</div>
						</div>
						<div class="row">
							<div class="col-md-12 form-group">
								<label for="name">Password</label> <input type="password"
									name="password" class="form-control py-2 " required>
							</div>
						</div>

						<div class="row">
							<div class="col-md-12 form-group">
								<label for="name">Location</label> <select name="address"
									class="form-control py-2">
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
						</div>


						<div class="row">
							<div class="col-md-6 form-group">
								<input type="submit" value="Register"
									class="btn btn-primary px-5 py-2">
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</section>

<jsp:include page="footer.jsp"></jsp:include>