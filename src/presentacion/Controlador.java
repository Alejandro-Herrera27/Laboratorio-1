package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Controlador implements ActionListener{
    
    private VistaInicio ventana;
    private Modelo modelo;
    
    public Controlador(VistaInicio a) {
        ventana = a;
        modelo = ventana.getModelo();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {   
        JButton boton;
        if(e.getSource() instanceof JButton){
            boton = (JButton) e.getSource();
            if(boton.getText().equals("Agregar cuenta")){
                modelo.crearNuevaCuenta();
            }
        }
        return;   
        }
}
