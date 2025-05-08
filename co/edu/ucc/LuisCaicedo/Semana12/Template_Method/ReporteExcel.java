package ucc.LuisCaicedo.Semana12.Template_Method;

// Implementación para Excel
class ReporteExcel extends GeneradorReporte {
    protected void generarContenido() {
        System.out.println("Escribiendo contenido en celdas Excel.");
    }
 
    protected void formatear() {
        System.out.println("Formateando como hoja Excel.");
    }
    public static String getPatron() {
        return "Patrón Template Method";
    }
}
