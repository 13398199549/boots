$(function(){
	
	
	//查询
	$('#btn04').bind('click',function(){
		
		var url = "users/22";
		
		$.ajax({
			url:url,
			type:"GET",
			success:function(msg){
				console.log(msg);
			}
		});
	});
	
	
	//删除
	$('#btn03').bind('click',function(){
		
		var url = "users/24";
		
		$.ajax({
			url:url,
			type:"DELETE",
			success:function(msg){
				console.log(msg);
			}
		});
	});
	
	
	
	
	//修改
	$('#btn02').bind('click',function(){
		
		var data = {userName:"王维高",loginName:"wwg",password:"123456"};
		var url = "users/22";
		
		$.ajax({
			url:url,
			type:"PUT",
			data:data,
			success:function(msg){
				console.log(msg);
			}
		});
	});
	
	
	
	
	//新增
	$('#btn01').bind('click',function(){
		
		var data = {userName:"陈维高",loginName:"cwg",password:"123456"};
		var url = "users/0";
		
		$.ajax({
			url:url,
			type:"POST",
			data:data,
			success:function(msg){
				console.log(msg);
			}
		});
	});
	
	
	
	
	
	
	
	
	
	
	
});