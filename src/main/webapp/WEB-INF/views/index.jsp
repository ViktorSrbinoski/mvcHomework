<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Citizen Form</title>
</head>
<body>
<h2>Simple form</h2>
<h2>${welcomeMSG}</h2>
<form action="/" method="post">
    <form:errors path="index.*" cssStyle="color: red"/><br>

    <table>
        <tr>
            <td><label>Name</label></td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td><label>Age</label></td>
            <td><input type="number" name="age"/></td>
        </tr>
        <tr>
            <td><label>City of residence</label></td>
            <td><input type="text" name="city"/></td>
        </tr>

        <tr>
            <td><input type="submit" value="Submit" style="font-weight: bold; background-color: #EEEEEE; margin-top: 5px;"/></td>
        </tr>
    </table>
</form>
</body>
</html>