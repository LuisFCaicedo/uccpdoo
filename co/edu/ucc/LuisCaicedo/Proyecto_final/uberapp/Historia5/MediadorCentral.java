package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia5;

public class MediadorCentral implements MediadorSistema {

    @Override
    public void notificarCambioEstado(String nuevoEstado) {
        System.out.println("📣 Notificación global: El viaje ahora está en estado → " + nuevoEstado);

        switch (nuevoEstado) {
            case "Completado" -> System.out.println("✅ Se activa el módulo de calificación y facturación.");
            case "Cancelado" -> System.out.println("⚠️ Se registra soporte y se detiene procesamiento.");
            case "En curso" -> System.out.println("🛰️ Monitoreo GPS activado.");
        }
    }
}