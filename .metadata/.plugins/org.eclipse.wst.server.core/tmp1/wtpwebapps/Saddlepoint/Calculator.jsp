<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Html Calculator</title>
</head>
<body bgcolor="#00000" text="gold">
<form name="calculator">
<input type="button" value="1" onclick="document.calculator.ans.value+='1'">
<input type="button" value="2" onclick="document.calculator.ans.value+='2'">
<input type="button" value="3" onclick="document.calculator.ans.value+='3'">
<input type="button" value="4" onclick="document.calculator.ans.value+='4'">
<input type="button" value="5" onclick="document.calculator.ans.value+='5'">
<input type="button" value="6" onclick="document.calculator.ans.value+='6'">
<input type="button" value="7" onclick="document.calculator.ans.value+='7'">
<input type="button" value="8" onclick="document.calculator.ans.value+='8'">
<input type="button" value="9" onclick="document.calculator.ans.value+='9'">
<input type="button" value="-" onclick="document.calculator.ans.value+='-'">
<input type="button" value="+" onclick="document.calculator.ans.value+='+'">
<input type="button" value="*" onclick="document.calculator.ans.value+='*'">
<input type="button" value="/" onclick="document.calculator.ans.value+='/'">
<input type="button" value="0" onclick="document.calculator.ans.value+='0'">

<input type="reset" value="reset">

<input type="button" value="=">

</form>
</body>
</html>