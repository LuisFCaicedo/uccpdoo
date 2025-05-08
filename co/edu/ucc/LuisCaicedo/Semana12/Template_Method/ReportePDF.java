package ucc.LuisCaicedo.Semana12.Template_Method;

// Implementación para PDF
class ReportePDF extends GeneradorReporte {
    protected void generarContenido() {
        System.out.println("Escribiendo contenido en PDF.");
    }
 
    protected void formatear() {
        System.out.println("Formateando como documento PDF.");
    }
}
