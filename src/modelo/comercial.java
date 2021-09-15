/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.empleado;

/**
 *
 * @author JANUS-H110MCI5
 */
public class comercial extends empleado{
    
    public float comision;
    
    public comercial(String nombre, int edad, double salario,float comision) {
        super(nombre, edad, salario);
        this.comision=comision;
    }


    @Override
    public void plus() {
       
        
     if(super.getEdad()>=31 &&  comision>400.000 ){
         super.setSalario((float) (super.getSalario()+150.000));
         System.out.println(" aplica beneficio ");
         System.out.println("comerciante :"+super.nombre+" salario : "+super.salario );
         JOptionPane.showMessageDialog(null,"aplica beneficio"+
                 "comerciante :"+super.nombre+" salario : "+super.salario); 
     }else{
         System.out.println(" no aplica beneficio ");
         JOptionPane.showMessageDialog(null,"no aplica beneficio"+
                 "comerciante :"+super.nombre+" salario : "+super.salario);   
         System.out.println("comerciante :"+super.nombre+" salario : "+super.salario );
         
     } 
    }
    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString()+ "comercial{" + "comision=" + comision + '}';
    }

  
    
    
    
    
}
