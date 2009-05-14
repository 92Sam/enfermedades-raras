<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ page import="er.domain.enfermedades.*" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Error</title>
</head>
<body>
<% String enfermedad = request.getParameter("var");
Enfermedad e = datos.getInstance().getEnfermedad(enfermedad);
%>
Descripción de la enfermedad: <%=e.getDescripcion() %>
</body>
</html>