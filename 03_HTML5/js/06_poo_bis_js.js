var divBis = document.getElementById("contenido_bis");
divBis.style = "background-color: lightgrey";

var mostrarTodosParam = function(primerParam){
    divBis.innerHTML += "<p>Primer parametro: " + primerParam + "</p>";
    for (argumento of arguments) {
        divBis.innerHTML += "Argumento: " + argumento + "<br/>"
    }

    if(typeof(primerParam)=== "undefined")
        divBis.innerHTML += "primerParam no está definido ";
    
    if(primerParam == "1"){
        divBis.innerHTML += "Pues es parecido \"1\" ";
    }else{
        divBis.innerHTML += "No es parecido \"1\"";
    }

    if(primerParam === "1"){
        divBis.innerHTML += "Pues es idéntico \"1\" ";
    }else{
        divBis.innerHTML += "No es idéntico \"1\" ";
    }
    
    divBis.innerHTML += "<br>-----------------------------------------------";
       

    
}

mostrarTodosParam("Un argumento", 50, true, bebida);
mostrarTodosParam();
mostrarTodosParam("1");
mostrarTodosParam(1);

var intentoConversion = parseFloat("veinte"); //Muestra NaN, Not a Number
divBis.innerHTML += "<br/>Convirtiendo resultado: " + intentoConversion;
if(isNaN(intentoConversion))
    divBis.innerHTML += "<br/>No es un número";

divBis.innerHTML += "<br/>El tipo de dato es: " + typeof(intentoConversion);
//Precision double parece
divBis.innerHTML += "<br/>Valor maximo: " + 1.234579876543123456787654321;

