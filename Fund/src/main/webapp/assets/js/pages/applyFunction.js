$(document).ready(function(){
	$('.stipend-table').css("display","none");
    $('.scholarship-button').click(function(){
    	$('.scholarship-button').removeClass("btn-default").addClass("btn-primary");
    	$('.stipend-button').removeClass("btn-primary").addClass("btn-default");
    	$('.scholarship-table').show();
    	$('.stipend-table').hide();
    });
    
    $('.stipend-button').click(function(){
    	$('.stipend-button').removeClass("btn-default").addClass("btn-primary");
    	$('.scholarship-button').removeClass("btn-primary").addClass("btn-default");
    	$('.stipend-table').show();
    	$('.scholarship-table').hide();
    });
    
  });