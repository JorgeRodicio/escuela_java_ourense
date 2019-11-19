let arrayA = [1,2,3,4,5];
let arrayB = [2,3,4,5,6];

let arraySumaAB = operarArrays(arrayA, arrayB, suma);
arrayEnTabla(arraySumaAB);

let arrayMultAB = operarArrays(arrayA, arrayB, multiplica);
arrayEnTabla(arrayMultAB);

let arrayDivAB = operarArrays(arrayA, arrayB, (x,y) => x / y); //(x,y) => {return x / y}
arrayEnTabla(arrayDivAB);

let arrayRestAB = operarArrays(arrayA, arrayB, resta);
arrayEnTabla(arrayRestAB);

let punto = operarArrays(arrayA, arrayB, funCallPunto);
arrayEnTabla(punto);



function arrayEnTabla(array){
    let tabla = "<table border=2><tr>"

        for (let index = 0; index < array.length; index++) {
            const element = array[index];
            tabla += "<td>&nbsp; " + element + "&nbsp;</td>"
        }
        document.getElementById("contenido").innerHTML += 
            tabla + "</tr></table>";
}

function mostrarPunto(punto){
    document.getElementById("contenido").innerHTML += "<p>" +punto+"</p>";
}