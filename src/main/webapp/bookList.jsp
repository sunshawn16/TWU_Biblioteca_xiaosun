<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: sun
  Date: 2015/7/31
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BookList</title>
</head>
<body>

<h1><s:property value="bookMsg" /></h1>

<table border="1">
  <tr>
    <td>Name</td>
    <td>Auther</td>
    <td>Published Year</td>
  </tr>
  <s:iterator value="#request.bookList" status="stat" id="sd">
    <tr align="center">
      <td><s:property value="#sd.name" /></td>
      <td><s:property value="#sd.author" /></td>
      <td><s:property value="#sd.publishYear" /></td>

    </tr>
  </s:iterator>
</table>

</body>
</html>
