package ucc.LuisCaicedo.Semana5.Abstract_Factory;

interface Boton {
    void render();
}
 
// Interfaz común para Ventana
interface Ventana {
    void mostrar();
}
 
// Implementaciones para Light Mode
class BotonLight implements Boton {
    public void render() { System.out.println("Renderizando botón Light"); }
}
class VentanaLight implements Ventana {
    public void mostrar() { System.out.println("Mostrando ventana Light"); }
}
 
// Implementaciones para Dark Mode
class BotonDark implements Boton {
    public void render() { System.out.println("Renderizando botón Dark"); }
}
class VentanaDark implements Ventana {
    public void mostrar() { System.out.println("Mostrando ventana Dark"); }
}
 
// Abstract Factory
interface GUIFactory {
    Boton crearBoton();
    Ventana crearVentana();
    void getPatron();
}
 
// Fábricas concretas
class LightFactory implements GUIFactory {
    public Boton crearBoton() { return new BotonLight(); }
    public Ventana crearVentana() { return new VentanaLight(); }
    public void getPatron() {
        System.out.println("El patrón de diseño utilizado es: Abstract Factory");
    }
}
 
class DarkFactory implements GUIFactory {
    public Boton crearBoton() { return new BotonDark(); }
    public Ventana crearVentana() { return new VentanaDark(); }
    public void getPatron() {
        System.out.println("El patrón de diseño utilizado es: Abstract Factory");
    }
    
}

