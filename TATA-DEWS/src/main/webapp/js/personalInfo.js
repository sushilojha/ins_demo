
var prospectName =null;
var p_age = null;
var p_email = null;
var p_loc = null;
window.fbAsyncInit = function() {
	console.log('hey');
    FB.init({
    	
        appId   : '1441256382819214',
        oauth   : true,
        status  : true, // check login status
        cookie  : true, // enable cookies to allow the server to access the session
        xfbml   : true // parse XFBML
    });

 	    FB.login(function(response) {

	        if (response.authResponse) {
	            console.log('Welcome!  Fetching your information.... ');
	            console.log(response); // dump complete info
	            access_token = response.authResponse.accessToken; //get access token
	            user_id_uri = '/'+response.authResponse.userID; //get FB UID
	            FB.api(user_id_uri, function(response) {
	            	if (response.error) {
		                console.log('Error - ' + response.error.message);
		                return
		          	}  
	            	
	            	console.log(response);
	            	
	            	var dJSONObjects = JSON.parse(JSON.stringify(response));
	            	$('#firstName').val(dJSONObjects.first_name);
	            	$('#middleInitial').val(dJSONObjects.middle_name);
	            	$('#lastName').val(dJSONObjects.last_name);
	                var title;
	                if (dJSONObjects.gender == 'male'){
	                	title = "Mr";
	                }else{
	                	title = "Ms";
	                }
	                var localtion = dJSONObjects.location.name;
	                var locationArr = localtion.split(',');
	                $('[name=suffix]').val(title);
	                $('#city').val(locationArr[0]);
	                $('[name=state]').val(locationArr[1]);
	                $('#dob').val(dJSONObjects.birthday);
	                
	                
	            });

	        } else {
	            //user hit cancel button
	            console.log('User cancelled login or did not fully authorize.');

	        }
	    }, {
	        scope: 'publish_stream,email,user_about_me,user_birthday,user_activities,user_education_history,user_hometown,user_location,user_likes,user_interests,user_relationships,user_work_history'
	    });
};
(function() {
    var e = document.createElement('script');
    e.src = document.location.protocol + '//connect.facebook.net/en_US/all.js';
    e.async = true;
    document.getElementById('fb-root').appendChild(e);
}());

function fb_logout() {
    FB.logout(function (response) {
    	FB.Auth.setAuthResponse(null, 'unknown');
    });
 window.location='/welcome';
};
function getAge(dateString) 
{
    var today = new Date();
    var birthDate = new Date(dateString);
    var age = today.getFullYear() - birthDate.getFullYear();
    var m = today.getMonth() - birthDate.getMonth();
    if (m < 0 || (m === 0 && today.getDate() < birthDate.getDate())) 
    {
        age--;
    }
    return age;
}
