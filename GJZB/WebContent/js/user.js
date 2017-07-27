$(function(){
	
	$("#regit").click(function(){
		$('#wregit').dialog({    
		    width: 450,    
		    height: 400,    
		    closed: false,    
		    modal: true,
		});   
	});
	
	//用户名
		$('#userName').validatebox({
			required : true,
			missingMessage : '请输入用户名',
			invalidMessage : '用户名不得为空',
			validType:'length[5,30]'
		});

		//密码
		$('#userPw').validatebox({
			required : true,
			validType : 'length[5,30]',
			missingMessage : '请输入密码',
			invalidMessage : '管理员密码在5-30 位',
		});
		
		//新增一个规则
		$.extend($.fn.validatebox.defaults.rules, {
			minLength : {
				validator : function (value) {
					return $("#reuserPw").val() == $("#userPw").val();
				},
				message : '密码不一致',
			},
		});

		//确认密码
		$('#reuserPw').validatebox({
			required : true,
			validType : 'minLength',
		});
		$('#reuserPw').bind('blur', function(){
			var value = $("#reuserPw").val();
			if(value != $("#userPw").val()) {// 非空校验 以及 两次输入是否一致
				$(this).validatebox('enableValidation').validatebox('validate');
			}
		});
		
		//邮箱
		$('#email').validatebox({
			required : true,
			validType : 'email',
		});
		$('#email').bind('focus',function(){
			$("#emailError").css("display", "none");
		});
		$('#email').bind('blur', function(){

			$.ajax({
				type:"post",
				url:"",
				async:true,
				success:function(data){
					if(data){
						$("#emailError").css("display", "");
						$("#emailError").text("邮箱已被注册！");
					}
				}
			});
		});
    
    	//新增一个规则
		$.extend($.fn.validatebox.defaults.rules, {
			phoneLength : {
				validator : function (value) {
					var phone = $('#phone').val();
					if(!(/^1[34578]\d{9}$/.test(phone))){ 
				        return false; 
				    } 
				    else{
				        return true; 
				    }
				},
				message : '手机号码有误，请重填',
			},
		});
		//手机
		$('#phone').validatebox({
			required : true,
			validType : 'phoneLength',
		});
		$('#phone').bind('focus',function(){
			$("#phoneError").css("display", "none");
		});
		$('#phone').bind('blur', function(){
			$("#phoneError").css("display", "none");
			$.ajax({
				type:"post",
				url:"",
				async:true,
				success:function(data){
					if(data){
						$("#phoneError").css("display", "");
						$("#phoneError").text("手机号已被注册！");
					}
				}
			});
		});


		//注册按钮
		$('#submit').click(function() {
			var flag = true;
			$(':text').each(function(){
				if (!$(this).validatebox('isValid')) {
					$(this).focus();
					flag = false;
				} 
			});
			if(flag){
				$.ajax({
					url : '',
					type : 'POST',
					data :  $("#regitForm").serializeObject(),
					asysn : true,
					success : function(data) {
					}
				});
			}
			
			return flag;
			
		});
	
	
	
	
	
	
	
	/*
	 * 校验验证码
	 */
	$('#check_code').blur(function(){
		$("#verifyCodeError").css("display","none");
		var value = $("#verifyCode").val();
		if(!value) {// 非空校验
			$("#verifyCodeError").css("display", "");
			$("#verifyCodeError").text("验证码不能为空！");
		}else {//验证码是否一致
			$.ajax({
				cache: false,
				async: false,
				type: "POST",
				dataType: "json",
				data: {method: "validateVerifyCode", verify: value},
				url: "getVerifyCode",
				success: function(flag) {
					if( !flag ) {
						$("#verifyCodeError").css("display", "");
						$("#verifyCodeError").text("验证码不一致！");
						bool = false;					
					}
				}
			});		
		}
	});
	

	
	$('#login').click(function(){
		$('#vCode').attr('src','getVerifyCode');
			$('#login_div').dialog({
				closed:false,
				width:420,
				height:320,
			});
		});
	$("#login_userName").validatebox({
			required:true,
			validType:'length[5,30]',
			missingMessage:'该输入项为必输入项',
		});
	$("#login_userPw").validatebox({
			required:true,
			missingMessage:'该输入项为必输入项',
		});
	//验证码
	$('#change').click(function() {
		$('#vCode').attr('src','getVerifyCode?a='+new Date().getTime());
		return flag;
		
	});
		
});
		