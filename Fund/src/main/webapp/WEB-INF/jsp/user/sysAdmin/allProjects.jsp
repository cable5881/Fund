<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="imaw" uri="http://www.imaw.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>立项管理</title>
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
					<li class="active"><a href="${pageContext.request.contextPath}/sysAdmin/projectManage.action"><i class="fa fa-folder"></i>立项管理</a></li>
				</ol>
			</div>
			<div class="pull-right">
				<h2>立项管理</h2>
			</div>
		</div>
		<!-- End Page Header -->
		<div class="panel bk-bg-white bk-margin-bottom-20">
			<div class="panel-heading bk-bg-primary">
				<h6>
					<i class="fa fa-folder"></i>立项管理
				</h6>
				<div class="panel-actions">
					<a class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
				</div>
			</div>
			<div class="panel-body">
				<div class="bk-bg-white">
					<form>
						<div class="col-md-4 form-group col-md-offset-3">
							<input type="text" class="form-control" placeholder="请输入合同编号或项目关键字" />
						</div>
						<div>
							<div class="col-md-3">
								<button type="button" class="btn btn-primary">
									<i class="fa fa-search"></i> 查找
								</button>
							</div>
						</div>
					</form>
				</div>
				<div class="table-responsive">
					<table class="table table-striped table-bordered bootstrap-datatable datatable ">
						<thead>
							<tr>
								<th>时间</th>
								<th>合同编号</th>
								<th>标题</th>
								<th>状态</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${projectList }" var="project">
							<tr>
								<td><fmt:formatDate value="${project.setupTime }" pattern="yyyy-MM-dd"/></td>
								<td>${project.projectNum }</td>
								<td>${project.projectName }</td>
								<c:choose>
									<c:when test="${project.isPassed eq 1 }">
									<td><span class="label label-warning">等待审核</span></td>
									</c:when>
									<c:when test="${project.isPassed eq 2 }">
									<td><span class="label label-success">审核通过</span></td>
									</c:when>
									<c:when test="${project.isPassed eq 3 }">
									<td><span class="label label-danger">审核未通过</span></td>
									</c:when>
									<c:otherwise>
									<td><span class="label label-danger">未知</span></td>
									</c:otherwise>
								</c:choose>
								<td>
								<c:choose>
									<c:when test="${project.fundtypeId eq 1 || project.fundtypeId eq 2 || project.fundtypeId eq 7}">
										<c:choose>
											<c:when test="${project.isPassed eq 2 }">
												<a href="${pageContext.request.contextPath}/sysAdmin/bonusProjectInfo.action?projectId=${project.projectId}"> 
													<button type="button" class="btn btn-info fa fa-eye " title="查看"></button>
												</a> 
											</c:when>
											<c:otherwise>
												<a href="${pageContext.request.contextPath}/sysAdmin/projectApplicationForm.action?projectId=${project.projectId}"> 
													<button type="button" class="btn btn-info fa fa-eye " title="查看"></button>
												</a> 
											</c:otherwise>
										</c:choose>
									</c:when>
									<c:otherwise>
										<c:choose>
											<c:when test="${project.isPassed eq 2 }">
												<a href="${pageContext.request.contextPath}/sysAdmin/fundProjectInfo.action?projectId=${project.projectId}"> 
													<button type="button" class="btn btn-info fa fa-eye " title="查看"></button>
												</a>  
											</c:when>
											<c:otherwise>
												<a href="${pageContext.request.contextPath}/sysAdmin/projectApplicationForm.action?projectId=${project.projectId}"> 
													<button type="button" class="btn btn-info fa fa-eye " title="查看"></button>
												</a>  
											</c:otherwise>
										</c:choose>
									</c:otherwise>
								</c:choose>
									<a href="${pageContext.request.contextPath }/download/downloadFile?filesId=${project.appformId}"> 
										<button type="button" class="btn btn-primary fa fa-download " title="下载"></button>
									</a>
									<button type="button" class="btn btn-warning fa fa- fa-link btn-settingIn" title="关联捐赠方" onclick="setInitSetting(${project.projectId})"></button>
								</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
				
				<div class="row myPage">
					<imaw:page url="${pageContext.request.contextPath }/sysAdmin/allProjects.action"/>
				</div>
			</div>
		</div>
		
		<!-- Modal Dialog -->
		<div class="modal fade" id="myModalIn">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close close-button"
							data-dismiss="modal" aria-hidden="true">&times;</button>
						<h4 class="modal-title bk-fg-primary">关联捐赠方账号</h4>
					</div>
					<div class="modal-body">
						<div class="row form-group">
							<label class="col-md-3 control-label">捐赠方账号</label>
							<div class="col-md-6">
								<input type="text" name="donationUsername"
									class="form-control text-donationuser-check text-donationuser-land"
									placeholder="必填"> <span
									class="help-block span-donationuser-info" style="color: red"></span>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" onclick="linkDonationUser()"
							class="btn btn-success close-button"
							 >
							<i class="fa fa-check-circle">提交</i>
						</button>
					</div>
				</div>
			</div>
		</div>
		<!-- End Modal Dialog -->
		
	</div>
	
	<script type="text/javascript">
		var projectId = -1;//立项id
		
		$(document).ready(function() {
			$(".text-donationuser-check").blur(function() {
				if ($.trim($(".text-donationuser-land").val()) == "") {
					$(".span-donationuser-info").html("捐赠方不能为空！");
				}
				if ($.trim($(".text-donationuser-land").val()) != "") {
					$(".span-donationuser-info").html("");
				}
			});
		});
		
		function setInitSetting(pId){
			projectId = pId;
			$(".text-donationuser-land").val("");
			$(".span-donationuser-info").html("");
			return true;
		}
		
		function checkLinkDonationUser(){
			if($.trim($(".text-donationuser-land").val())==""){
				$(".span-donationuser-info").html("捐赠方不能为空！");
				alert("表单没有填完，无法提交！");
				return false;
			}else return true;
		}
		
		function linkDonationUser(){
			if(checkLinkDonationUser()){
				var donationUsername = $("input[name='donationUsername']").val();
				$.ajax({
					type:'post',
					url:'${pageContext.request.contextPath}/sysAdmin/linkDonationUser.action',
					dataType : "json",
					data : "donationUsername=" + donationUsername + "&projectId=" + projectId,
					success:function(data){
						if (data.resultCode == 1) {
							alert("关联成功！");
						} else if (data.resultCode == -1) {
							alert(data.resultMessage);
						} else if (data.resultCode == 0) {
							alert(data.resultMessage);
						} 
						$("input[name='donationUsername']").val("");
					}
				});
			}
		}
	</script>
</body>
</html>