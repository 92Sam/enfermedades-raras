<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*" %>
<%@page import="er.domain.proyectos.*" %>
<%@page import="er.domain.usuarios.*" %>
<%@page import="er.domain.enfermedades.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registra Usuario</title>
</head>
<body>
<%
String nombre = request.getParameter("nombre");
String fechaInicial = request.getParameter("fechaInicial");
String fechaFinPre = request.getParameter("fechaFinPre");
String enfermedad = request.getParameter("enfermedad");
String descripcion = request.getParameter("descripcion");

if(nombre.length()==0 || fechaInicial.length()==0 || fechaFinPre.length()==0 || enfermedad.length()==0 || descripcion.length()==0 )
	response.getWriter().write("Debe rellenar todos los campos\n");
else{	
	GregorianCalendar finicio = new GregorianCalendar();
    String[] fechainicio = fechaInicial.split("/");
    finicio.set(Integer.valueOf(fechainicio[2]),Integer.valueOf(fechainicio[1]) ,Integer.valueOf(fechainicio[0]));
    GregorianCalendar ffin = new GregorianCalendar();
    String[] fechafin = fechaFinPre.split("/");
    ffin.set(Integer.valueOf(fechafin[2]),Integer.valueOf(fechafin[1]) ,Integer.valueOf(fechafin[0]));
    ProcesoUsuario pu = new ProcesoUsuario();
    UsuarioAdministrador admin = pu.selectAdministrador((String)session.getAttribute("session.user"),(String)session.getAttribute("session.pass"));
    Enfermedad enf = EnfermedadFactoria.getInstance().getEnfermedad(enfermedad);
	Proyecto ainsertar = new Proyecto(nombre,admin,enf,descripcion,finicio,ffin);
	ProyectoFactoria instancia = ProyectoFactoria.getInstance();
boolean esta = instancia.compruebaProyecto(ainsertar);
if(!esta){
	instancia.insertaProyecto(ainsertar);
%>
El Proyecto ha sido registrado correctamente<br/>
<a href='proyecto.jsp'>Redirige</a>
<%}else{%>
El proyecto que intenta registrar ya existe actualmente<br/>	
<% 
}
}
%>

</body>
</html>