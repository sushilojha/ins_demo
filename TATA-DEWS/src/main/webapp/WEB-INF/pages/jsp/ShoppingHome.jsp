<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>


	<form:form id="productSelectForm" method="get">

		<input type="hidden" id="ziphide">
		<div class="panel panel-primary">
			<div id="area" class="panel-heading">
				<h3 class="panel-title lead text-center">
					<strong>Products Available in your Area</strong>
				</h3>
			</div>
			<div class="panel-body">
				<div class="col-md-12">
					<a href="#" id="zipchange">Change your zip if this is not
						yours.</a>
				</div>
				<form class="form-horizontal">
					<div id="zipform" class="form-group">

						<label class="col-md-3 control-label" for="lzip">Your Zip</label>
						<div class="col-md-5">

							<input class="form-control" type="text" id="lzip"
								placeholder="Zip">
						</div>
						<div class="col-md-3">
							<button id="bzip" type="button" class="btn btn-primary">Go</button>
						</div>
					</div>
				</form>



				<c:if test="${selectedProducts.isAutoIndicator()}">
					<div class="col-md-4">
						<div class="panel panel-primary">
							<div class="panel-heading">
								<h1 class="panel-title">Auto Insurance</h1>
							</div>
							<div class="panel-body">
								<form class="form-horizontal">
									<div class="form-group">
										<div class="col-md-4 pull-left">
											<img alt="" src="/TATA-DEWS/images/auto-promo-img_opt.png"
												class="img-rounded" />
										</div>
									</div>
									<div class="form-group">

										<div class="col-md-5">
											<input type="button" class="btn btn-primary"
												value="Get Quote" id="addAuto"
												onclick="SelectedProduct('/TATA-DEWS/dews/dewsLanding.htm')" />
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</c:if>
				<c:if test="${selectedProducts.isHomeIndicator()}">
					<div class="col-md-4">

						<div class="panel panel-primary">
							<div class="panel-heading">
								<h1 class="panel-title">Home Insurance</h1>
							</div>
							<div class="panel-body">
								<form class="form-horizontal">
									<div class="form-group">
										<div class="col-md-4 pull-left">
											<img alt="" src="/TATA-DEWS/images/home-promo-img_opt.png"
												class="img-rounded" />
										</div>
									</div>
									<div class="form-group">

										<div class="col-md-5">
											<input type="button" class="btn btn-primary"
												value="Add to bundle" id="addHomeOwners"
												onclick="SelectedProduct('/bundle?productId=Home')" />
										</div>
									</div>
								</form>
							</div>
						</div>

					</div>
				</c:if>
				<c:if test="${selectedProducts.isAutoHomeIndicator()}">
					<div class="col-md-4">
						<div class="panel panel-primary">
							<div class="panel-heading">
								<h1 class="panel-title">Life Insurance</h1>
							</div>
							<div class="panel-body">
								<form class="form-horizontal">
									<div class="form-group">
										<div class="col-md-4 pull-left">
											<img alt="" src="/TATA-DEWS/images/life-promo-img_opt.png"
												class="img-rounded" />
										</div>
									</div>
									<div class="form-group">

										<div class="col-md-5">
											<input type="button" class="btn btn-primary"
												value="Add to bundle" id="addAutoHome"
												onclick="SelectedProduct('/bundle?productId=AutoHome')" />
										</div>
									</div>
								</form>
							</div>

						</div>
					</div>
				</c:if>
			</div>
		</div>
	</form:form>
</body>
</html>