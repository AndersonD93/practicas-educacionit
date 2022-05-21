<!DOCTYPE html >
<%@page import="aduran.com.bo.Imagen"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

<link href="./css/estilos.css" rel="stylesheet">
<link href="./css/bootstrap.css" rel="stylesheet">
</head>	
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<body>
	<h1>Carrousel de Imagenes</h1>
	
		<div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
		  <div class="carousel-inner">
		    <div class="carousel-item active">
				<%ArrayList <Imagen> listImagen =(ArrayList<Imagen>)request.getAttribute("LISTA");  %>
				 <% for (Imagen im:listImagen){ %>
		    	<%out.print("<img src="+ im.getUrl()+" width=600px heigth=600px");%> class="d-block w-100" >
		     </div>
   				<div class="carousel-item">
		   		<%out.print("<img src="+ im.getUrl()+" width=600px heigth=600px");}%> class="d-block w-100" >
		    </div>
		   
		  </div>
		  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
		    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Previous</span>
		  </button>
		  <button class="carousel-control-next" type="button" data-bs-target="#cmpleCtrols" data-bs-slide="next">
		    <span class="carousel-control-next-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Next</span>
		  </button>
		</div>
		
		<form action="<%=request.getContextPath()%>/CrearImagenServlet" method="POST">
	
				<div class="form-check">
					  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
					  <label class="form-check-label" for="flexRadioDefault1">
					   Desea Crear mas Imagenes
				  </label>
				</div>
				<br>
	  <button type="submit" class="btn btn-primary">Insertar Nueva Imagen</button>
	</form>
		
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	</body>
</html>
