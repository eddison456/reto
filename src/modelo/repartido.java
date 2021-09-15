/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;
import modelo.empleado;

/**
 *
 * @author JANUS-H110MCI5
 */
public class repartido extends empleado {
    
    public String zona;

    public repartido(String nombre, int edad, double salario,String zona) {
        super(nombre, edad, salario);
        this.zona=zona;
    }

    @Override
    public void plus() {
        if(super.edad<=24 && "zona 3".equals(zona)){
            super.setSalario((float) (super.getSalario()+150.000));
            System.out.println(" aplica beneficio");
            System.out.println(" "+super.nombre+" salario : "+super.salario );
            JOptionPane.showMessageDialog(null,"aplica beneficio"+
                 "comerciante :"+super.nombre+" salario : "+super.salario);
        }else{
             System.out.println("no aplica beneficio");
            System.out.println(super.nombre+" salario : "+super.salario );
            JOptionPane.showMessageDialog(null,"no aplica beneficio"+
                 "comerciante :"+super.nombre+" salario : "+super.salario);
            
        }
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() +"repartido{" + "zona=" + zona + '}';
    }
    
    
    
    
    
    
}
