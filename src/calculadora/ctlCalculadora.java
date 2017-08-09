/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author sena
 */
public class ctlCalculadora {
    DAOcalculadora Daocalculadora1 = new DAOcalculadora();
    
    private double numero1;
    private double numero2;
    private String tipoOperacion;
    private double resultado;
    private String tipoboton;
    private double memoria1;
    private double memoria2;
    
    
    
    //Entrada de datos
    public void setNUmero1(double numero1)
    {
        this.numero1=numero1;
    }
    
    public void setNumero2(double numero2)
    {
        this.numero2=numero2;
    }
    
    public double asignacionTipoOperacion(String signo )
    {
     if(signo.equals("Suma")){
     resultado = this.numero1 +this.numero2;
     
     }else if(signo =="Resta")
     {
     resultado = numero1 - numero2;
     }else if(signo =="Multiplicacion")
     {
     resultado= numero1 * numero2;
     }else {
         resultado= numero1/numero2;
     if(numero2 == 0){
         
         
     
     }
     }
       return resultado; 
        
    }
    private void suma(double memoria1,double resultado){
    
    this.memoria1=resultado+memoria1;
    }
    private void resta(double memoria1,double resultado){
    
    this.memoria1=resultado-memoria1;
    }
    
    private void borrar(double memoria1,double resultado){
    
    this.memoria1=0;
    }
    
    private void mostrar(double memoria1,double resultado){
    this.memoria1=memoria1;
    }
    
    
    public double asignacionTipoBoton(String botonS )
    {
     if(botonS.equals("M+")){
        this.memoria1= Daocalculadora1.getresultado();
        suma(resultado,this.memoria1);
        Daocalculadora1.setresultado(this.memoria1);
        
    
     
     }else if(botonS.equals("M-"))
     {
     this.memoria1= Daocalculadora1.getresultado();
        resta(resultado,this.memoria1);
        Daocalculadora1.setresultado(this.memoria1);
        
     }else if(botonS.equals("-"))
     {
     
     }else if(botonS.equals("Mc")){
     this.memoria1= Daocalculadora1.getresultado();
     borrar(resultado,this.memoria1);
     Daocalculadora1.setresultado(this.memoria1);
     memoria2=memoria1;
     }
     
     else if(botonS.equals("Mr"))
     {
     this.memoria1= Daocalculadora1.getresultado(); 
     memoria2=memoria1;
     
     }else {
         memoria1= 0;
     
    }
       return memoria2; 
        
    }
    
    

        
    
    
    
    
    
    
}
