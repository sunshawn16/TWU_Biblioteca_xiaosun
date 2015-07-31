<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>

<html>
<head>
    <title>Welcome To Biblioteca  </title>
</head>
<body>
<h1>Welcome To Biblioteca .</h1>
<p>
    Here is The Bangalore Public Library, We have 10 books.
</p>
<p>Enjoy your reading!</p>
<s:form action="getBookList" validate="true" >
  <s:submit value="Get Book List"/>
</s:form>



</body>
</html>
