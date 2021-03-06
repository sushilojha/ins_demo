<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<div class="panel panel-default ">
					<div class="panel-heading">
						<h3 class="panel-title lead text-center">
							<strong>Vehicle Information</strong>
						</h3>
					</div>
					<div class="panel-body">
						<div id="upload">
							<h5 class="text-center">Upload a photo of your license plate</h5>
							<div class="text-center">
								<input type="file" class="btn btn-default form-control"><input type="button" class="btn md" name="upload" > 
							</div>

							<h5 class="text-center">Or enter your Vehicle Registration Number</h5>
							<div class="text-center col-md-12">
								<input class="form-control" type="text" id="vin"
									placeholder="VIN Number">
							</div>
							<p>&nbsp;</p>
							<div class="text-right">
								<a id="link_upload" href="#">I want to enter by car details
									manually</a>
							</div>
						</div>

						<div id="manual">
							<form class="form-horizontal">
								<div class="form-group">
									<label class="col-md-3 control-label" for="year">Year</label>
									<div class="col-md-8">
										<select name="year" class="form-control" id="year"></select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label" for="Make">Make</label>
									<div class="col-md-8">
										<select name="make" class="form-control" id="make"></select>
									</div>
								</div>

								<div class="form-group">
									<label class="col-md-3 control-label" for="model">Model</label>
									<div class="col-md-8">
										<select name="model" class="form-control" id="model"></select>
									</div>
								</div>

								<div class="form-group">
									<label class="col-md-3 control-label" for="style">Body
										Style</label>
									<div class="col-md-8">
										<select name="style" class="form-control" id="style"></select>
									</div>
								</div>


								<div class="form-group">

									<label class="col-md-3 control-label" for="lzip">Zip</label>
									<div class="col-md-8">
										<input class="form-control" type="text" id="lzip"
											placeholder="Zip">
									</div>
								</div>
							</form>
							<p>&nbsp;</p>
							<div class="text-right">
								<a id="link_manual" href="#">Upload a picture or add VIN</a>
							</div>
						</div>
					</div>
				</div>

				<div class="text-center">
					<button type="button" class="btn btn-primary">Add Vehicle</button>
				</div>
			</div>



			<div class="col-md-5">

				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title lead text-center">
							<strong>Driver Information</strong>
						</h3>
					</div>
					<div class="panel-body">
						<form class="form-horizontal">
							<div class="form-group">
								<label class="col-md-3 control-label" for="fn">First
									Name</label>
								<div class="col-md-8">
									<input class="form-control" type="text" id="fn"
										placeholder="First Name">
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-3 control-label" for="ln">Last Name</label>
								<div class="col-md-8">
									<input class="form-control" type="text" id="ln"
										placeholder="Last Name">
								</div>

							</div>
							<div class="form-group">
								<label class="col-md-3 control-label" for="dob">Date of
									Birth</label>
								<div class="col-md-8">
									<div class='input-group date' id='datetimepicker7'>
										<input type='text' class="form-control" id="dob"
											placeholder="Date of Birth" /> <span
											class="input-group-addon"><span
											class="glyphicon glyphicon-calendar"></span> </span>
									</div>

								</div>
							</div>
							<div class="form-group">

								<label class="col-md-3 control-label" for="zip">Zip</label>
								<div class="col-md-8">
									<input class="form-control" type="text" id="zip"
										placeholder="Zip">
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-3 control-label" for="rth">Relationship
									to Household</label>
								<div class="col-md-8">
									<input class="form-control" type="text" id="rth"
										placeholder="Relationship">
								</div>
							</div>
						</form>
					</div>
				</div>
				<div class="text-center">
					<button type="button" class="btn btn-primary">Add Driver</button>
				</div>

			</div>
		</div>
	</div>


	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script language="JavaScript" type="text/javascript"
		src="js/jquery-1.11.1.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
	<script src="js/autoquote.js"></script>

</body>
</html>