<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<script>
		function validate() {
			var num = document.myform.num.value;
			if (isNaN(num)) {
				document.getElementById("numloc").innerHTML = "Enter Numeric value only";
				return false;
			} else {
				return true;
			}
		}
	</script>
	<form name="myform" onsubmit="return validate()" action="register.jsp">
		Number: <input type="text" name="num"><span id="numloc"></span><br />
		<input type="submit" value="submit">
	</form>
</body>
</html>