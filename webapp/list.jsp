<%@page import="java.util.List"%>
<%@page import="artistas.model.Artista"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listado de artistas</title>
</head>
<body>

<h1>Listado de Artistas dde un jsp</h1>

<ul>

	<%
	
		List<Artista> artistas = (List<Artista>)request.getAttribute("artistas");
	
		for (Artista cadaArtista : artistas) {
	
	%>
	
		<li><%=cadaArtista.getNombre() %></li>
		
	<%
	
		}
	%>

</ul>

</body>
</html>