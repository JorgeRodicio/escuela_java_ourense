var leng = "TypeScript es JavaScript";
var textoExtra = " on tipado fuerte OPCIPONAL";
console.log(leng + textoExtra);
var UnaClase = (function () {
    function UnaClase(propiedad) {
        this.propiedad = propiedad;
    }
    UnaClase.prototype.getPropiedad = function () {
        return this.propiedad;
    };
    return UnaClase;
})();
var unObjeto = new UnaClase("Tiene POO");
console.log("Y " + unObjeto.getPropiedad());
textoExtra = 2000;
