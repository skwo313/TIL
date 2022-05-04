<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function call(obj){
		if(obj.style.background=="red"){
			obj.style.background="orange";
		}else if(obj.style.background=="orange"){
			obj.style.background="yellow";
		}else if(obj.style.background=="yellow"){
			obj.style.background="green";
		}else if(obj.style.background=="green"){
			obj.style.background = "blue";
		}else if(obj.style.background=="blue"){
			obj.style.background = "navy";
		}else if(obj.style.background == "navy"){
	         obj.style.background = "purple";
	    }else {
	         obj.style.background = "red";
		}

	}
</script>
</head>
<body>
	<h2 onclick="call(this)" style="background:red;" align="center">클릭하시오</h2>
</body>

</html>