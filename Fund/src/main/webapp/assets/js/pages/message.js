var contextPath = $("input[name='contextPath']").val();//项目名

function deleteOneMessage(messageId,goBack){
	var flag = confirm('您确定要删除此消息吗？');
	if(flag){
		$.ajax({
             type: "POST",
             url: contextPath+"/message/deleteOneMessage.action",
             data: 'messageId=' + messageId,
             dataType: "json",
             success: function(data){
            	 if(data.resultCode == 1){
            		 if(goBack==true)//删除后返回到上一页
            		 {
            			 try{ 
            				 var referrer = document.referrer;
            				 if(referrer.indexOf("unreadMessagePage")>-1){
            					 referrer = referrer.replace("unreadMessagePage","messagesPage");
            				 }
            				 window.location.href = referrer; 
            			 }catch(e){ 
            				 history.go(-1); 
            				 history.go(0);
            			 }
            		 }else{
            			 history.go(0);//删除后直接刷新
            		 }
            	 }else if(data.resultCode == 0){
            		 alert(data.resultMessage);
            	 }
             }
         });
	}
}
	
function deleteMessages() {
	var messageIdArr =[]; 
	$("input[type=checkbox]:checked").each(function(){
		messageIdArr.push($(this).val());
	});
	
	if(messageIdArr.length==0){
		alert("请您先选择要删除的信息！");
		return;
	}
	
	var flag = confirm("您确定要删除这些消息吗？");
	if (flag) {
		$.ajax({
             type: "POST",
             url: contextPath+"/message/deleteMessages.action",
             data: 'messageId=' + messageIdArr,
             dataType: "json",
             success: function(data){
            	 if(data.resultCode == 1){
            		 history.go(0);
            	 }else if(data.resultCode == 0){
            		 alert(data.resultMessage);
            	 }
             }
         });
	}
}