package ucc.LuisCaicedo.semana8.EmisionFactura;

interface FormatoFactura {
    void generarFactura(String datos);
}
 
class FormatoPDF implements FormatoFactura {
    public void generarFactura(String datos) {
        System.out.println("Generando factura en PDF: " + datos);
    }
}
 
class FormatoXML implements FormatoFactura {
    public void generarFactura(String datos) {
        System.out.println("Generando factura en XML: " + datos);
    }
}
 
abstract class Factura {
    protected FormatoFactura formato;
 
    public Factura(FormatoFactura formato) {
        this.formato = formato;
    }
 
    public abstract void emitir(String datos);
}
 
class FacturaElectronica extends Factura {
    public FacturaElectronica(FormatoFactura formato) {
        super(formato);
    }
 
    public void emitir(String datos) {
        formato.generarFactura(datos);
    }
    public static String getPatron() {
        return "Patrón Bridge";
    }
}
 
public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        Factura factura1 = new FacturaElectronica(new FormatoPDF());
        factura1.emitir("Factura #789 - Total: $1.200.000");

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("\nEl Patrón de diseño utilizado: " + FacturaElectronica.getPatron());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("                Patron Bridge                ");
        System.out.println("                 Historia 3                  ");
        System.out.println("Como desarrollador de un sistema de facturación electrónica, necesito que el sistema pueda emitir facturas tanto en formato PDF como en XML, dependiendo del cliente.");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
