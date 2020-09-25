
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<title>FoodNet</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link href="https://fonts.googleapis.com/css?family=Rubik:300,400,500"
	rel="stylesheet">

<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="fonts/ionicons/css/ionicons.min.css">
<link rel="stylesheet" href="fonts/fontawesome/css/font-awesome.min.css">
<link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">
<link rel="stylesheet" href="css/magnific-popup.css">

<!-- Theme Style -->
<link rel="stylesheet" href="css/style.css">
<script src="js/jquery.min.js"></script>
<style type="text/css">
tr:hover {
	background-color: gray;
	color: white;
}

th {
	background-color: purple;
	color: white;
}
</style>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<body>

	<header role="banner">

		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container">
				<a class="navbar-brand absolute" href="index.jsp">FoodNet</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarsExample05" aria-controls="navbarsExample05"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse navbar-light"
					id="navbarsExample05">
					<ul class="navbar-nav mx-auto">
						<c:choose>
							<c:when test="${sessionScope.role=='ADMIN'}">
								<jsp:include page="adminmenu.jsp"></jsp:include>
							</c:when>
							<c:when test="${sessionScope.role=='CUSTOMER'}">
								<jsp:include page="customermenu.jsp"></jsp:include>
							</c:when>
							<c:when test="${sessionScope.role=='RESTAURANT'}">
								<jsp:include page="restaurantmenu.jsp"></jsp:include>
							</c:when>
							<c:when test="${sessionScope.role eq null}">
								<jsp:include page="menu.jsp"></jsp:include>
							</c:when>
							<c:when test="${sessionScope.role ==''}">
								<jsp:include page="menu.jsp"></jsp:include>
							</c:when>


						</c:choose>
					</ul>

				</div>
			</div>
		</nav>
	</header>
	<!-- END header -->

	<section class="site-hero overlay" data-stellar-background-ratio="0.5"
		style="background-image: url(images/1.jpg);">
		<div class="container">
			<div
				class="row align-items-center justify-content-center site-hero-inner">
				<div class="col-md-10">

					<div class="mb-5 element-animate">
						<div class="block-17">
							<h2 class="heading text-center mb-4">Toward an Optimized
								Food Delivers Network based on Spatial Crowd Sourcing</h2>
							<form action="custmerfooditems.jsp" method="get"
								class="d-block d-lg-flex mb-4">
								<div class="fields d-block d-lg-flex">
									<!--<div class="textfield-search one-third">
                    -->
									<input type="text" name="search" class="form-control"
										placeholder="Search food...">
								</div>
								<!--
                    </div>
                  -->
								<input type="submit" class="search-submit btn btn-primary"
									value="Search">
							</form>
							<%
                String status=(String)request.getParameter("status");
                if(status!=null)
                {
                %>
							<p class="text-center mb-5" style="background-color: red;"
								class="label label-danger">
								<font color='white' size="4"><b><%=status %></b></font>
							</p>
							<%
                }else
                {
                %>
							<p class="text-center mb-5"></p>
							<%
                }
                 %>

							<p class="text-center">
								<a href="register.jsp" class="btn py-3 px-5">Register Now</a>
							</p>
						</div>
					</div>

				</div>
			</div>
		</div>
	</section>