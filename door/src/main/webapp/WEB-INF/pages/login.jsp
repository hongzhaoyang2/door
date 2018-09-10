<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
    <!--<![endif]-->
    <!-- BEGIN HEAD -->
    <head>
        <meta charset="utf-8" />
        <title>Door</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport" />
        <meta content="" name="description" />
        <meta content="" name="author" />
        <!-- BEGIN GLOBAL MANDATORY STYLES -->
        <link href="https://static-test.erp.chicv.com/xike.backend.static/third-vendor/metronic-v4.5.6/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- END GLOBAL MANDATORY STYLES -->
        <!-- BEGIN THEME GLOBAL STYLES -->
        <link href="https://static-test.erp.chicv.com/xike.backend.static/third-vendor/metronic-v4.5.6/assets/global/css/components.min.css" rel="stylesheet" id="style_components" type="text/css" />
        <link href="https://static-test.erp.chicv.com/xike.backend.static/third-vendor/metronic-v4.5.6/assets/global/css/plugins.min.css" rel="stylesheet" type="text/css" />
        <!-- END THEME GLOBAL STYLES -->
        <!-- BEGIN PAGE LEVEL STYLES -->
        <link href="https://static-test.erp.chicv.com/xike.backend.static/third-vendor/metronic-v4.5.6/assets/pages/css/login-5.min.css" rel="stylesheet" type="text/css" />
        <!-- END PAGE LEVEL STYLES -->
        <!-- BEGIN THEME LAYOUT STYLES -->
        <!-- END THEME LAYOUT STYLES -->
        <link rel="shortcut icon" href="favicon.ico" />
        
    </head>
    <!-- END HEAD -->
    <body class=" login">
     	<div class="row" style="margin-left: 40px;margin-top: 30px">
     		<h1>Door Open</h1>
     	</div>
        <!-- BEGIN : LOGIN PAGE 5-2 -->
        <div class="user-login-5">
            <div class="row bs-reset" style="width: 633px;margin: 0 auto;">
                <div class="login-container bs-reset">
                    <div class="login-content" style="margin-top: 15%;">
                        <h1 style="text-align: center;margin-top: 120px;">Management System Login</h1>
                        <p style="text-align: center;margin-bottom: 100px;"> This is a door. </p>
                        <form action="/door/login/login" class="login-form" method="post">
                             <input type="hidden" name="backUrl" value="${param.backUrl}" placeholder="backUrl"/>
<%--                             <input type="hidden" name="ticketUrl" value="${param.ticketUrl}" placeholder="backUrl"/>
 --%>                            <div class="alert alert-danger display-hide">
                                <button class="close" data-close="alert"></button>
                                <span>请输入用户名及密码. </span>
                            </div>
                            <div class="row">
                                <div class="col-xs-6">
                                    <input class="form-control form-control-solid placeholder-no-fix form-group" type="text" autocomplete="off" placeholder="用户名" name="uid" required/>
                                </div>
                                <div class="col-xs-6">
                                    <input class="form-control form-control-solid placeholder-no-fix form-group" type="password" autocomplete="off" placeholder="密 码" name="password" required/>
                                </div>
                            </div>
							<div class="row" style="color: red; margin-left: 0px;">${tipMsg}</div>
                            <div class="row">
                                <div class="col-sm-12 text-right">
                                    <div class="forgot-password">
                                        <a href="/api/authc/forgetPassword" >忘记密码?</a>
                                    </div>
                                    <button class="btn blue" type="submit">登 录</button>
                                </div>
                            </div>
                        </form>
                        <!-- BEGIN FORGOT PASSWORD FORM -->
                        <%-- <form class="forget-form" action="/api/authc/forgetPassword" method="post">
                            <h5>忘记密码 ?</h5>
                            <p> 请输入电子邮箱找回密码. </p>
                            <div class="row" id="tipDiv" style="color: red;">${tipMsg}</div>
                            <div class="form-group">
                                <input class="form-control placeholder-no-fix" name="email" type="text" autocomplete="off" placeholder="电子邮箱" required/>
                            </div>
                            <div class="form-actions">
                                <button type="button" id="back-btn" class="btn blue btn-outline">返 回</button>
                                <button id="btnok" type="button" class="btn blue uppercase pull-right">提 交</button>
                            </div>
                        </form> --%>
                        <!-- END FORGOT PASSWORD FORM -->
                    </div>
                </div>
            </div>
        </div>
<!-- BEGIN CORE PLUGINS -->
<script src="https://static-test.erp.chicv.com/xike.backend.static/third-vendor/metronic-v4.5.6/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="https://static-test.erp.chicv.com/xike.backend.static/third-vendor/metronic-v4.5.6/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="https://static-test.erp.chicv.com/xike.backend.static/third-vendor/metronic-v4.5.6/assets/global/plugins/jquery-validation/js/jquery.validate.min.js" type="text/javascript"></script>
<script src="https://static-test.erp.chicv.com/xike.backend.static/third-vendor/metronic-v4.5.6/assets/global/plugins/backstretch/jquery.backstretch.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<script src="https://static-test.erp.chicv.com/xike.backend.static/third-vendor/metronic-v4.5.6/assets/global/scripts/app.min.js" type="text/javascript"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<script src="/static/js/login-5.min.js" type="text/javascript"></script>
<script type="text/javascript">
$('#btnok').click(function() {
	$('.forget-form').submit();
	$('#tipDiv').html('处理中，请稍后 ...');
	$(this).attr("disabled", true).attr('style', 'background:#cccccc');
});
</script>
</body>
</html>