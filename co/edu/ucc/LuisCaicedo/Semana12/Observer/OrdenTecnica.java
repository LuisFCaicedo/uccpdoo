package ucc.LuisCaicedo.Semana12.Observer;

// Observador 3: Orden de verificación
class OrdenTecnica implements Observador {
    public void actualizar(double temperatura) {
        if (temperatura > 8.0) {
            System.out.println("Orden de revisión técnica generada.");
        }
    }
}
