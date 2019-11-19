//Notacion JSON: JavaScript Object Notation
// Lo que se puede almacena en XML se puede convertir a JSON y viceversa
//Todo se puede almacenar como JSON

var unObjeto = { }; //new Object
var otroObjeto = {
    "prop_1": "Propiedad uno",
    "prop_2": "Propiedad dos",
    "prop_3": 'Propiedad tres',
    "prop_4": "Propiedad cuatro",

    toString:  function(){
        return "Propiedades: "+
        this.prop_1 +"; "+
        this.prop_2 +"; "+
        this.prop_3 +"; "+
        this.prop_4 +"; "+
        this.prop_5          
    },

    toStringAll: function(){
        var strProp = "Lista de propiedades: ";

        for (var i = 0; i < 20; i++){
            if(typeof(this["prop_" + i] ) !== "undefined"){
                strProp += this["prop_" + i] + "; ";
            }     
        }
        return strProp;
    },

    toStringAllProp: function(){
        var strProp = "Lista de TODAS propiedades: ";
        for (key in this){
            if(key.indexOf("prop_") >=0)
                strProp += this[key] + "; ";
        }
        return strProp;
    },

    toStringAllProp2: function(){
        var strProp = "Lista de TODAS propiedades VERSION 2: ";
        var largo = Object.keys(this).length;
        var j = 1;

        for (var i = 0; i < largo; i++){   
            if(Object.keys(this)[i].indexOf("prop_") >= 0){
                strProp += Object.values(this)[i] + " ";       
            }     
        }
        return strProp;
    }
}
otroObjeto.prop_5 = "Propiedad cinco";
otroObjeto.prop_9 = "Propiedad nueve";
var divTris = document.getElementById("contenido_tris");
divTris.innerHTML += "<br>" + otroObjeto.toString();
divTris.innerHTML += "<br>" + otroObjeto.toStringAll();
divTris.innerHTML += "<br>" + otroObjeto.toStringAllProp();
divTris.innerHTML += "<br>" + otroObjeto.toStringAllProp2();