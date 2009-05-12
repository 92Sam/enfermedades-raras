<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="er.domain.comun.Nif"%>
<%@page import="er.domain.enfermedades.datos"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" href="style/estilos-enfermedades.css" media="all" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Asociacion Enfermedades Raras - Firma</title>
</head>
<body>
<div id="global">
	<div id="curva-superior"></div>
	<div id="cabecera">
	<div id="logotipo"><a href="index.html"><img src="objetos/logotipo.jpg" width="150px" height="89" alt="Volver a la página de inicio"/></a></div>
	</div>
	<div id="navegacion">
	<ul><li><a href="index.html">Inicio</a></li><li><a href="#">Qué Hacemos</a></li><li><a href="#">Quiénes Somos</a></li><li><a href="#">Cómo puedes colaborar</a></li><li><a href="registro.html">Registro</a></li><li><a href="#">Noticias</a></li></ul>
</div>
	<div id="contenido">
		<div id="menu">
			<h1>Menú</h1>
			<ul><li><a href="enfermedades.html">Enfermedades</a></li><li><a href="proyecto.jsp">Proyectos</a></li><li><a href="#">Donaciones</a></li><li><a href="historia.jsp">Historias</a></li><li><a href="publicar.html">Publicar</a></li><li><a href="#">Firma</a></li><li><a href="ayuda.html">Ayuda</a></li></ul>
		</div>
		<p>
	Aquí podrá establecer su firma para confirmar que usted está de acuerdo con el propósito de esta asociación, es muy fácil y puede firmar quien quiera, sólo es necesario introducir su NIF válido y su nombre completo. Firmando ayudará a la asociación a seguir adelante con los proyectos en marcha.
	</p>
		<div id="Noticias">
		<form id="formNoticias" action="firmaRealizada.jsp" method="post">
		<fieldset>
		  <legend>Firma</legend>
		  <div id="etiqueta">
		  <label for="nombre"><strong>Nombre</strong></label>
		  <input type="text" id="nombre" name="nombre" maxlength="20"/>
		  </div>
		  <div id="etiqueta">
		  <label for="apellidos"><strong>Apellidos</strong></label>
		  <input type="text" id="apellidos" name="apellidos" maxlength="30"/>
		  </div>
		  <div id="etiqueta">
		  <label for="nif"><strong>NIF</strong></label>
		  <input type="text" id="nif" name="nif" maxlength="9" />
		  </div>
		  <input id="btnFirma" class="btn" type="submit" value="Firma" />
		</fieldset>
		</form>
		<% String res = "";
		String dni = request.getParameter("nif");
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		boolean adelante = true;
		if(dni.length() == 0 || nombre.length()==0 || apellidos.length()==0){
			res="Debes rellenar todos los campos";
			adelante = false;
		}
			
		boolean firmado = datos.getInstance().compruebaFirma(dni);
		if(firmado && adelante)
			res+="Ya has firmado, no puedes firmar otra vez";
		else if(!firmado && adelante)
			res+="Gracias por firmar";
		%>
		<div id="resultado"></div>
		<p><%=res %></p>
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
