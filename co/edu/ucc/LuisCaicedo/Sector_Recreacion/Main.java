package co.edu.ucc.LuisCaicedo.Sector_Recreacion;

public class Main {
    public static void main(String[] args) {
        CanchaReserva cancha = new CanchaReserva();
        cancha.reservarCancha("2025-10-15", "20:00", "Juan Pérez");
        cancha.reservarCancha("2025-10-15", "18:00", "Carlos Gómez");
        cancha.mostrarReservas();
    }
}
