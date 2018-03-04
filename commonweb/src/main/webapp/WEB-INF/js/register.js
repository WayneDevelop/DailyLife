$(function(){
	$("#register").click(function(){
		if(validateName() && validateCode() && reValidateCode()){
			alert("注册成功");
			//设置cookie记录用户名和密码
			$.cookie('userName',$("#userName").val(),{ expires: 7 });
			$.cookie('code',$("#userCode").val(),{ expires: 7 });
			location.href = '/user/login';
		}else{
			alert("注册失败");
		}
	});
	
	/*
	 验证用户名
	 * */
	function validateName(){
		var name = $("#userName").val();
		var reg = /^[a-zA-Z\_][a-zA-Z0-9_]{6,15}$/;
		if(reg.test(name)){
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 验证密码
	 * */
	function validateCode(){
		var code = $("#userCode").val();
		var reg = /[a-zA-Z0-9_*#@]{6,15}/;
		if(reg.test(code)){
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 确认密码
	 * */
	function reValidateCode(){
		var code = $("#userCode").val();
		var _code = $("#validate_userCode").val();
		if(code == _code){
			return true;
		}else{
			return false;
		}
	}
	
	//跳转登录页面
	$("#turn_login").click(function(){
		location.href = '/user/login';
	});
});