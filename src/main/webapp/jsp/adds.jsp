<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <title>Insert title here</title>
</head>
<body>
<br/>
<form action="doAdd" method="post">
  name:<input type="text" name="name">
  pass:<input type="text" name="pass">
  age:<input type="text" name="age">
  <input type="submit" value="submit">
</form>
<br/>
<a href="list">查询所有</a><br/>
</body>
</html>