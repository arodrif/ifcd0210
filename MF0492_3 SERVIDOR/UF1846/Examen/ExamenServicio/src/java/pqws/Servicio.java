package pqws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ANABEL RODRIGUEZ
 */
@WebService(serviceName = "Servicio")
public class Servicio {

  
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

 
    @WebMethod(operationName = "Sumar")
    public Integer Sumar(@WebParam(name = "Num1") Integer Num1, 
                        @WebParam(name = "Num2") Integer Num2) {
        //TODO write your implementation code here:
        return Num1 + Num2;
    }
 
@WebMethod(operationName = "Restar")
    public Integer Restar(@WebParam(name = "Num1") Integer Num1, 
                        @WebParam(name = "Num2") Integer Num2) {
        //TODO write your implementation code here:
        return Num1 - Num2;
    }
 @WebMethod(operationName = "Multiplicar")
    public Integer Multiplicar(@WebParam(name = "Num1") Integer Num1, 
                        @WebParam(name = "Num2") Integer Num2) {
        //TODO write your implementation code here:
        return Num1 * Num2;
    }
 @WebMethod(operationName = "Dividir")
    public Integer Dividir(@WebParam(name = "Num1") Integer Num1, 
                        @WebParam(name = "Num2") Integer Num2) {
        //TODO write your implementation code here:
        return Num1 / Num2;
    }
 @WebMethod(operationName = "Raiz")
    public Double Raiz(@WebParam(name = "Num1") Double Num1) {
        //TODO write your implementation code here:
        return (Math.sqrt(Num1));
    }
    @WebMethod(operationName = "Logaritmo")
    public Double Logaritmo(@WebParam(name = "Num1") Double Num1) {
        //TODO write your implementation code here:
        return (Math.log10(Num1));
    }
     @WebMethod(operationName = "Potencia")
    public Integer Potencia(@WebParam(name = "Num1") Integer Num1, 
                     @WebParam(name = "Num2") Integer Num2) {
        //TODO write your implementation code here:
        return  (int)(Math.pow(Num1, Num2));
    }
    @WebMethod(operationName = "Porcentaje")
    public double Porcentaje(@WebParam(name = "Num1") Double Num1, 
                     @WebParam(name = "Num2") Double Num2) {
        //TODO write your implementation code here:
        return (Num1*Num2)/100;
    }
    @WebMethod(operationName = "Hipotenusa")
    public double hipotenusa(@WebParam(name = "Num1") Double Num1, 
                     @WebParam(name = "Num2") Double Num2) {
        //TODO write your implementation code here:
        return Math.sqrt(Math.pow(Num1,2) + Math.pow(Num2,2));
    }
     @WebMethod(operationName = "Seno")
    public Double Seno(@WebParam(name = "Num1") Double Num1) {
        //TODO write your implementation code here:
        return Math.sin(Num1);
    }
      @WebMethod(operationName = "Coseno")
    public Double Coseno(@WebParam(name = "Num1") Double Num1) {
        //TODO write your implementation code here:
        return Math.cos(Num1);
    }
    @WebMethod(operationName = "Tangente")
    public Double Tangente(@WebParam(name = "Num1") Double Num1) {
        //TODO write your implementation code here:
        return Math.tan(Num1);
    }
}
