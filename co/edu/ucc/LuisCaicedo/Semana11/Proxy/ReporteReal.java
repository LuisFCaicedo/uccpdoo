package ucc.LuisCaicedo.Semana11.Proxy;

public class ReporteReal implements IReporte {
    public void mostrar() {
        System.out.println("Mostrando reporte confidencial.");
    }
}
