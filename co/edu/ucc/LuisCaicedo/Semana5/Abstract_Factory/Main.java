package ucc.LuisCaicedo.Semana5.Abstract_Factory;

// Cliente
public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new DarkFactory(); // Puede cambiarse por LightFactory
        Boton boton = factory.crearBoton();
        Ventana ventana = factory.crearVentana();
        boton.render();
        ventana.mostrar();
    }
}
