<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<script >
	function validate() {

		var email = document.f1.email.value;
		var password = document.f1.password.value;

		var status = "";
		if (email == null || email == "") {

			alert("Please enter email");
			status=false;

		} else {
			status = true;
		}
		if(password==null || password=="")
			{
			alert("Please enter password");
			status=false;
			}
		else
			{
			status=true;
			}

		return status;

	}
</script>

</head>
<body>


	<form action="LoginAction.jsp" name="f1" onsubmit="return validate()">



		<table border="1">

			<tr>
				<td>Enter Email</td>

				<td><input type="text" name="email" required></td>
			</tr>

			<tr>
				<td>Enter Password</td>

				<td><input type="text" name="password" required></td>
			</tr>

			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>

		</table>
	</form>
</body>
</html>