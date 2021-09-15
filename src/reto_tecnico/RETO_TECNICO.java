/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_tecnico;

import controlador.controladorComercio;
import modelo.comercial;
import modelo.empleado;
import vista.empleados;

/**
 *
 * @author JANUS-H110MCI5
 */
public class RETO_TECNICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        comercial c1=new comercial("jake hola ",90,450.000, (float) 450.000);
        empleados c3=new  empleados();
        c1.plus();
        
    }
    
}
