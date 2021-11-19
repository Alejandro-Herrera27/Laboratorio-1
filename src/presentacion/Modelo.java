package presentacion;

public class Modelo {
    private VistaInicio ventanaPrincipal;
    
    public void iniciar(){
        getVentana().setSize(1080, 700);
        getVentana().setVisible(true);
    }
    
    public void terminar(){
    }
    //Manipulación de GUI
        public VistaInicio getVentana() {
        if(ventanaPrincipal == null){
            ventanaPrincipal = new VistaInicio(this);
        }
        return ventanaPrincipal;
    }
    public void crearNuevaCuenta(){
        System.out.println("crearNuevaCuenta");
    }
}
