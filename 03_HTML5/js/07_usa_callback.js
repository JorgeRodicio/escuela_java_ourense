function operarArrays(arrX, arrY, operaCllbck){
    // Comprobamos que el tamaño de los arrays son el mismo
    if(arrX.lenght == arrY.lenght){
        //Declaramos un array con la palabra var: ámbito de función
        //A diferencia de let de ES6, que sí es ámbito de bloque
        var arrayResult = new Array(arrX.lenght);
        for (let i = 0; i < arrX.length; i++) {           
            arrayResult[i] = operaCllbck(arrX[i], arrY[i]);    
        }
    }
    return arrayResult;
}