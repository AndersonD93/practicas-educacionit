<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="./css/bootstrap2.css" rel="stylesheet">
    <link href="./css/styles.css" rel="stylesheet">
    <title>Newtseller</title>
  </head>
  <body>
  
  	<section class="container">
    <h1> Suscribase al Newtseller</h1>
    
		<div class="modal" id="registroModal" role="dialog" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title">Confirma envío de información</h5>
		        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
		      </div>
		      <div class="modal-body">
		        <p>La información ha sido validada de forma correcta.</p>
		         <p>¡¡Pulse el botón enviar información!!</p> 
		        	
		        	<form id="formulario2" action="registroCorrecto.jsp" method="get" class="row g-3 needs-validation" novalidate></form>	
		        
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
		        <button  form="formulario2" type="submit" class="btn btn-primary">Enviar Información</button>
		      </div>
		    </div>
		  </div>
		</div>			
	
      
    <legend>Ingrese sus datos</legend>
    <div class="row"></div>
	 	<div class="col-12">    
	      <label for="nombre" class="form-label">Nombre</label>
	      <input type="text" id="nombre" form="formulario2" class="form-control" placeholder="Nombre">
	      <span id="mostrar" style="display: none">Nombre errado</span>
	    </div>
    
	    <div class="mb-3">
	      <label for="exampleInputEmail1" class="form-label">Correo</label>
	      <input type="email" id="email" form="formulario2" class="form-control" placeholder="name@example.com">
	      <span id="mostrarcorreo" style="display: none">Correo errado</span>
	    </div>
	    
	    <div class="mb-3">
	      <label for="disabledSelect" class="form-label">Seleccione la categoria que desea recibir información</label>
	      <select id="select" class="form-select" form="formulario2"> 
	      	<option>Seleccione categoria</option>
	        <option>Articulos Deportivos</option>
	        <option>Ropa</option>
	        <option>Hogar</option>
	        <option>Papeleria</option>
      	</select>
      	<span id="mostrarselect" style="display: none">No ha seleccionado categoria</span>
    </div>
    <div class="mb-3">
      <div class="form-check">
        <input class="form-check-input" value="check1" type="checkbox" id="check" form="formulario2" >
        <label class="form-check-label" for="disabledFieldsetCheck">
          Acepta terminos de uso de datos
        </label>
      </div>
        <span id="mostrarcheck" style="display: none">No ha seleccionado categoria</span>
    </div>
    

    <button type="submit" onclick="prueba()" id="submitButton" class="btn btn-primary">Submit</button>

	</section>
     
    
  </body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	<script src="js/javascript.js"></script>
</html>
