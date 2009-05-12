<%@page import="er.domain.enfermedades.datos"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ page import="java.util.*" %>
<%@ page import="er.domain.proyectos.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" href="style/estilos-enfermedades.css" media="all" type="text/css" />
</head>
<body>

<% List<Proyecto> proyectos  = datos.getInstance().getProyectos();

	for(Proyecto p : proyectos){
		%>
	<br />
	<h1><%= p.getNombre() %></h1>
	<br />
	<%= p.getDescripcion() %>
	<div id ="proyectos">
	<h3>Fecha final prevista para el proyecto: <%=p.getFechaFinPrevista().getFirstDayOfWeek()  %></h3>
	</div>		
	<% } %>
</body>
