package ucc.LuisCaicedo.Semana12.Chain_of_Responsibility;

// Supervisor
class Supervisor extends Aprobador {
    public void procesarSolicitud(double monto) {
        if (monto <= 500) {
            System.out.println("Aprobado por Supervisor.");
        } else if (siguiente != null) {
            siguiente.procesarSolicitud(monto);
        }
    }
    public static String getPatron() {
        return "Patrón Chain of Responsibility ";
    }
}
