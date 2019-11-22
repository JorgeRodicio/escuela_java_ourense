//Manera ES5
function GestorEventosES5(inputId, btnId, divId){
    this.input = document.getElementById(inputId);
    this.boton = document.getElementById(btnId);
    this.div = document.getElementById(divId);

    //Hay que guardar la funcion en una variable para añadir un listener y eliminarlo
    this.funcionCallBackAlPulsarBIND = this.funcionCallBackAlPulsar.bind(this);
    
    this.boton.addEventListener("click", this.funcionCallBackAlPulsarBIND);
    this.boton.addEventListener("click", this.funcionCallBackAlPulsar_Dos.bind(this));
}

GestorEventosES5.prototype.funcionCallBackAlPulsar = function (evento) {
    this.input.value = "Type evento: " + evento.type;                      
    evento.currentTarget.value = "Puede repetir";
    this.div.innerHTML += "evento.currentTarget.id = " + evento.currentTarget.id;
    this.div.className = "div-marco";
    // Al hacer el removeEventListener es la manera de hacer que sólo lo puedas pulsar una vez
    this.boton.removeEventListener("click", this.funcionCallBackAlPulsarBIND);
}


GestorEventosES5.prototype.funcionCallBackAlPulsar_Dos = function (evento)  {
    var color1 = Math.floor(Math.random() * 255); 
    var color2 = Math.floor(Math.random() * 255); 
    var color3 = Math.floor(Math.random() * 255); 

    this.input.style = "background-color: rgb(" + color1 + ", " + color2 + ", " + color3 + ")";
    //boton.removeEventListener("click", funcionCallBackAlPulsar_Dos);
}


//Manera ES6
class GestorEventos{
            
    constructor(id_input, id_boton, id_div){
        this.input = document.getElementById(id_input);
        this.boton = document.getElementById(id_boton);
        this.div = document.getElementById(id_div);
     
        this.boton.addEventListener("click", this.funcionCallBackAlPulsar);
        this.boton.addEventListener("click", this.funcionCallBackAlPulsar_Dos);
    }
    
    funcionCallBackAlPulsar = (evento) => {
        this.input.value = "Type evento: " + evento.type;                      
        evento.currentTarget.value = "Puede repetir";
        this.div.innerHTML += "evento.currentTarget.id = " + evento.currentTarget.id;
        this.div.className = "div-marco";
        // Al hacer el removeEventListener es la manera de hacer que sólo lo puedas pulsar una vez
        this.boton.removeEventListener("click", this.funcionCallBackAlPulsar);
    }
   

    funcionCallBackAlPulsar_Dos = (evento) => {
        var color1 = Math.floor(Math.random() * 255); 
        var color2 = Math.floor(Math.random() * 255); 
        var color3 = Math.floor(Math.random() * 255); 

        this.input.style = "background-color: rgb(" + color1 + ", " + color2 + ", " + color3 + ")";
        //boton.removeEventListener("click", funcionCallBackAlPulsar_Dos);
    }

    

    
}