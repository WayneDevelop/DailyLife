$(function(){
	//判断是否自动登录
	autoLogin();
	
	//登录
	$("#loginBtn").click(function(){
		if(validateName() && validateCode()){
			$.cookie("login",'true');
			location.href = '/user/index';
		}else{
			alert("登陆失败");
		}
	});
	
	//跳转注册页面
	$("#trun_register").click(function(){
		location.href = '/user/register';
	});
	
	/*
	 校验用户名
	 * */
	function validateName(){
		var name = $("#userName").val();
		var _name = $.cookie("userName");
		if(name == _name){
			return true;
		}else{
			return false;
		}
	};
	
	/*
	 校验密码
	 * */
	function validateCode(){
		var code = $("#userCode").val();
		var _code = $.cookie("code");
		if(code == _code){
			return true;
		}else{
			return false;
		}
	};
	
	/*
	 七天免登录
	 * */
	function autoLogin(){
		var autoLoginFlag = $.cookie("autoLoginFlag");
		if(autoLoginFlag){
			$("#userName").val($.cookie("userName"));
			$("#userCode").val($.cookie("code"));
			$("#automaticCode").attr('checked',true);
			setTimeout(function(){
				location.href = '/user/index';
			},100);
		}
	};
	
	$("#automaticCode").click(function(){
		var autoLoginFlag = $("#automaticCode").prop("checked");
		if(validateName() && validateCode()){
			if(autoLoginFlag){
				//设置cookie记录七天免登录
				$.cookie("autoLoginFlag",autoLoginFlag,{expires : 7});
			}else{
				//取消cookie，取消七天免登录
				$.cookie("autoLoginFlag",null);
			}
		}else{
			alert("请先输入用户名和密码")
		}
	});
});
