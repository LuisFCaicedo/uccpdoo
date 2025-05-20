package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia_Especial;

public class SimuladorViaje extends Thread {
    private final ViajeSimulado viaje;

    public SimuladorViaje(ViajeSimulado viaje) {
        this.viaje = viaje;
    }

    @Override
    public void run() {
        try {
            ViajeEstado respaldo = viaje.guardarEstado();
            viaje.setEstado("Asignado");
            Thread.sleep(100);
            viaje.setEstado("En curso");
            Thread.sleep(100);
            if (Math.random() < 0.2) {
                viaje.setEstado("Cancelado");
            } else {
                viaje.setEstado("Completado");
            }

            if (Math.random() < 0.1) {
                System.out.println("🛑 Restaurando estado por error...");
                viaje.restaurarEstado(respaldo);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

