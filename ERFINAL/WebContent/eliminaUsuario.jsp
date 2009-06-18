<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="er.domain.usuarios.UsuarioNormal"%>
<%@page import="er.domain.comun.*"%>
<%@page import="er.domain.usuarios.ProcesoUsuario"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulario de Baja</title>
</head>
<body>
<%
String repite = request.getParameter("repite");
String contrasena = request.getParameter("contrasena");
String nombre = request.getParameter("nombre");
if(repite.length()==0 || contrasena.length()==0 || nombre.length()==0)
	response.getWriter().write("Debe rellenar todos los campos\n");	

else if(!repite.equals(contrasena)){
		response.getWriter().write("Debe escribir una contraseña válida\n");	
}
else{
ProcesoUsuario pu = new ProcesoUsuario();
boolean eliminado = false;
if(pu.compruebaUsuario(nombre,contrasena)){
		pu.eliminaUsuario(nombre);
		eliminado = true;
}
if(!eliminado){
	out.write("No se pudo eliminar el usuario por alguna razón");
}
else{
%>
El usuario ha sido eliminado correctamente<br>
<a href='index.html'>Redirige</a>
<% 
}
}
%>

</body>
</html>