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
    
    private double numero1;
    private double numero2;
    private String tipoOperacion;
    private double resultado;
    
    //Entrada de datos
    public void setNUmero1(double numero1)
    {
        this.numero1=numero1;
    }
    
    public void setNumero2(double numero2)
    {
        this.numero1=numero2;
    }
    
    public double asignacionTipoOperacion(String signo )
    {
     if(signo == "Suma"){
     resultado = numero1 +numero2;
     }else if(signo =="Resta")
     {
     resultado = numero1 - numero2;
     }else if(signo =="Multiplicacion")
     {
     resultado= numero1 * numero2;
     }else{
     if(numero2 == 0){
         
         
     
     }
     }
       return resultado; 
        
    }

        
    
    
    
    
    //Metodos
    public void resultado ()
    {
        
    }
    
    private void guardar()
    {
        
    }
    
    public void m1 ()
    {
        
    }
    
    public void m2()
    {
        
    }
    
    
}
