<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <title>Insert title here</title>
</head>
<body>
<c:forEach items="${result}" var="item">
  <a href="list/${item.id }">${item.name }</a> pass: ${item.pass } --- age: ${item.age } <a href="delete/${item.id }">delete</a><hr/>
</c:forEach>

<a href="toAdd">添加记录</a><br/>
</body>
</html>