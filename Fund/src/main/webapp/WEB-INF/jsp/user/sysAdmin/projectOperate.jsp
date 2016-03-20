<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>项目操作</title>
<jsp:include page="../Model.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="masterPage.jsp"></jsp:include>
	<!-- Main Page -->
	<div class="main ">
		<!-- Page Header -->
		<div class="page-header">
			<div class="pull-left">
				<ol class="breadcrumb visible-sm visible-md visible-lg">
					<li class="active"><i class="fa fa-list-alt"></i>项目管理</li>
					<li class="active"><a href="${pageContext.request.contextPath}/sysAdmin/projectOperate.action"><i
							class="fa fa-pencil-square-o"></i>项目操作</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>项目操作</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="col-lg-4">
			<div class="panel bk-bg-white bk-margin-bottom-20 ">
				<div class="panel-heading bk-bg-primary">
					<h6>
						<i class="fa fa-paperclip"></i>创建项目类型
					</h6>
					<div class="panel-actions">
						<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
					</div>
				</div>
				<div class="panel-body">
					<form id="createProjectType" method="post" enctype="multipart/form-data"
						class="form-horizontal ">
						<div class="form-group">
							<label class="col-md-12 " for="projecttypeName">项目类型名称</label>
							<div class="col-md-12">
								<input type="text" id="projecttypeName" name="projecttypeName"
									class="form-control text-userName-check text-userName-land">
								<span class="help-block span-userName-info" style="color: red"></span>
							</div>
						</div>
					</form>
					<div>
						<div style="text-align: center">
							<button type="button" class="btn btn-success" onclick="createProjectType()">
								<i class="fa fa-check-circle"></i> 创建
							</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<div class="col-lg-4">
			<div class="panel bk-bg-white bk-margin-bottom-20 ">
				<div class="panel-heading bk-bg-primary">
					<h6>
						<i class="fa fa-paperclip"></i>创建基金类型
					</h6>
					<div class="panel-actions">
						<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
					</div>
				</div>
				<div class="panel-body">
					<form id="createFundType" class="form-horizontal ">
						<div class="form-group">
								<label class="col-md-4 control-label">项目类型</label>
								<div class="col-md-8">
									<select class="form-control" id="projecttypeId" name="projecttypeId">
										<c:forEach items="${projecttypesList }" var="projecttype" >
										<option value="${projecttype.projecttypeId }">${projecttype.projecttypeName }</option>
										</c:forEach>
									</select>
								</div>
						</div>
						<div class="form-group">
							<label class="col-md-4 control-label" for="fundName">基金类型</label>
							<div class="col-md-8">
								<input type="text" id="fundName" name="fundName"
									class="form-control text-userName-check text-userName-land">
								<span class="help-block span-userName-info" style="color: red"></span>
							</div>
						</div>
					</form>
					<div>
						<div style="text-align: center">
							<button type="submit" class="btn btn-success" onclick="createFundType()">
								<i class="fa fa-check-circle"></i> 创建
							</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<div class="col-lg-4">
			<div class="panel bk-bg-white bk-margin-bottom-20 ">
				<div class="panel-heading bk-bg-primary">
					<h6>
						<i class="fa fa-paperclip"></i>删除项目
					</h6>
					<div class="panel-actions">
						<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
					</div>
				</div>
				<div class="panel-body">
					<form id="deleteFundType" method="post" enctype="multipart/form-data"
						class="form-horizontal ">
						<div class="form-group">
								<label class="col-md-4 control-label">项目类型</label>
								<div class="col-md-8">
									<select class="form-control" id="pType" name="projecttypeId">
										<option id="pickOption">====请选择项目类型====</option>
										<c:forEach items="${projecttypesList }" var="projecttype" >
										<option value="${projecttype.projecttypeId }">${projecttype.projecttypeName }</option>
										</c:forEach>
									</select>
								</div>
						</div>
						<div class="form-group">
							<label class="col-md-4 control-label">基金类型</label>
							<div class="col-md-8">
								<select class="form-control" name="fundtypeId" id="fType" disabled="disabled">
									<option>===请先选择项目类型===</option>
									<c:forEach items="${fTypeList }" var="fType">
										<option value="${fType.fundtypeId }">${fType.fundName}</option>
									</c:forEach>
								</select>
							</div>
						</div>
					</form>
					<div>
						<div style="text-align: center">
							<button type="submit" class="btn btn-danger" onclick="deleteFundType()" >
								<i class="fa fa-trash-o"></i> 删除
							</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<script type="text/javascript">
$.fn.serializeObject = function() {     
    var o = {};     
    var a = this.serializeArray();     
    $.each(a, function() {     
      if (o[this.name]) {     
        if (!o[this.name].push) {     
          o[this.name] = [ o[this.name] ];     
        }     
        o[this.name].push(this.value || '');     
      } else {     
        o[this.name] = this.value || '';     
      }     
    });     
    return o;     
}; 

function createProjectType(){
	var datasent = $("#createProjectType").serializeObject();
	params = JSON.stringify(datasent); 
	$.ajax({
		type:'post',
		url:'${pageContext.request.contextPath}/sysAdmin/createProjectType.action',
		dataType : "json",
		contentType : "application/json;charset=utf-8",
		data : params,
		success:function(data){
			if (data.resultCode == 0) {
				alert(data.resultMessage);
			} else if (data.resultCode == 1) {
				alert("项目类型创建成功！");
				$("#projecttypeName").attr("value","");
			} 
		}
	});
}

function createFundType(){
	var datasent = $("#createFundType").serializeObject();
	params = JSON.stringify(datasent); 
	$.ajax({
		type:'post',
		url:'${pageContext.request.contextPath}/sysAdmin/createFundType.action',
		dataType : "json",
		contentType : "application/json;charset=utf-8",
		data : params,
		success:function(result){
			if (result.resultCode == 0) {
				alert(result.resultMessage);
			} else if (result.resultCode == 1) {
				alert("基金类型创建成功！");
			} 
			}
		});
}

$(function(){
	var $oPType = $('#pType');
	var $oFType = $("#fType");
	$oPType.bind("change",function(){
		$('#pickOption').remove();//移除‘请选择项目类型’选项
		$oFType.removeAttr("disabled"); //解封基金类型
		$.post('${pageContext.request.contextPath}/sysAdmin/getFundTypes',{projectTypeId:$oPType.val()},function(datas){
			$oFType.empty();
			for(var i = 0;i < datas.length;i++){
				$oFType.append("<option value='"+datas[i].fundtypeId+"'>"+datas[i].fundName+"</option>");
			}
		},'json');
	});
});

function deleteFundType(){
	var datasent = $("#deleteFundType").serializeObject();
	params = JSON.stringify(datasent); 
	$.ajax({
		type:'post',
		url:'${pageContext.request.contextPath}/sysAdmin/deleteFundType.action',
		dataType : "json",
		contentType : "application/json;charset=utf-8",
		data : params,
		success:function(data){
			if (data.resultCode == 0) {
				alert(data.resultMessage);
			}else if (data.resultCode == 1) {
				history.go(0);
			} 
		}
	});
}
</script>
</body>
</html>