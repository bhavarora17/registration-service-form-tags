<%--
  Created by IntelliJ IDEA.
  User: barora
  Date: 3/18/18
  Time: 1:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <f:form name="registration" action = "${pageContext.request.contextPath}/registrationValidator"
            modelAttribute="customer">
        <%--<f:errors path="*" element="div"/>
        --%>
        <f:label path="firstName" for="name">Name : </f:label> <f:input path="firstName" id="name" type="text"/><br/>
        <f:label path="password" for="password">Password : </f:label> <input id="password" type="password"><br/>
        <%--<f:input path="gender" type="radio" name="gender" value="male"/>Male<br/>
--%>
        <f:select path="active">
            <f:options items="${ActiveList}" />
        </f:select>



        <%--<f:textarea path="" name="about" form="registration"></f:textarea><br/>
        --%>
        <f:checkboxes items="${GenderList}" path="gender" />
        <input type = "submit" value="submit"/>
    </f:form>
</body>
</html>
