<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form:form method="post" >
 <div class="col-md-12">
	 	 <h3>Bundled Insurance Quote Summary</h3>
	 	 <p>This is the summary of your selections and quotes. If you are satisfied, add them to the cart to begin the checkout process.</p>
	 	 <p> You can edit individual selections or start over </p>
 </div>
 
 <div id="generalInfo"></div>
 <div class="col-md-12">

   	<div style="width: 100%;">
		<div style="width: 50%; float: left;">
				<div style="border: 2px solid #a1a1a1; margin-top: 20px; font-size: 15px; padding: 10px 40px; width: 550px; border-radius: 25px;">

					<h2>Auto Insurance Quote</h2>
					<div
						style="border: 2px solid #a1a1a1; margin-top: 20px; font-size: 15px; padding: 10px 40px; border-radius: 25px; padding-top: 0px; float: right;">
						US $ ${bundleItemData.policyDetails.individualTermPrice} <br />per
						year
					</div>
					<c:set var="riskItemTextualDesc"
						value="${bundleItemData.policyDetails.riskItem.textualDescription}" />
					<c:set var="coverage"
						value="${bundleItemData.policyDetails.riskItem.coverage}" />

					<c:forEach var="textualItem" items="${riskItemTextualDesc}">
						<c:forEach var="i" begin="0"
							end="${textualItem.displayData.size()}">
							<c:out value="${textualItem.displayData[i].value}"></c:out>
						</c:forEach>
					</c:forEach>
					<br />
					<c:forEach var="coveragetexTualDescription"
						items="${coverage.textualDescription}">
						<c:forEach var="i" begin="0"
							end="${coveragetexTualDescription.displayData.size()}">
							<c:out value="${coveragetexTualDescription.displayData[i].label}"></c:out>  <c:out
								value="${coveragetexTualDescription.displayData[i].value}"></c:out>
							<br />
						</c:forEach>
					</c:forEach>

					<br /> <a href="#"> Add Car </a>&nbsp; <a href="#">Edit
						Coverage </a>&nbsp; <a href="#">Remove Product </a>

				</div>

				<div
				style="border: 2px solid #a1a1a1; margin-top: 20px; font-size: 15px; padding: 10px 40px; width: 550px; border-radius: 25px;">

				<h2>Home Insurance Quote</h2>
				<div
					style="border: 2px solid #a1a1a1; margin-top: 20px; font-size: 15px; padding: 10px 40px; border-radius: 25px; float: right; padding-top: 0px;">
					US $ 729 <br />per year
				</div>
				COndo at 111 PArk Drive 08810 <br /> Personal Libaility - 750,000 <br />
				Deductible - 1000 <br /> <a style="" href="#" > Add Property </a> &nbsp; <a href="#">Edit
					Coverage </a>&nbsp; <a href="#">Remove Product </a>

			</div>
		</div>
		<div
			style="width: 50%; float: right; ">
			<!--
			<div style="margin-top: 20px; font-size: 15px; padding: 10px 40px; background: #dddddd; border-radius: 25px; margin-top: 20px; border: 2px solid #a1a1a1;">
				<h3>Info Center</h3>

				What if I am in the process of moving ? <br /> Am I eligible for a
				muliple- discount for homeowners, renters or condominium insurance ?

			
			</div>
-->

		</div>
	</div>


  </div>  
  <br />
  
 </form:form>  
