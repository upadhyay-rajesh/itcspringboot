<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration</title>
</head>
<script type="text/javascript">
function addCustomer() {
	var fname=document.forms["form1"]["firstName"].value;
	var lname=document.forms["form1"]["lastName"].value;
	var address=document.forms["form1"]["address"].value;
	var country=document.forms["form1"]["country"].value;
	var city=document.forms["form1"]["city"].value;

	if(fname==null || fname=="")
	  {
	  alert("Please provide first name");
	  return false;
	  }
	if(lname==null || lname=="")
	{
	alert("Please provide last name");
	return false;
	}
	if(address==null || address=="")
	  {
	  alert("Please provide address");
	  return false;
	  }
	if(country==null || country=="")
	{
	alert("Please provide country");
	return false;
	}
	if(city==null || city=="")
	{
	alert("Please provide city");
	return false;
	}
	document.form1.action="register.htm";
	document.form1.submit();
}

</script>
<body>
<form:form name="form1" modelAttribute="customer" method="POST" >
	<h2><center>Customer Registration Page</center></h2>

	<div align="center"><form:errors id="InvalidUser" /></div>
	<table width="100%" height="150" align="center" border="0">
		<tr>
			<td width="50%" align="right">First Name</td>
			<td width="50%" align="left"><form:input path="firstName" size="30"/></td>
		</tr>
		<tr>
			<td width="50%" align="right" >Last Name</td>
			<td width="50%" align="left"><form:input path="lastName"  size="30"/></td>
		</tr>		
		 <tr>
			<td width="50%" align="right" >Gender</td>
			<td width="50%" align="left">
		 <form:select path="gender">
				<form:options items="${genderList}" itemValue="id" itemLabel="description" />
			</form:select>
			</td>
		 </tr>
		 <tr>
			<td width="50%" align="right" >Address</td>
			<td width="50%" align="left"><form:input path="address"  size="30"/></td>
		</tr>
		<tr>
			<td width="50%" align="right" >City</td>
			<td width="50%" align="left"><form:input path="city"  size="30"/></td>
		</tr>
		<tr>
			<td width="50%" align="right" >Country</td>
			<td width="50%" align="left"><form:input path="country"  size="30"/></td>
		</tr>
		 <tr>
			<td colspan="2" align="center">
			<input type="button" value="Add Customer" onClick="javascript:addCustomer();"></td>
		 </tr>	
		 <tr>
				<td colspan="2" align="center"><font color="red">${MESSAGE}</font></td>
			</tr>
		</table>

</form:form>
</body>
</html>