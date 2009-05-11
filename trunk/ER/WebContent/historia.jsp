<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<link rel="stylesheet" href="style/estilos-enfermedades.css" media="all" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
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
			<ul><li><a href="enfermedades.html">Enfermedades</a></li><li><a href="proyectos.html">Proyectos</a></li><li><a href="#">Donaciones</a></li><li><a href="historia.jsp">Historias</a></li><li><a href="publicar.html">Publicar</a></li><li><a href="firma.html">Firma</a></li><li><a href="ayuda.html">Ayuda</a></li></ul>
		</div>
	<p>Aquí podrá ver las historias subidas por nuestros usuarios</p>
	<jsp:include page ="historias.jsp"/> 
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
