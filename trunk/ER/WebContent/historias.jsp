<%@page import="er.domain.enfermedades.datos"%>
<%@page import="er.domain.historias.Historia"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" href="style/estilos-enfermedades.css" media="all" type="text/css" />
</head>
<body>

<% 
Iterator<Historia> it  = datos.getInstance().getHistorias().iterator();
Historia h = null;
	while(it.hasNext()){
		h = (Historia)it.next();
		%>
	<br />
	<h1><%= h.getUsuario().getNombre() %></h1>
	<br />
	<%= h.getHistoria() %>
	<div id ="nomEnf">
	<h3>Enfermedad relacionada con la historia: <%=h.getEnfermedad().getNombreComun()  %></h3>
	</div>		
	<% } %>
</body>
