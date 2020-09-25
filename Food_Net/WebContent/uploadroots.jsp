
<%
String user=(String)session.getAttribute("userId");
if(user==null)
{
response.sendRedirect("login.jsp?status=Please Enter username and password");
}
 %>
<script>

var index = [];
// Array starts with 0 but the id start with 0 so push a dummy value
index.push(0);
// Push 1 at index 1 since one child element is already created
index.push(1)

function addkid() {
  
  var div = document.createElement('div');
  var id = getID();
  // Set this attritube id so that we can access this element using Id 
  div.setAttribute("id","Div_"+id);
  
  document.getElementById("p").value=id;
  
  div.innerHTML = 'Point ' + id + ': <table><tr><td><input type="text" name="point_' + id + '" style="height: 40px;" required/></td>' + '<td> <input type="button" class="btn btn-success" style="height: 40px;"  id="add_kid()_' + id + '" onclick="addkid()" value="+" /></td>' + ' <td><input type="button" id="rem_kid()_' + id + '" class="btn btn-danger" style="height: 40px;" onclick="remkid('+id+')" value="-" /></td></tr></table>';
  // inside of passing this parameter in remkid we pass id number
  document.getElementById('kids').appendChild(div);
}
   
function remkid(id) {

// use the id arugment to get the div element using unique id set in addkid
  try{
var element = document.getElementById("Div_"+id)

element.parentNode.removeChild(element);
    index[id] = -1;
    //id number is = index of the array so we set to -1 to indicate its empty
    
    document.getElementById("p").value=id-1;
    }
  catch(err){
    alert("id: Div_"+id)
    alert(err)
    
    }
}  
 function getID(){
   var emptyIndex = index.indexOf(-1);
   if (emptyIndex != -1){
     index[emptyIndex] = emptyIndex
     
     return emptyIndex
   } else {
   emptyIndex = index.length
   index.push(emptyIndex)
   return emptyIndex
     }
   }

</script>
<jsp:include page="header.jsp"></jsp:include>
<!-- END section -->

<section class="site-section element-animate">
	<div class="container">
		<div class="row">
			<div class="col-md-8 pr-md-5">
				<form action="UploadRoot" method="get" enctype="multipart/form-data">
					<h3>
						<font color='red'><b><u>Upload Root Details:</u></b></font>
					</h3>
					<br />

					<div class="row">

						<div class="col-md-4 form-group">
							<input type="hidden" id="p" name="p" value="1" /> <label
								for="email">Starting Location</label> <input type="text"
								id="point" name="starting" value="" required />


							<div id="kids">
								Point 1:
								<table>
									<tr>
										<td><input type="text" name="point_1"
											style="height: 40px;" required></td>
										<td><input type="button" id="add_kid()_1"
											class="btn btn-success" style="height: 40px;"
											onclick="addkid()" value="+" /></td>
									</tr>
								</table>


							</div>


							<label for="email">Ending Location</label> <input type="text"
								id="point" name="ending" value="" required />
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