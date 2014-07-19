<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>

<!-- font awesome css -->
<link
	href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css"
	rel="stylesheet">
</head>

<div id="fb-root"></div>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<script type="text/javascript"
	src="<tiles:insertAttribute name="pageScript"/>"></script>
<body>



	<div class="container" style="margin-top: 0px;">
		<div class="row">
			<div class="col-md-12">
				<tiles:insertAttribute name="header" />
			</div>
		</div>


		<div class="row">
			<div class="col-md-12">
				<tiles:insertAttribute name="progressbar" />
			</div>
		</div>
		<div class="row">
			<div class="col-md-9">
				<tiles:insertAttribute name="body" />
			</div>
			<div class="col-md-3">
				<tiles:insertAttribute name="menu" />
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<tiles:insertAttribute name="footer" />
			</div>
		</div>
	</div>

</body>
</html>