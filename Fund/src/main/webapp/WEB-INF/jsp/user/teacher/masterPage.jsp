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
					<ul class="notifications hidden-sm hidden-xs">
						
						<li>
							<a href="#" class="dropdown-toggle notification-icon" data-toggle="dropdown">
								<i class="fa fa-envelope"></i>
								<span class="badge">5</span>
							</a>
							<ul class="dropdown-menu">
								<li class="dropdown-menu-header">
									<strong>Messages</strong>
									<div class="progress progress-xs  progress-striped active">	
									</div>
								</li>
								<li class="avatar">
									<a href="#">
										<img class="avatar" src="/Fund/assets/img/avatar1.jpg" alt="" />
										<div><div class="point point-primary point-lg"></div>New message</div>
										<span><small>1 minute ago</small></span>							
									</a>
								</li>
								<li class="avatar">
									<a href="#">
										<img class="avatar" src="/Fund/assets/img/avatar2.jpg" alt="" />
										<div><div class="point point-primary point-lg"></div>New message</div>
										<span><small>3 minute ago</small></span>								
									</a>
								</li>
								<li class="avatar">
									<a href="#">
										<img class="avatar" src="/Fund/assets/img/avatar3.jpg" alt="" />
										<div><div class="point point-primary point-lg"></div>New message</div>
										<span><small>4 minute ago</small></span>								
									</a>
								</li>
								<li class="avatar">
									<a href="#">
										<img class="avatar" src="/Fund/assets/img/avatar4.jpg" alt="" />
										<div><div class="point point-primary point-lg"></div>New message</div>
										<span><small>30 minute ago</small></span>
									</a>
								</li>
								<li class="avatar">
									<a href="#">
										<img class="avatar" src="/Fund/assets/img/avatar5.jpg" alt="" />
										<div><div class="point point-primary point-lg"></div>New message</div>
										<span><small>1 hours ago</small></span>
									</a>
								</li>						
								<li class="dropdown-menu-footer text-center">
									<a href="page-inbox.html">View all messages</a>
								</li>	
							</ul>
						</li>
						
					</ul>
					<!-- End Notifications -->
					<!-- Userbox -->
					<div class="userbox">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							<div class="profile-info">
								<span class="name">${sessionScope.user.username }</span>
								<span class="role">教师</span>
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
									<a href="<c:url value='/logout.action'/>"><i class="fa fa-power-off"></i> Logout</a>
									
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
											<img src="/Fund/assets/png/teacher.png" class="img-circle bk-img-60" alt="" />
										</div>
										<div class="bk-padding-top-10">
											<i class="fa fa-circle text-success"></i> <small>${sessionScope.user.username }</small>
										</div>
									</div>
									<div class="divider2"></div>
									
									<li >
										<a href="${pageContext.request.contextPath}/teacher/applybonus.action">
											<i class="fa fa-user" aria-hidden="true"></i><span>申请奖教金</span>
										</a>
									</li>
									<li >
										<a>
											<i class="fa fa-list-alt" aria-hidden="true"></i><span>查看申请</span>
										</a>
									</li>
									<li class="nav-parent">
										<a href="#">
											<i class="fa fa-envelope-o" aria-hidden="true"></i><span>消息通知</span>
										</a>
										<ul class="nav nav-children">
											<li><a href="#"><span class="text">基金消息</span></a></li>
											<li><a href="#"><span class="text">系统消息</span></a></li>
																						
										</ul>
										
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
		<script src="/Fund/assets/vendor/js/jquery.min.js"></script>
		<script src="/Fund/assets/vendor/js/jquery-2.1.1.min.js"></script>
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
		