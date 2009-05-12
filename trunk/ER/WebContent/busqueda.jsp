<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ page import="er.domain.enfermedades.*" %>
<%@ page import="er.domain.proyectos.*" %>
<%@ page import="java.util.*" %>
<link rel="stylesheet" href="style/estilos-enfermedades.css" media="all" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Asociacion Enfermedades Raras - Enfermedades</title>
</head>
<body>
<div id="global">
	<div id="curva-superior"></div>
	<div id="cabecera">
	<div id="logotipo"><a href="index.html"><img src="objetos/logotipo.jpg" width="150px" height="89" alt="Volver a la página de inicio"/></a></div>
	</div>
	<div id="navegacion">
	<ul><li><a href="index.html">Inicio</a></li><li><a href="#">Qué Hacemos</a></li><li><a href="#">Quiénes Somos</a></li><li><a href="#">Cómo puedes colaborar</a></li><li><a href="registro.html">Registro</a></li><li><a href="noticias.html">Noticias</a></li></ul>
	</div>
	<div id="contenido">
		<div id="menu">
			<h1>Menú</h1>
			<ul><li><a href="#">Enfermedades</a></li><li><a href="proyecto.jsp">Proyectos</a></li><li><a href="#">Donaciones</a></li><li><a href="historia.html">Historias</a></li><li><a href="publicar.html">Publicar</a></li><li><a href="firma.html">Firma</a></li><li><a href="ayuda.html">Ayuda</a></li></ul>
		</div>
	<p>
	Aquí podrá buscar toda la información posible relacionada con la enfermedad que desee. Para utilizar el servicio, introduzca el nombre de la 		enfermedad(nombre común o nombre técnico) y observe los resultados tanto de centros que la tratan, tratamientos posibles, sintomas y medicamentos, tanto en uso como experimentales.
	</p>
	<div id="buscador">
	<form id="formBuscador" action="busqueda.jsp" method="post">
		<fieldset>
		  <legend>Buscador</legend>
		  <div id="etiqueta">
		  <label for="nombreComun"><strong>Nombre Común</strong></label>
		  <input type="text" id="nombreC" name="nombreC" maxlength="40"/>
		  </div>
		  <input id="btnBuscador" class="btn" type="submit" value="Buscar" />
		</fieldset>
		</form> 
	</div>
	<div id="resultado">
	<h1>Resultado de la búsqueda</h1>
	<% String nombre = request.getParameter("nombreC"); 
String res="";
boolean esta = datos.getInstance().comprueba(nombre);
if(esta){
	res+="La enfermedad se encuentra disponible, a continuación le mostramos todo lo relacionado con ella";
	}
	else
	res+="La enfermedad no se encuentra disponible";
%>
<p><%=res %></p>
		

	<table id=tablaEnfermedad>
  <tr>
  	<% if(esta){ 
    out.write("<th scope='col'>"+nombre+"</th>");
   Enfermedad e = datos.getInstance().getEnfermedad(nombre);
  	out.write("<th scope='col'><a href='#'>descripcion</a></th>");
  	out.write("</tr>");
  	out.write("<tr>");
  	out.write("<td>Proyectos</td>");
  	Iterator it = e.getProyectos().iterator();
  	while(it.hasNext()){
	Proyecto p = (Proyecto)it.next();
	String nombrePro = p.getNombre();
  	out.write("<td><a href='Informacion?res=infProyectos.jsp?nombrePro'>"+p.getNombre()+"</a></td>");
  	}
  	out.write("</tr>");
  	out.write("<tr>");
  	out.write("<td>Tratamientos</td>");
  	out.write("<td><a href='#'>Tratamiento1</a></td>");
  	out.write("<td><a href='#'>Tratamiento2</a></td>");
  	out.write("</tr>");
  	out.write("<tr>");
  	out.write("<td>Medicamentos</td>");
  	out.write("<td><a href='#'>Medicamento1</a></td>");
  	out.write("<td><a href='#'>Medicamento2</a></td>");
  	out.write("</tr>");
  	out.write("<tr>");
  	out.write("<tr>");
  	out.write("<td>Sintomas</td>");
  	out.write("<td><a href='#'>Sintoma1</a></td>");
  	out.write("<td><a href='#'>Sintoma2</a></td>");
  	out.write("</tr>");
  	out.write("<tr>");
  	out.write("<td>Centros</td>");
  	out.write("<td><a href='#'>Centro1</a></td>");
  	out.write("<td><a href='#'>Centro2</a></td>");
  	}
  	%>
  	</tr>
  	</table>

</div>
	</div>
	<div id="pie">
	<div id="pieuno">
	<ul><li><a href="#">Inicio</a></li><li><a href="#">Qué Hacemos</a></li><li><a href="#">Quiénes Somos</a></li></ul>
	</div>
	<div id="piedos"></div>
	<div id="pietres">
	<ul><li><a href="#">Colabora</a></li><li><a href="#">Registro</a></li><li><a href="#">Noticias</a></li></ul>
	</div>
	</div>
	<div id="curva-inferior"></div>
</body>
</html>
