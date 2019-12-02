import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { CuentaBanc } from './modelo/CuentaBanc';

// Objeto que Angular se encarga de instanciar como un Singleton
@Injectable({
  providedIn: 'root'
})
export class CuentasRestService {

  //Infiere el tipo a partir del valor
  urlApiRest = "http://localhost:8080/cuentas";
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':'application/json'
    })
  }

  alCambiar: any;

  constructor(private httpCli : HttpClient) { }

  public add(nuevaCuenta : CuentaBanc, lambda : any) : Observable<CuentaBanc> {
    let observable : Observable<CuentaBanc> = this.httpCli.post<CuentaBanc>(this.urlApiRest, nuevaCuenta, this.httpOptions);
    observable.subscribe((datos) =>{
      this.alCambiar(datos);
      lambda(datos);
    });
    return observable;
  }

  public traerTodos() : Observable<CuentaBanc[]> {
    return this.httpCli.get<CuentaBanc[]>(this.urlApiRest);
  }

  public eliminarCuenta(id : number) : Observable<CuentaBanc>{
    let observable : Observable<CuentaBanc> = this.httpCli.delete<CuentaBanc>(this.urlApiRest + "/" + id, this.httpOptions);
    observable.subscribe(this.alCambiar);
    return observable;
  }

  public modificarCuenta(id: number, nuevaCuenta : CuentaBanc) : Observable<CuentaBanc> {
    let observable : Observable<CuentaBanc>;
    observable = this.httpCli.put<CuentaBanc>(this.urlApiRest, nuevaCuenta, this.httpOptions);

    return observable;
  }

}
