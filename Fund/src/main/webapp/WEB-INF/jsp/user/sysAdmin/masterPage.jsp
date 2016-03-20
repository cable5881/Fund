<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">
	.center {  
  height:35%;
  width:5%;
  margin-top: 25px;
  overflow:hidden;
  position: absolute;  
 /*  top: 0; left: 0; bottom: 0; right: 0;   */
} 
</style>
<!-- Start: Header -->
		<div class="navbar" role="navigation">
			<div class="container-fluid container-nav">
				<!-- Navbar Action -->
				<ul class="nav navbar-nav navbar-actions navbar-left center">					
					<li class="visible-md visible-lg"><a href="#" id="main-menu-toggle"><i class="fa fa-th-large "></i></a></li>
					<!-- <li class="visible-xs visible-sm"><a href="#" id="sidebar-menu"><i class="fa fa-navicon"></i></a></li> -->			
				</ul>
				<!-- Navbar Right -->
				<div class="navbar-right">
					<!-- Notifications -->
					
					<!-- End Notifications -->
					<!-- Userbox -->
					<div class="userbox">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							<div class="profile-info">
								<span class="name">${sessionScope.user.username }</span>
								<span class="role">系统管理员</span>
							</div>			
							<i class="fa custom-caret"></i>
						</a>
						<div class="dropdown-menu">
							<ul class="list-unstyled">
								<li class="dropdown-menu-header bk-bg-white bk-margin-top-15">						
									<div class="progress progress-xs  progress-striped active">
										
									</div>							
								</li>	
								
								<li>
									<a href="<c:url value='/logout.action'/>"><i class="fa fa-power-off"></i>注销</a>
									
								</li>
							</ul>
						</div>						
					</div>
					<!-- End Userbox -->
				</div>
				<!-- End Navbar Right -->
			</div>		
		</div>
		<!-- End: Header -->
		
		<!-- Start: Content -->
		<div class="container-fluid content">	
			<div class="row">
			
				<!-- Sidebar -->
				<div class="sidebar">
					<div class="sidebar-collapse">
						
						<!-- Sidebar Menu-->
						<div class="sidebar-menu">						
							<nav id="menu" class="nav-main" role="navigation">
								<ul class="nav nav-sidebar">
									<div class="panel-body text-center">								
										<div class="bk-avatar">
											<img src="/Fund/assets/png/sysAdmin.png" class="img-circle bk-img-60" alt="" />
										</div>
										<div class="bk-padding-top-10">
											<i class="fa fa-circle text-success"></i> <small>${sessionScope.user.username }</small>
										</div>
									</div>
									<div class="divider2"></div>
									
									<li class="nav-parent">
										<a>
											<i class="fa fa-user" aria-hidden="true"></i><span>账号管理</span>
										</a>
										<ul class="nav nav-children">
											<li><a href="${pageContext.request.contextPath}/sysAdmin/allUsers.action?pageNow=1&level=1"><span class="text">所有账号</span></a></li>
											<li><a href="${pageContext.request.contextPath}/sysAdmin/toCreateUser.action"><span class="text">创建账号</span></a></li>
																						
										</ul>
									</li>
									<li class="nav-parent">
										<a>
											<i class="fa fa-list-alt" aria-hidden="true"></i><span>项目管理</span>
										</a>
										<ul class="nav nav-children">
											<li><a href="${pageContext.request.contextPath}/sysAdmin/projectType.action"><span class="text">项目分类</span></a></li>
											<li><a href="${pageContext.request.contextPath}/sysAdmin/projectOperate.action"><span class="text">项目操作</span></a></li>
										</ul>
									</li>
									<li>
										<a href="${pageContext.request.contextPath}/sysAdmin/allProjects.action">
											<i class="fa fa-file" aria-hidden="true"></i><span>立项管理</span>
											
										</a>
										
									</li>
																
									<li>
										<a href="${pageContext.request.contextPath}/sysAdmin/changePwd.action">
											<i class="fa fa-wrench" aria-hidden="true"></i><span>修改密码</span>
										</a>
										
									</li>
									
								</ul>
							</nav>
						</div>
						<!-- End Sidebar Menu-->
					</div>
					<!-- Sidebar Footer-->
					<div class="sidebar-footer">
							
						<div>版权所有:武汉理工大学教育发展基金会　<br>地址:湖北省武汉市珞狮路122号 <br>邮编:430070
						</div>
									
					</div>
					<!-- End Sidebar Footer -->
				</div>
				<!-- End Sidebar -->
				</div>
		</div><!--/container-->
		

		<div class="clearfix"></div>		
		
		
		<!-- start: JavaScript-->
		
		<!-- Vendor JS-->				
		<!-- <script src="/Fund/assets/vendor/js/jquery.min.js"></script>
		<script src="/Fund/assets/vendor/js/jquery-2.1.1.min.js"></script> -->
		<script src="/Fund/assets/vendor/js/jquery-migrate-1.2.1.min.js"></script>
		<script src="/Fund/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
		<script src="/Fund/assets/vendor/skycons/js/skycons.js"></script>
		
		<!-- Plugins JS-->
		<script src="/Fund/assets/plugins/jquery-ui/js/jquery-ui-1.10.4.min.js"></script>
		<script src="/Fund/assets/plugins/moment/js/moment.min.js"></script>	
		<script src="/Fund/assets/plugins/fullcalendar/js/fullcalendar.min.js"></script>			
		
		<!-- Theme JS -->		
		<script src="/Fund/assets/js/jquery.mmenu.min.js"></script>
		<script src="/Fund/assets/js/core.min.js"></script>
		
		<!-- Pages JS -->
		<script src="/Fund/assets/js/pages/calendar.js"></script>
		
		<!-- end: JavaScript-->
		