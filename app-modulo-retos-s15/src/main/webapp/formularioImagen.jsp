<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario crear nuevas imagenes</title>
<link href="./css/estilos.css" rel="stylesheet">
<link href="./css/bootstrap.css" rel="stylesheet">
</head>
<body>
<section class="container">

<h2>
 INSERCIÓN NUEVAS IMAGENES AL CARROUSEL
</h2>
<form action="<%=request.getContextPath()%>/NuevaImagenServlet" method="POST">
	 <div class="row"></div>
	 	<div class="col-12">
	    <label for="id" class="form-label">id</label>
	    <input type="number" name="id" required="required" class="form-control" id="documento" aria-describedby="emailHelp">
	  </div>
	  
	  <div class="mb-3">
	    <label for="descripcion" class="form-label">Descripción</label>
	    <input type="text" name="descripcion" required="required" class="form-control" id="nombre" aria-describedby="emailHelp">
	  </div>
	  <div class="mb-3">
	    <label for="url" class="form-label">url</label>
	    <input type="text" name="url" required="required" class="form-control" id="apellido">
	  </div>
	  <div class="mb-3">
	    <label for="activo" class="form-label">activo</label>
	    <input type="number" name="activo" required="required" class="form-control" id="activo">
	  </div>
	 

<button type="submit" class="btn btn-primary">enviar</button>
	</form>

</section>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>