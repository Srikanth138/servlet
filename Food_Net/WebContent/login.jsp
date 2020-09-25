
<jsp:include page="header.jsp"></jsp:include>
<!-- END section -->

<section class="site-section">
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-7">
				<div class="form-wrap">
					<h2 class="mb-4">Log in with your account</h2>
					<form action="LoginController" method="post">
						<div class="row">
							<div class="col-md-12 form-group">
								<label for="name"> Username </label> <input type="text"
									id="name" name="userId" class="form-control py-2" required>
							</div>
						</div>
						<div class="row mb-5">
							<div class="col-md-12 form-group">
								<label for="name"> Password </label> <input type="password"
									id="name" name="password" class="form-control py-2" required>
							</div>
						</div>

						<div class="row">
							<div class="col-md-6 form-group">
								<input type="submit" value="Login"
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