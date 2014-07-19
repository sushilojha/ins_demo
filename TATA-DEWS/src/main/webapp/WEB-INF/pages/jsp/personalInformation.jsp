<style>
.padding-sm {
   padding: 1 !important;
   margin: 1 !important;
}
.nopadding {
   padding: 0 !important;
   margin: 0 !important;
}
.nopaddingright{
 	padding-right: 0 !important;
    margin-right: 0 !important;
}
.nopaddingleft{
 	padding-left: 0 !important;
    margin-left: 0 !important;
}
.padding2px{
 	padding: 2px !important;
    margin: 2px !important;
}
.equal, .equal > div[class*='col-'] {  
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    flex:1 0 auto;
}
</style>
<script>
$('#equalheight div').equalHeights();
</script>
<div class="col-md-12 nopadding">
<div class="col-md-12 nopadding">
	 	 <h3>Personal Information</h3>
</div>
<div class="row equal" >
<div class="col-md-8 col-md-4 ">
	<div class="panel panel-primary">
	 <div class="panel-heading">
 			 <h1 class="panel-title">Your Name</h1>
 		  </div>
 		  <div class="panel-body">
	 		  <form class="form-horizontal">
	 		     <div class="form-group">
		 		     <div class="col-md-7 padding2px ">
		 		        <input class="form-control"  type="text" id="firstName" name="firstName"  placeholder="First Name" required>
		 		     </div>
		 		     <div class="col-md-4 padding2px">
		 		        <input type="text"  id="middleInitial" name="middleInitial" class="form-control"  placeholder="MI" required >
		 		     </div>
	 		     </div>
	 		     <div class="form-group">
		 		     <div class="col-md-7 padding2px">
		 		        <input type="text" id="lastName" name="lastName" class="form-control" maxlength="20" placeholder="Last"  required >
		 		     </div>
		 		     <div class="col-md-4 padding2px">
			 		     <select name="suffix" class="form-control col-sm-1">
					 	      <option value="suffix">Suffix</option>
					 	      <option value="Mr">Mr</option> 
					 		  <option value="Ms">Ms</option>
					 	 </select>
		 		     </div>
	 		     </div>
			  </form>	
 		  </div>
	</div>
</div>
<div class="col-md-8 col-md-4 nopadding">
	<div class="panel panel-primary">
	 	 <div class="panel-heading">
	 			 <h1 class="panel-title">Where do you live?</h1>
	 		  </div>
	 		  <div class="panel-body">
	 		     <form class="form-horizontal">
	 		          <div class="form-group">
		 		           <div class="col-md-7 padding2px">
		 		              	<input type="text" id="street" name="street" class="form-control"  placeholder="Street Address" required >
		 		           </div>
		 		           <div class="col-md-4 padding2px">
		 		                <input type="text" id="apt" name="apt" class="form-control" placeholder="Apt/Suite" required >
		 		           </div>
	 		          </div>
	 		          <div class="form-group">
	 		          	  <div class="col-md-7 padding2px">
	 		          	  	  <input type="text" id="city" name="city" class="form-control"  placeholder="city" required >
	 		          	  </div>
	 		          	  <div class="col-md-4 padding2px">
	 		          	      <select name="state" class="form-control col-sm-1">
				 	      		<option value="state">State</option>
				 	    		<option value="IL">IL</option> 
				 		  		<option value="IN">IN</option>
				 		  		<option value="Tamil Nadu">other</option>
				 	 		  </select>
	 		          	  </div>
	 		          </div>
	 		          <div class="form-group">
	 		          	  <div class="col-md-5 padding2px">
	 		          	  	  <input type="text" id="zip" name="zip" class="form-control"  placeholder="Zip" required >
	 		          	  </div>
	 		           </div>
	 		     </form>
	 		  </div>
	</div>
</div>
<div class="col-md-8 col-md-4 ">
	<div class="panel panel-primary">
		<div class="panel-heading">
 			 <h1 class="panel-title">When were you born?</h1>
 		  </div>
 		  <div class="panel-body">
 		      <div class="col-md-8 nopadding">
	 		      <div class='input-group date' id='datetimepicker7'>
						<input type='text' class="form-control" id="dob" placeholder="Date of Birth" /> 
						<span  class="input-group-addon">
							<span  class="glyphicon glyphicon-calendar"></span> 
						</span>
				  </div>
			 </div>
          </div>
	</div>
</div>
</div>
</div>