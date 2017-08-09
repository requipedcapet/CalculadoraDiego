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
public class DAOcalculadora {
 Conexion con=new Conexion();
 Helper sql=new Helper(); 
 private double resultado = 0;
 public void insertnumer(double resultado ){
     
     con.search(sql.search(), resultado);
 }
    
 public void setresultado(double resultado1)
 {
 this.resultado=resultado1;
 }
 public double getresultado(){return this.resultado;}
    
    
    
  
    
    
    

}
