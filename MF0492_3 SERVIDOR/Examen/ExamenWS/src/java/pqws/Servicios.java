package pqws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


/**
 *
 * @author ANABEL RODRIGUEZ
 */
@WebService(serviceName = "Servicios")
public class Servicios {

    @WebMethod(operationName = "Sumar")
     public int Sumar(@WebParam(name = "num1") int num1, 
                      @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return num1+num2;
    }

   
    @WebMethod(operationName = "Restar")
    public int Restar(@WebParam(name = "num1") int num1, 
                     @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return num1-num2;
    }
    
    @WebMethod(operationName = "Multiplicar")
    public int Multiplicar(@WebParam(name = "num1") int num1, 
                     @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return num1*num2;
    }
    @WebMethod(operationName = "Dividir")
    public int Dividir(@WebParam(name = "num1") int num1, 
                     @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return num1/num2;
    }
   
    @WebMethod(operationName = "Raiz")
    public Double Raiz(@WebParam(name = "num1") Double num1) {
        //TODO write your implementation code here:
        return (Math.sqrt(num1));
    }
      @WebMethod(operationName = "Logaritmo")
    public Double Logaritmo(@WebParam(name = "num1") Double num1) {
        //TODO write your implementation code here:
        return (Math.log10(num1));
    }
    @WebMethod(operationName = "Potencia")
    public int Potencia(@WebParam(name = "num1") int num1, 
                     @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return  (int)(Math.pow(num1, num2));
    }
    @WebMethod(operationName = "Porcentaje")
    public double Porcentaje(@WebParam(name = "num1") int num1, 
                     @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return (num1*num2)/100;
    }
    @WebMethod(operationName = "Hipotenusa")
    public double hipotenusa(@WebParam(name = "num1") int num1, 
                     @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return Math.sqrt(Math.pow(num1,2) + Math.pow(num2,2));
    }
    
}
