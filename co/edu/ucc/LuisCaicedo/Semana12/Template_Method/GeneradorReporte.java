package ucc.LuisCaicedo.Semana12.Template_Method;

// Clase abstracta con el método plantilla
abstract class GeneradorReporte {
    public final void generar() {
        obtenerDatos();
        generarEncabezado();
        generarContenido(); // método abstracto
        generarPie();
        formatear();
    }
 
    protected void obtenerDatos() {
        System.out.println("Obteniendo datos de la base...");
    }
 
    protected void generarEncabezado() {
        System.out.println("Generando encabezado del reporte.");
    }
 
    protected void generarPie() {
        System.out.println("Agregando pie de página.");
    }
 
    protected abstract void generarContenido();
    protected abstract void formatear();
}
