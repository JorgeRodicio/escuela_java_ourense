//Todo son funciones callback
let suma = function(x,y){
    return x + y;
}

function multiplica(x,y){
    return x * y;
}

let divide = new Function("x","y", "return x / y;");

//Función flecha
let resta = (x,y) =>{
    return x - y;
}

let funCallPunto = function(x,y){
    //let p = "(" + x + ", " + y +")";
    //return p;
    //Usando templates strings de ES6
    return `( ${x} , ${y} )`;
}


//Ejemplos array
//Declaramos un array
// var arrayResult = new Array();
var arrayEjemplo = [];   //Otra manera con notacion JSON
                        //No indicamos el tamaño porque los arrays en Js 
                        //son como los ArrayList<Object> de java
                        //Incluso HashMap<Integer, Object>
arrayEjemplo.push("Primer elemento");
arrayEjemplo[10] = "lo que sea";