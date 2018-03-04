$(function(){
	//校验是否已经登录
	validateLogin();
	function validateLogin(){
		var login = $.cookie("login");
		if(login == 'true'){
			$("#username").html($.cookie('userName'));
		}else{
			location.href = '/user/login';
		};
	}
	
	$("#logout").click(function(){
		$.cookie("login",'false');
	});
});
