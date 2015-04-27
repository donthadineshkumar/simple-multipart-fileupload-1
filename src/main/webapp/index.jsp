<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Register</title>
</head>
<body>
	<form action="/upload" enctype="multipart/form-data"  method="post">
	<!-- observe the input type is file so that you can browse -->
		<input name="resume" type="file" />
		<input value="Upload" type="submit" />
	</form>
</body>
</html>