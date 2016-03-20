<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>消息通知</title>
<jsp:include page="../Model.jsp"></jsp:include>
<script type="text/javascript">
	function deleteMessages() {
		var flag = confirm("您确定要删除这些消息吗？");
		if (flag == true) {
			$('#messageForm').submit();
		}
	}
</script>
</head>
<body>
	<jsp:include page="masterPage.jsp"></jsp:include>
	<!-- Main Page -->
	<div class="main ">
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
						<form id="messageForm"
							action="<c:url value='/message/deleteMessages.action'/>"
							method="POST">
							<table
								class="table table-striped table-bordered bootstrap-datatable datatable text-center ">
								<thead>
									<tr>
										<th class="text-center">时间</th>
										<th class="text-center">消息</th>
										<th class="text-center">操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${messageList }" var="msg" varStatus="status">
										<tr>
											<td>
												<div>
													<input type="checkbox" name="index"
														value="${status.index }"> <label> <fmt:formatDate
															value="${msg.receivedTime }" pattern="yyyy-MM-dd" />
													</label>
												</div>
											</td>
											<td><c:choose>
													<c:when test="${msg.isReaded eq 1 }">
														<span>${msg.msgTitle }</span>
													</c:when>
													<c:otherwise>
														<span style="font-weight: bolder;">${msg.msgTitle }</span>
													</c:otherwise>
												</c:choose></td>
											<td><a
												href="<c:url value='/message/oneMessagePage.action?index=${status.index }'/>">
													<button class="btn btn-info fa fa-eye " title="查看"></button>
											</a> <a
												href="<c:url value='/message/deleteOneMessage.action?index=${status.index }'/>"
												onclick="javascript: return confirm('您确定要删除这条消息吗?')">
													<button class="btn btn-danger fa fa-trash-o " title="删除"></button>
											</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</form>
					</div>
				</div>
				<div class="row col-md-8 col-md-offset-2">
					<div class="col-md-3 bk-margin-top-10">
						<button class="btn btn-sm btn-danger" onclick="deleteMessages()">
							<i class="fa fa-trash-o"></i>一键删除
						</button>
					</div>
					<div class="btn-group  bk-margin-top-10 pull-right">
						<button type="button" class="btn btn-sm btn-primary ">1</button>
							<a class="btn btn-info" href="#"> <i
								class="fa fa-chevron-left "></i>
							</a>
							<button type="button" class="btn btn-sm btn-info " style="color: red;" disabled="disabled">3</button>
							<a class="btn btn-info" href="#"> <i
								class="fa fa-chevron-right "></i>
							</a>
							<button type="button" class="btn btn-sm btn-primary ">10</button>
					</div>
				</div>
			</div>

		</div>

	</div>
</body>
</html>