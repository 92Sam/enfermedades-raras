<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="er.domain.usuarios.*"%>
<%@page import="er.domain.comun.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registra Usuario</title>
</head>
<body>
<%
String nombre = request.getParameter("nombre");
String repite = request.getParameter("repite");
String contrasena = request.getParameter("contrasena");
String apellidos = request.getParameter("apellidos");
String nif = request.getParameter("nif");
String email = request.getParameter("email");
if(nombre.length()==0 || repite.length()==0 || contrasena.length()==0 || apellidos.length()==0 || nif.length()==0 || email.length()==0)
	response.getWriter().write("Debe rellenar todos los campos\n");
else if(!repite.equals(contrasena))
	response.getWriter().write("Debe escribir una contraseña válida\n");
else{	
	ProcesoUsuario pu = new ProcesoUsuario();
	Nif nuevo = new Nif(nif);
	UsuarioNormal ainsertar = new UsuarioNormal(nombre,apellidos,contrasena,nuevo,email);
	//compruebo primero si el usuario ya está registrado para no registrarlo nuevamente
boolean esta = pu.compruebaUsuario(nombre,contrasena);
if(!esta){
	pu.introduceUsuario(ainsertar);
%>
El usuario ha sido registrado correctamente<br/>
<a href='noticias.html'>Redirige</a>
<%}else{%>
El usuario ya está registrado en la web<br/>	
<% 
}
}
%>

</body>
</html>