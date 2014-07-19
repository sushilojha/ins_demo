<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<div id="fb-root">&nbsp;</div>
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery.equalheights.js"></script>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<script type="text/javascript" src="<tiles:insertAttribute name="pageScript"/>"></script>
</head>
<body>
 
	<div class="container">
		<div class="row">
			<div class="col-md-12 ">
				<tiles:insertAttribute name="header" />
			</div>
		</div>
		<div class="row">
			<div class="col-md-9 nopaddingright">
				<tiles:insertAttribute name="body" />
			</div>
			<div class="col-md-3 ">
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