<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>view page</title>
</head>
<body>
<h1>view page</h1>

<div>
	<p>
		<input type="text" id="reText" value="테스트 댓글">
	</p>
	<p>
		<input type="text" id="replyer" value="replyer001">
	</p>
	<p>
		<button id="saveBtn">Save</button>
	</p>
</div>
<button id="delBtn">delete</button>
<button id="modBtn">MODIFY</button>

<script
  src="https://code.jquery.com/jquery-3.2.1.min.js"
  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
  crossorigin="anonymous"></script>

<script>
$(document).ready(function(){
	var obj= {
			 reText:$("#reText").val(),
			 replyer:$("#replyer").val()	 
	 };
    $("#modBtn").click(function(e){
        
        $.ajax({
            type:'post',
            url:'replies/321/21',
            headers: { 
                     "Content-Type": "application/json",
                      "X-HTTP-Method-Override": "PUT" },
                      data: JSON.stringify(obj),
            success:function(msg){
                console.log(msg)
                
            }       
            
        });

    });
	 
	$("#delBtn").click(function(e){
		$.ajax({
			type:'delete',
			url:'/replies/321/21',
			success:function(msg){
				 console.log(msg);				
		}});
		
	})
	
	
	$("#saveBtn").click(function(e){
		 
		 var obj= {
				 reText:$("#reText").val(),
				 reText:$("#replyer").val()	 
		 };
		 
		 
		 $.ajax({
			 type:"post",
			 url:"/replies/321",
			 headers:{ "Content-Type":"application/json"},
			 data: JSON.stringify(obj),
			 success:function(result){
				 console.log(result);				
				 console.log(result.reText);
			 }
			 
		 });
		 
	 })
});
</script>
</body>
</html>