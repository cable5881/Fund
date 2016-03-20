<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>500 Error</title>
<!-- Mobile Metas -->
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<!-- Import google fonts -->
<link
	href="http://fonts.useso.com/css?family=Open+Sans:300,400,600,700,800|Shadows+Into+Light"
	rel="stylesheet" type="text/css" />
<!-- Vendor CSS-->
<link href="/Fund/assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="/Fund/assets/vendor/skycons/css/skycons.css" rel="stylesheet" />
<link href="/Fund/assets/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" />

<!-- Plugins CSS-->

<!-- Theme CSS -->
<link href="/Fund/assets/css/jquery.mmenu.css" rel="stylesheet" />

<!-- Page CSS -->
<link href="/Fund/assets/css/style.css" rel="stylesheet" />
<link href="/Fund/assets/css/add-ons.min.css" rel="stylesheet" />

</head>
<body>
	<!-- Start: Content -->
	<div class="container-fluid content">
		<div class="row">
			<!-- Main Page -->
			<div id="content" class="col-sm-12 full">
				<div class="row box-error">
					<div class="col-lg-12 col-md-12 col-xs-12">
						<div class="text-center">
							<h1>500</h1>
							<h4>对不起！服务器出错啦！请稍后访问或联系管理员。。。</h4>
							<a href="javascript: history.go(-1)">
								<button type="button" class="btn btn-primary">
									<i class="fa fa-chevron-left"></i> 返回
								</button>
							</a> <a href="${pageContext.request.contextPath }/logout.action">
								<button type="button" class="btn btn-primary">
									<i class="fa fa-lock"></i> 重新登录
								</button>
							</a>
						</div>
					</div>
				</div>
			</div>
			<!-- End Main Page -->
		</div>
	</div>

</body>
</html>