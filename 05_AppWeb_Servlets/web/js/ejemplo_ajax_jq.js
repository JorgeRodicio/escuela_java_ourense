$(document).ready(function (){
    $("#btn_peticion_ajax_jq").click(function(){
        //Creamos la peticion AJAX
        $.ajax({
            "url": "./datosjson",
            "type": "GET",
            "success": function(respuestaJson){
                $("#div_datos_json").html(JSON.stringify(respuestaJson));
            },
            "error": function (jqXHR, textStatus, errorThrown){
                console.error("No se ha podido obtener el JSON");
                console.warning(jqXHR);
                console.warning(textStatus);
                console.warning(errorThrown);
                if (jqXHR) {
                    alert("URL no localizada");
                }
            }
        });
        
    });
    
    $("#btn_peticion_ajax_post").click(function(){
        
        let nombre = document.getElementById("nombre").value;
        let email = document.getElementById("email").value;
        
        if("" !== nombre && nombre.length > 1 && email !== ""){
            let expresionNombre = new RegExp("^[A-Z][a-z]+ ?[A-Za-z]*$");
            let expresionEmail = /^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$/;
            
            if(!expresionEmail.test(email)){
                alert("Email invalido");
                return;
            }else if(!expresionNombre.test(nombre)){
                alert("Primera letra mayus, mínimo una minúscula. Apell opcional");
            }else{
                                 
                let datosUsuario = {
                    "nombre": nombre,
                    "email": email
                };

                $.post("./datosjson", datosUsuario, 
                    function(respuesta){
                         $("#div_datos_json").html(JSON.stringify(respuesta));
                });
            }    
        }else{
            alert("Los datos no son válidos");
        }       
    });
});

