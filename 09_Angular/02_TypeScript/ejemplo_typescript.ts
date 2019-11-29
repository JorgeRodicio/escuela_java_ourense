var leng = "TypeScript es JavaScript";


let textoExtra: String = " on tipado fuerte OPCIPONAL";

console.log(leng + textoExtra);

class UnaClase{
	
	private propiedad: String;
	
	constructor(private propiedad: String){	
	}
	
	public getPropiedad() : String {
		return this.propiedad;
	}
	
}
let unObjeto : UnaClase = new UnaClase("Tiene POO");
console.log("Y " + unObjeto.getPropiedad());
textoExtra = 2000;