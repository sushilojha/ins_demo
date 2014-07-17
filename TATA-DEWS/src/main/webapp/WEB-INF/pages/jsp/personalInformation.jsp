<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form method="post" commandname="PersonalinfoBean" action="/autoQuote.htm">
 <div class="col-md-12">
	 	 <h3>Personal Information</h3>
	 	 <p>Tell us something about yourself or upload an image of your driving license</p>
 </div>
 
 <div id="generalInfo"></div>
 <div class="col-md-12">
	<div class="col-md-4" >
	  <div class="panel panel-default">
		  <div class="panel-heading">
 			 <h1 class="panel-title">Your Name</h1>
 		  </div>
 		  <div class="panel-body">
	 		  <form class="form-horizontal">
	 		     <div class="form-group">
		 		     <div class="col-md-8">
		 		        <input class="form-control"  type="text" id="firstName" name="firstName"  placeholder="First Name" required>
		 		     </div>
		 		     <div class="col-md-4">
		 		        <input type="text"  id="middleInitial" name="middleInitial" class="form-control"  placeholder="MI" required >
		 		     </div>
	 		     </div>
	 		     <div class="form-group">
		 		     <div class="col-md-7">
		 		        <input type="text" id="lastName" name="lastName" class="form-control" maxlength="20" placeholder="Last"  required >
		 		     </div>
		 		     <div class="col-md-5">
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
    <div class="col-md-4">
	    <div class="panel panel-default ">
			 <div class="panel-heading">
	 			 <h1 class="panel-title">Where do you live?</h1>
	 		  </div>
	 		  <div class="panel-body">
	 		     <form class="form-horizontal">
	 		          <div class="form-group">
		 		           <div class="col-md-8">
		 		              	<input type="text" id="street" name="street" class="form-control"  placeholder="Street Address" required >
		 		           </div>
		 		           <div class="col-md-4">
		 		                <input type="text" id="apt" name="apt" class="form-control" placeholder="Apt/Suite" required >
		 		           </div>
	 		          </div>
	 		          <div class="form-group">
	 		          	  <div class="col-md-8">
	 		          	  	  <input type="text" id="city" name="city" class="form-control"  placeholder="city" required >
	 		          	  </div>
	 		          	  <div class="col-md-4">
	 		          	      <select name="state" class="form-control col-sm-1">
				 	      		<option value="state">State</option>
				 	    		<option value="IL">IL</option> 
				 		  		<option value="IN">IN</option>
				 		  		<option value="Tamil Nadu">other</option>
				 	 		  </select>
	 		          	  </div>
	 		          </div>
	 		          <div class="form-group">
	 		          	  <div class="col-md-4">
	 		          	  	  <input type="text" id="zip" name="zip" class="form-control"  placeholder="Zip" required >
	 		          	  </div>
	 		           </div>
	 		     </form>
	 		  </div>
	    </div>
    </div>
    <div class="col-md-4">
     <div  class="panel panel-default ">
		 <div class="panel-heading">
 			 <h1 class="panel-title">When were you born?</h1>
 		  </div>
 		  <div class="panel-body">
 		      <div class="col-md-8">
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
    <input type="submit" value="Next" > 
  </div>  
  
 </form:form>  
