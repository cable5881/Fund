$(document).ready(function(){
	
	    //显示生日时间控件
	    $('.circulate_date').Zebra_DatePicker().css("cursor","pointer");
	    
	  });

$(document).ready(function(){
	
    $('.close-button').click(function(){
    	$('.text-time').val("").focus();
    	$('.text-money').val("").focus();
    }
    		
    );
    
  });