<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<style>
#message{
color:red;
}
</style></head>
<body style="background-color:lavender">

<!--  Do not change the below line -->
<a href="/showPage?language=en">English</a>|<a href="/showPage?language=fr">French</a></align>
<!--  Design the page as per the requirements-->
<h1><center>Health Care Center</center></h1>
<form:form >
<table style="margin: 0px auto; margin-left: auto; margin-right:auto">
	  <tr>
            <td><spring:message code="label.patientName" /></td>
            <td><form:input path="patientName" required="true" /></td>
        </tr>
        <tr>
            <td><spring:message code="label.phoneNumber" /></td>
            <td><form:input path="phoneNumber" required="true" /></td>
        </tr>
        <tr>
            <td><spring:message code="label.age" /></td>
            <td><form:input path="age" required="true" /></td>
        </tr>
        <tr>
            <td><spring:message code="label.consultationFor" /></td>
            <td>
                <form:select path="consultationFor">
                    <form:options items="${consultationList}" />
                </form:select>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Book Appointment" /></td>
        </tr>

<tr><td colspan=2>
 <div id="message">${message}</div>
 	</td>
</tr>
</table>
</form:form>

</body>
</html>	 	  	    	    	     	      	 	
