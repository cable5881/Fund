$(document).ready(function(){
	$('.verified-table').css("display","none");
    $('.unverified-button').click(function(){
    	$('.unverified-button').removeClass("btn-default").addClass("btn-primary");
    	$('.verified-button').removeClass("btn-primary").addClass("btn-default");
    	$('.unverified-table').show();
    	$('.verified-table').hide();
    });
    
    $('.verified-button').click(function(){
    	$('.verified-button').removeClass("btn-default").addClass("btn-primary");
    	$('.unverified-button').removeClass("btn-primary").addClass("btn-default");
    	$('.verified-table').show();
    	$('.unverified-table').hide();
    });
  });