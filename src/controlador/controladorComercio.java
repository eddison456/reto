/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.comercial;
import vista.empleados;

/**
 *
 * @author JANUS-H110MCI5
 */
public class controladorComercio implements ActionListener {
    
   
    comercial comercio;
    empleados empleado;

    public controladorComercio(empleados empleado,comercial comercio) {
        this.comercio = new comercial("..", 0, 0, 0);
        this.empleado = new empleados();
        empleado.getVerificar().addActionListener(this); ;
         System.out.println("tehth");
         System.out.println(comercio.nombre);
    }
    
    public void iniciar(){
        empleado.setTitle("arranque");
        empleado.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==empleado.getVerificar()){
            JOptionPane.showMessageDialog(empleado,"boton m");
        }
        
      
    }
    
    
}
