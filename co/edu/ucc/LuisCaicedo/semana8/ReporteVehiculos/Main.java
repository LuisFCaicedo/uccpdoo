package ucc.LuisCaicedo.semana8.ReporteVehiculos;

interface ModoReporte {
    void imprimir(String contenido);
}
 
class Consola implements ModoReporte {
    public void imprimir(String contenido) {
        System.out.println("Reporte en consola: " + contenido);
    }
}
 
class ArchivoTexto implements ModoReporte {
    public void imprimir(String contenido) {
        System.out.println("Guardando en archivo: " + contenido);
    }
}
 
abstract class ReporteVehiculo {
    protected ModoReporte salida;
 
    public ReporteVehiculo(ModoReporte salida) {
        this.salida = salida;
    }
 
    public abstract void generar(String estado);
}
 
class ReporteEstado extends ReporteVehiculo {
    public ReporteEstado(ModoReporte salida) {
        super(salida);
    }
 
    public void generar(String estado) {
        salida.imprimir("Estado del vehículo: " + estado);
    }
    public static String getPatron() {
        return "Patrón Bridge";
    }
}
 
public class Main {
    public static void main(String[] args) {


        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        ReporteVehiculo reporte = new ReporteEstado(new Consola());
        reporte.generar("Motor funcionando, llantas en buen estado");

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("\nEl Patrón de diseño utilizado: " + ReporteEstado.getPatron());

    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("                Patron Bridge                ");
        System.out.println("                 Historia 4                  ");
        System.out.println("Como supervisor de mantenimiento, quiero que el sistema de monitoreo pueda generar reportes del estado de los vehículos con distintas salidas: en pantalla, archivo de texto o correo electrónico, sin modificar la lógica de captura de datos.");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
