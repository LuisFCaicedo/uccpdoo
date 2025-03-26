package ucc.LuisCaicedo.semana8.SectorFacturacion;

interface ReporteNuevo {
    void generar(String datos);
}
 
class SistemaContableAntiguo {
    public void exportar(String contenido) {
        System.out.println("Exportando a sistema contable antiguo: " + contenido);
    }
}
 
class AdaptadorReporte implements ReporteNuevo {
    private SistemaContableAntiguo sistema;
 
    public AdaptadorReporte(SistemaContableAntiguo sistema) {
        this.sistema = sistema;
    }
 
    public void generar(String datos) {
        sistema.exportar(datos);
    }
    public String getPatron() {
        return "Patron Adapter";
    }
}
 
public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        ReporteNuevo reporte = new AdaptadorReporte(new SistemaContableAntiguo());
        reporte.generar("Factura #123 - Total: $50000");

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("\nEl Patrón de diseño utilizado: " + ((AdaptadorReporte) reporte).getPatron());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("                Patron Adapter               ");
        System.out.println("                 Historia 1                  ");
        System.out.println("Como analista financiero, necesito que el nuevo sistema de facturación pueda generar reportes compatibles con el sistema contable antiguo de la empresa, sin cambiar la lógica principal del sistema nuevo.");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
