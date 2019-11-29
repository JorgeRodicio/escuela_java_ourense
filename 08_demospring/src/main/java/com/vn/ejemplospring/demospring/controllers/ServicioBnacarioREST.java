package com.vn.ejemplospring.demospring.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.ejemplospring.demospring.modelo.CuentaBanc;
import com.vn.ejemplospring.demospring.modelo.CuentasDAOpanama;

@RestController
@CrossOrigin(origins = "*")
public class ServicioBnacarioREST {

	// Nosotros no instanciamos, o hace Spring
	// Nosotros no gestionamos la dependencia, lo hace Spring
	// Tampoco asignamos el valor, lo hace Spring
	// Esto es la inyección de dependencias
	@Autowired
	private CuentasDAOpanama repo;
	
	@RequestMapping(path="/cuentas", method = {RequestMethod.POST /*, RequestMethod.DELETE, ...*/ }) //Nos permite capturar varios métodos HTTP
	//@PostMapping //Sólo el método post
	public CuentaBanc crearCuentaAingenuo(@RequestBody CuentaBanc cuenta) {
		System.out.println(">>>>>>>> CuentaBanc recibida ! " + cuenta.toString());
		return repo.save(cuenta);
	}
	
	@RequestMapping(path = "/cuentas", method = RequestMethod.GET)
	public List<CuentaBanc> obtenerTodas(){
		System.out.println(">>>>>>>> GET todas cuentas");
		return repo.findAll();
	}
	
	@DeleteMapping("/cuentas/{id}")
	public void eliminarCuenta(@PathVariable Integer id) {	
		repo.deleteById(id);
		System.out.println(">>>>>>>> DELETE id: " + id);
	}
	
	//TODO: hacer el método put para modificar
	@PutMapping("/cuentas/{id}")
	public CuentaBanc editarCuenta(@PathVariable Integer id, @RequestBody CuentaBanc cuentaModif) {
		if(cuentaModif.getId() == id) {		
			System.out.println(">>>>>>>> MODIFICAR por id: " + id);
			return repo.save(cuentaModif);
		}else {
			System.out.println(">>>>>>>> MODIFICAR por id: " + id + " y " + cuentaModif.getId() + "no son iguales");
			return null;
		}
		
	}
	
}
