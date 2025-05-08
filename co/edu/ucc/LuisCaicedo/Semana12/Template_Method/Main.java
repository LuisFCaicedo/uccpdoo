package ucc.LuisCaicedo.Semana12.Template_Method;

// Cliente
public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        GeneradorReporte pdf = new ReportePDF();
        GeneradorReporte excel = new ReporteExcel();
 
        System.out.println("==== Generando PDF ====");
        pdf.generar();
 
        System.out.println("\n==== Generando Excel ====");
        excel.generar();

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("Este es un ejemplo del: " + ReporteExcel.getPatron());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("          Patron Template Methodo            ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
