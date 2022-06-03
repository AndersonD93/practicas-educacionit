/**
 * 
 */


function prueba(){


	const options={
				keyboard: true
		}
		let form1= document.getElementById("formulario2");
		const nombre = form1.nombre.value;
		const email = form1.email.value;
		const check = document.getElementById("check");
		const select = form1.select.value;
			
		
		validarNombre ();
		validarCorreo ();
		validarSelect ();
		validarChecked();
	
	
	function validarNombre (){
		if(nombre.trim()===""){
		const mostar = document.getElementById("mostar")
		mostrar.setAttribute('style', 'display:inline','background-color: red');
		return true 	
	}
	}
	function validarCorreo (){
		if ((!email.match(/[@]/g) || !email.match(/(com)$/g))== true){
		const mostrarcorreo=document.getElementById("mostrarcorreo")
		mostrarcorreo.setAttribute('style', 'display:inline','background-color: red');
		return true
	}
	}
	
	function validarSelect (){
		if (select == "Seleccione categoria"){
		const mostrarselect=document.getElementById("mostrarselect")
		mostrarselect.setAttribute('style', 'display:inline','background-color: red');
		return true
	}
	}
	
	function validarChecked(){
		if (check.checked == false){
		const mostrarcheck=document.getElementById("mostrarcheck")
		mostrarcheck.setAttribute('style', 'display:inline','background-color: red');	
		return true
		}
	}
		
	
		if (validarNombre ()!=true && !validarCorreo() && !validarSelect() && !validarChecked())		
		var myModal = new bootstrap.Modal(document.getElementById('registroModal'), options);
		myModal.show();
		
	}
	
			
