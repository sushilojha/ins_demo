<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="css/shoppingHome.css" rel="stylesheet" type="text/css" />
</head>
<div id="fb-root">&nbsp;</div>
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<script type="text/javascript"
	src="<tiles:insertAttribute name="pageScript"/>"></script>
</head>
<body>

	<div class="container">
		<!-- AddThis Button BEGIN -->
		<div
			class="addthis_toolbox addthis_floating_style addthis_32x32_style"
			style="top: 50%; background-color: transparent;">
			<a class="addthis_button_preferred_1"></a> <a
				class="addthis_button_preferred_2"></a> <a
				class="addthis_button_preferred_3"></a> <a
				class="addthis_button_preferred_4"></a> <a
				class="addthis_button_compact"></a>
		</div>

		<script type="text/javascript">
			var addthis_config = {
				"data_track_addressbar" : true
			};
		</script>
		<script type="text/javascript"
			src="//s7.addthis.com/js/300/addthis_widget.js#pubid=ra-531e86d04ea17871"></script>
		<!-- AddThis Button END -->

		<div class="row">
			<div class="col-lg-12">
				<tiles:insertAttribute name="header" />
			</div>
		</div>
		<p></p>
		<div class="row">
			<div class="col-lg-12">
				<tiles:insertAttribute name="body" />
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<tiles:insertAttribute name="footer" />
			</div>
		</div>
	</div>

	<script type="text/javascript" src="js/shoppinghome.js"></script>
</body>
</html>