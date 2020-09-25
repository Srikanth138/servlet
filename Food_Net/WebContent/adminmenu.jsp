<li class="nav-item"><a class="nav-link active"
	href="custmerfooditems.jsp">Home</a></li>
<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
	href="courses.html" id="dropdown04" data-toggle="dropdown"
	aria-haspopup="true" aria-expanded="false">Restaurants</a>
	<div class="dropdown-menu" aria-labelledby="dropdown04">
		<a class="dropdown-item" href="uploadRestaurant.jsp">Upload</a>

	</div></li>

<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
	href="#" id="dropdown05" data-toggle="dropdown" aria-haspopup="true"
	aria-expanded="false">Taxi Drivers</a>
	<div class="dropdown-menu" aria-labelledby="dropdown05">
		<a class="dropdown-item" href="uploadTaxiDriver.jsp">Upload
			Drivers</a> <a class="dropdown-item" href="uploadPassenger.jsp">Upload
			Passengers</a> <a class="dropdown-item" href="viewdrivers.jsp">View
			Drivers</a> <a class="dropdown-item" href="viewpassengers.jsp">View
			Passengers</a>
	</div></li>
<li class="nav-item"><a class="nav-link" href="uploadroots.jsp">Roots</a>
</li>
</ul>
<ul class="navbar-nav absolute-right">
	<li><a href="logout.jsp"><%=(String)session.getAttribute("userId") %>
			Logout</a>