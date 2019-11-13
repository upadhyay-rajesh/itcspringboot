<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
</head>
<script type="text/javascript">
function loginPage() {
	var uname=document.forms["form1"]["userName"].value;
	var password=document.forms["form1"]["password"].value;
	if(uname==null || uname=="")
	  {
	  alert("Please provide Username");
	  return false;
	  }
	if(password==null || password=="")
	{
	alert("Please provide Password");
	return false;
	}
	document.form1.action="userlogin.htm";
	document.form1.submit();
}

</script>
<body>
<form:form name="form1" modelAttribute="user" method="POST" >
	<h2><center>User Login Page</center></h2>

	<div align="center"><form:errors id="InvalidUser" /></div>
	<table width="100%" height="150" align="center" border="0">
		<tr>
			<td width="50%" align="right">User Name</td>
			<td width="50%" align="left"><form:input path="userName" size="19"/></td>
		</tr>
		<tr>
			<td width="50%" align="right" >Password</td>
			<td width="50%" align="left"><form:password path="password"  size="20"/></td>
		</tr>		
		 <tr>
			<td colspan="2" align="center">
				
		 <form:select path="country">
				<form:options items="${countryList}" itemValue="countryId" itemLabel="countryName" />
			</form:select>
			</td>
		 </tr>
		 <tr>
			<td colspan="2" align="center">
			<input type="button" value="Login" onClick="javascript:loginPage();"></td>
		 </tr>	
		 <tr>
				<td colspan="2" align="center"><font color="red">${ERROR}</font></td>
			</tr>
		</table>

</form:form>
</body>
</html>