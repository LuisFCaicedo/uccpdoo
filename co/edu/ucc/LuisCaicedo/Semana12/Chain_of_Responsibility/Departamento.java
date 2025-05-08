package ucc.LuisCaicedo.Semana12.Chain_of_Responsibility;

// Jefe de Departamento
class JefeDepartamento extends Aprobador {
    public void procesarSolicitud(double monto) {
        if (monto <= 5000) {
            System.out.println("Aprobado por Jefe de Departamento.");
        } else if (siguiente != null) {
            siguiente.procesarSolicitud(monto);
        }
    }
}
