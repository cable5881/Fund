<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>上传文件</title>
<jsp:include page="../Model.jsp"></jsp:include>
<link href="/Fund/assets/upload/css/fileinput.css" media="all" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="/Fund/static/webuploader/webuploader.css">
</head>
<body>
	<jsp:include page="masterPage.jsp"></jsp:include>
	<!-- Main Page -->
	<div class="main ">
		<!-- Page Header -->
		<div class="page-header">
			<div class="pull-left">
				<ol class="breadcrumb visible-sm visible-md visible-lg">
					<li class="active"><a href="#"><i class="fa fa-folder"></i>立项管理</a></li>
					<li class="active"><a href="allProjects.jsp"><i
							class="fa fa-list-alt"></i>所有立项</a></li>
					<li class="active"><a href="upload.jsp"><i
							class="fa fa-upload"></i>上传文件</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>上传文件</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-paperclip"></i>新闻链接上传
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>
			<div class="panel-body">
				<div class="panel panel-default col-md-8 col-md-offset-2 ">
					<div class="panel-body">
						<form id="urlForm" class="form-horizontal ">
							<div class="form-group">
								<label class="col-md-3 control-label" for="text1">新闻链接</label>
								<div class="col-md-9">
									<input type="text" id="text1" name="launchUrl"
										class="form-control " placeholder="请将新闻链接复制在此"> <span
										class="help-block " style="color: red"></span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-3 control-label" for="textarea1">备注</label>
								<div class="col-md-9">
									<textarea id="textarea1" name="notes" rows="2"
										class="form-control"></textarea>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-3 control-label" for="text1">类型</label>
								<div class="col-md-9">
									<select class="form-control" name="newstypeId">
										<c:forEach items="${newsTypeList }" var="n">
											<option value="${n.newstypeId }">${n.typeName }</option>
										</c:forEach>
									</select>
								</div>
							</div>
						</form>
						<div>
							<div class="col-md-3 col-md-offset-3" style="text-align: center">
								<button id="resetBtn" type="reset" class="btn btn-primary">
									<i class="fa fa-reply"></i> 重置
								</button>
							</div>
							<div class="col-md-3 " style="text-align: center">
								<button id="urlSubmitBtn" class="btn btn-success">
									<i class="fa fa-upload"></i> 上传
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="panel bk-bg-white bk-margin-bottom-20">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-paperclip"></i>文件上传
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>
			<div class="panel-body">
				<div class="panel panel-default col-md-8 col-md-offset-2 ">
					<div class="panel-body">
						<form action="${pageContext.request.contextPath}/file/uploadFile.action" method="post" enctype="multipart/form-data"
							class="form-horizontal ">

							<div class="form-group">
								<label class="col-md-3 control-label">类型</label>
								<div class="col-md-9">
									<select class="form-control" name="dbFile.filetypeId">
										<c:forEach items="${sessionScope.fileTypeList }" var="f">
											<option value="${f.filetypeId }">${f.filetypeName }</option>
										</c:forEach>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-3 control-label" for="textarea2">备注</label>
								<div class="col-md-9">
									<textarea id="textarea2" name="dbFile.notes" rows="2"
										class="form-control"></textarea>
								</div>
							</div>
							<div class="row form-group">
								<label class="col-md-3 control-label" for="textarea2">文件选择</label>
								<div class="col-md-9">
									<div class="container kv-main col-md-12">
										<input id="file-0a" name="files" class="file" type="file" multiple
											data-min-file-count="1"> <br>
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
<script src="/Fund/assets/upload/js/fileinput.js" type="text/javascript"></script>
<script src="/Fund/assets/upload/js/fileinput_locale_zh.js"type="text/javascript"></script>
<script type="text/javascript">
	$(function(){
		$('#urlSubmitBtn').click(function(){
			$.ajax({
				type:'post',
				url:'${pageContext.request.contextPath}/upload/uploadNewsUrl.action',
				data:$('#urlForm').serialize(),
				success:function(data){
						if(data.resultCode == 1 ){
							document.getElementById('urlForm').reset();
							alert("链接提交成功");
						}else if( data.resultCode == 0 ){
							alert(data.resultMessage);
						}else if( data.resultCode == 2 ){
							alert("格式错误，请重新提交");
						}
					}
			});
		});
	})
</script>
<script src="/Fund/static/webuploader/webuploader.min.js" type="text/javascript"></script>
</body>
</html>