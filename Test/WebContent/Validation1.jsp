<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function validate() {


		//alert("function called");
		var name = document.f1.name.value;
		var password = document.f1.password.value;
		var status = false;
		// var gender = document.f1.gender.value;

		if (name.length < 1) {
			
			document.getElementById("nameloc").innerHTML = " <font color='red'>Please enter your name</font>";
			status = false;
		} else {
			document.getElementById("nameloc").innerHTML = " <img src='checked.gif' width='15px' height='15px'/>";
			status = true;
		}
		if (password.length < 6) {
			document.getElementById("passwordloc").innerHTML = " <img src='unchecked.gif' width='15px' height='15px'/> Password must be at least 6 char long";
			status = false;
		} else {
			document.getElementById("passwordloc").innerHTML = " <img src='checked.gif' width='15px' height='15px'/>";
			status = true;
		}

		if ((f1.gender[0].checked == false) && (f1.gender[1].checked == false)) {

				document.getElementById("genderloc").innerHTML = " <img src='unchecked.gif' width='15px' height='15px'/> Please select gender";
			status = false;
		} else {
			document.getElementById("genderloc").innerHTML = " <img src='checked.gif' width='15px' height='15px'/>";
			status = true;

		}

		
		return status;
	}
</script>
</head>
<body>


	<form name="f1" action="register.jsp" onsubmit="return validate();">
		<table>
			<tr>
				<td>Enter Name:</td>
				<td><input type="text" name="name" /> <span id="nameloc"></span></td>
			</tr>
			<tr>
				<td>Enter Password:</td>
				<td><input type="password" name="password" /> <span
					id="passwordloc"></span></td>
			</tr>

			<tr>
				<td>Select Gender:</td>
				<td><input type="radio" name="gender" value="male" /> Male<input
					type="radio" name="gender" value="female" />FeMale<span
					id="genderloc"></span></td>
			</tr>

		<!-- 	<tr>
				<td>Select Course:</td>
				<td><input type="checkbox" name="course1" value="Java" /> Java<input
					type="checkbox" name="course2" value="Oracle" />Oracle<span
					id="courseloc"></span></td>
			</tr>


			<tr>
				<td>Select Education:</td>

				<td><select name="education">
					<option value="0">Select</option>
					<option value="MCA">MCA</option>
					<option value="BTECH">BTECH</option>
					<option value="MTECH">MTECH</option>
				</select><span
					id="educationloc"></span></td>
			</tr> -->
			<tr>
				<td colspan="2"><input type="submit" value="register" /></td>
			</tr>


		</table>
	</form>

</body>
</html>