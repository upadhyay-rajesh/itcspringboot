<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="register.htm" method="post">
	<p>Registration Page</p><br>
	Name : <input type=text name=name><br>
	Password : <input type=password name=pass><br>
	Email : <input type=email name=email><br>
	Address : <input type=text name=address><br>
	 <input type=submit value=Register><br>
	<font color=red size=5>${a1} </font> <br>
</form>

</body>
</html>