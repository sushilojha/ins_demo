function SelectedProduct(action) {
	$('#productSelectForm').attr('action', action);
	$('#productSelectForm').submit();
	e.preventDefault();
}



$(document).ready(function() {

	$.get("http://ipinfo.io", function(response) {
		
		$("#ziphide").val(response.postal);
		$("#area").html('<h3 class="panel-title lead text-center">Product Available in your zip: ' + response.postal + '</h3>');
		$('#zipform').hide();
	}, "jsonp");
	

});

$('#zipchange').click( function() {
	$('#zipform').show();
});


$('#bzip').click( function() {
	$("#ziphide").val($('#lzip').val());
	$("#area").html('<h3 class="panel-title lead text-center">Product Available in your zip: ' + $('#lzip').val() + '</h3>');
	$('#zipform').hide();
});
