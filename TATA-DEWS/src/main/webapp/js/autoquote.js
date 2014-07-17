$(document).ready(function() {

    $("#manual").hide();

    $("#link_manual").click(function() {
      $("#manual").hide();
      $("#upload").show();
    });
    
    $("#link_upload").click(function() {
        $("#upload").hide();
        $("#manual").show();
      });

});