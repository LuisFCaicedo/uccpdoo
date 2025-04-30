package ucc.LuisCaicedo.Semana11.Proxy;

public class ProxyReporte implements IReporte {
    private ReporteReal reporteReal;
    private String rolUsuario;
 
    public ProxyReporte(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }
 
    public void mostrar() {
        if ("gerente".equalsIgnoreCase(rolUsuario)) {
            if (reporteReal == null) {
                reporteReal = new ReporteReal();
            }
            reporteReal.mostrar();
        } else {
            System.out.println("Acceso denegado: " + rolUsuario);
        }
    }
    public static String getPatron() {
        return "Patrón Proxy";
    }
}
