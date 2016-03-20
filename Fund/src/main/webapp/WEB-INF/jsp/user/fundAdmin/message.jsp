<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="imaw" uri="http://www.imaw.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>消息通知</title>
<jsp:include page="../Model.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="masterPage.jsp"></jsp:include>
	<!-- Main Page -->
	<div class="main ">
		<input type="hidden" name="contextPath" value="${pageContext.request.contextPath}"/>
		<!-- Page Header -->
		<div class="page-header">
			<div class="pull-left">
				<ol class="breadcrumb visible-sm visible-md visible-lg">
					<li class="active"><a href="message.jsp"><i
							class="fa fa-envelope"></i>消息通知</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>消息通知</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-paperclip"></i>消息通知
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>

			<div class="panel-body">
				<div class="row">
					<div class="table-responsive col-md-8 col-md-offset-2">
						<table class="table table-striped table-bordered bootstrap-datatable datatable text-center ">
							<thead>
								<tr>
									<th class="text-center">时间</th>
									<th class="text-center">消息</th>
									<th class="text-center">操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${messageList }" var="msg">
									<tr>
										<td>
											<div>
												<input type="checkbox" name="messageId" value="${msg.messageId }" > 
												<label> 
													<fmt:formatDate value="${msg.receivedTime }" pattern="yyyy-MM-dd" />
												</label>
											</div>
										</td>
										<td>
											<c:choose>
												<c:when test="${msg.isReaded eq 1 }">
													<span>${msg.msgTitle }</span>
												</c:when>
												<c:otherwise>
													<span style="font-weight: bolder;">${msg.msgTitle }</span>
												</c:otherwise>
											</c:choose>
										</td>
										<td>
											<a href="<c:url value='/message/oneMessagePage.action?messageId=${msg.messageId }'/>">
												<button type="button" class="btn btn-info fa fa-eye " title="查看"></button>
											</a>
											<button type="button" class="btn btn-danger fa fa-trash-o " onclick="deleteOneMessage(${msg.messageId },false)" title="删除"></button>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row col-md-8 col-md-offset-2">
					<c:if test="${!empty messageList }">
					<div class="col-md-3 bk-margin-top-10">
						<button class="btn btn-sm btn-danger" onclick="deleteMessages()">
							<i class="fa fa-trash-o"></i>一键删除
						</button>
					</div>
					</c:if>
					<div class="row myPage">
						<imaw:page url="${pageContext.request.contextPath }/message/messagesPage.action"/>
					</div>
				</div>
			</div>
		</div>
	</div>
	
<script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/pages/message.js"></script>	
</body>
</html>