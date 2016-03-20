<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="imaw" uri="http://www.imaw.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>审核捐赠协议</title>
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
					<li class="active"><i class="fa fa-eraser"></i>审核操作</li>
					<li class="active"><a href="#"><i class="fa fa-file-text"></i>审核捐赠协议</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>审核捐赠协议</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20" id="div1">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-file-text"></i>审核捐赠协议
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class="bk-bg-white row text-center">
					<div class="btn-group">
						<c:choose>
							<c:when test="${empty verified || verified == 0 }">
								<a href="<c:url value='/proAdmin/toExamineProtocol.action?verified=0'/>"><button type="button" class="btn btn-primary">未审核</button></a>
								<a href="<c:url value='/proAdmin/toExamineProtocol.action?verified=1'/>"><button type="button" class="btn btn-default">已审核</button></a>
							</c:when>
							<c:otherwise>
								<a href="<c:url value='/proAdmin/toExamineProtocol.action?verified=0'/>"><button type="button" class="btn btn-default">未审核</button></a>
								<a href="<c:url value='/proAdmin/toExamineProtocol.action?verified=1'/>"><button type="button" class="btn btn-primary">已审核</button></a>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
				
				<div class="row">
					<div class="table-responsive col-md-12">
						<c:choose>
							<c:when test="${verified == null || verified == 0 }">
								<table
									class="table table-striped table-bordered bootstrap-datatable datatable text-center unverified-table">
									<thead>
										<tr>
											<th class="text-center">上传日期</th>
											<th class="text-center">合同编号</th>
											<th class="text-center">项目名称</th>
											<th class="text-center">状态</th>
											<th class="text-center">捐赠协议</th>
											<th class="text-center">审核</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${projectList }" var="p">
											<tr>
												<td><fmt:formatDate value="${p.setupTime }"
														pattern="yyyy-MM-dd" /></td>
												<td>${p.projectNum }</td>
												<td>${p.projectName }</td>
												<td><label class="label label-warning">未审核</label></td>
												<td><a class="btn btn-primary fa fa-download" target="_blank" href="<c:url value='/download/downloadFile.action?filesId=${p.protocol.fileId }'/>" title="下载">下载</a></td>
												<td><button class="btn btn-success fa fa-check" onclick="examineProtocol(1,${p.protocolId},${p.projectId })">审核通过</button>
													<button class="btn btn-danger fa fa-times" onclick="examineProtocol(2,${p.protocolId},${p.projectId })">审核失败</button>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</c:when>
							
							<c:otherwise>
								<table
									class="table table-striped table-bordered bootstrap-datatable datatable text-center verified-table">
									<thead>
										<tr>
											<th class="text-center">上传日期</th>
											<th class="text-center">合同编号</th>
											<th class="text-center">项目名称</th>
											<th class="text-center">状态</th>
											<th class="text-center">捐赠协议</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${projectList }" var="p">
											<c:if test="${verified == 1 }">
												<tr>
													<td><fmt:formatDate value="${p.setupTime }"
															pattern="yyyy-MM-dd" /></td>
													<td>${p.projectNum }</td>
													<td>${p.projectName }</td>
													<td><c:choose>
															<c:when test="${p.protocol.isPassed eq 1 }">
																<label class="label label-success">通过</label>
															</c:when>
															<c:when test="${p.protocol.isPassed eq 2 }">
																<label class="label label-danger">无效</label>
															</c:when>
															<c:otherwise>
																<label class="label label-warning">其他</label>
															</c:otherwise>
														</c:choose></td>
													<td><a class="btn btn-primary fa fa-download" target="_blank"
														href="<c:url value='/download/downloadFile.action?filesId=${p.protocol.fileId }'/>">下载</a></td>
												</tr>
											</c:if>
										</c:forEach>
									</tbody>
								</table>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
				<div class="row myPage">
					<c:choose>
						<c:when test="${verified == 1 }">
							<imaw:page url="${pageContext.request.contextPath }/proAdmin/toExamineProtocol.action?verified=1"/>
						</c:when>
						<c:otherwise>
							<imaw:page url="${pageContext.request.contextPath }/proAdmin/toExamineProtocol.action?verified=0"/>
						</c:otherwise>
					</c:choose>
				</div>	
			</div>
		</div>
	</div>
	
	
<script type="text/javascript">
	function examineProtocol(mode,protocolId,projectId){
		var flag = false;
		if(mode==1)
		{
			flag = confirm("您确定要通过此捐赠协议?");
		}
		else if(mode==2)
		{
			flag = confirm("您确定要否决此捐赠协议?");
		}
		
		if(flag){
			$.ajax({
	             type: "POST",
	             url: "${pageContext.request.contextPath}/proAdmin/examineProtocol.action",
	             data: 'isPassed=' + mode + "&protocolId=" + protocolId + "&projectId=" + projectId,
	             dataType: "json",
	             success: function(result){
	            	 if(result.resultCode == 1){
	            		 history.go(0);
	            	 }else if(result.resultCode == 0){
	            		 alert("审核捐赠协议失败！");
	            	 }
	             }
	         });
		}
	}
</script>	
</body>
</html>