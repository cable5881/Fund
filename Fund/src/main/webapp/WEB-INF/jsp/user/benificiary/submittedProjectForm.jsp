<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>立项申请表</title>
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
					<li class="active"><a href="#"><i class="fa fa-folder"></i>立项管理</a></li>
					<li class="active"><a href="applyProjectInfo.jsp"><i
							class="fa fa-file-text"></i>立项信息</a></li>
					<li class="active"><a href="submittedProjectForm.jsp"><i
							class="fa fa-table"></i>立项申请表</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>立项申请表</h2>
			</div>
		</div>
		<!-- End Page Header -->
		
		<!-- project Application Form -->
		<div>
			<jsp:include page="../template/showProjectApp.jsp"></jsp:include>
		</div>
		
	</div>
</body>
</html>