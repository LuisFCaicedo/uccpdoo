package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia8;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.SolicitudViaje;

public class ProxyGestionViaje implements OperacionCritica {

    private final GestionViajeReal gestion;
    private final CaretakerMemento caretaker;
    private final String usuario;

    public ProxyGestionViaje(SolicitudViaje viaje, String usuario, CaretakerMemento caretaker) {
        this.gestion = new GestionViajeReal(viaje);
        this.usuario = usuario;
        this.caretaker = caretaker;
    }

    private boolean estaAutorizado() {
        return usuario.equalsIgnoreCase("admin");
    }

    @Override
    public void cancelarViaje() {
        System.out.println("Intentando cancelar viaje...");
        if (estaAutorizado()) {
            caretaker.guardarEstado(new MementoViaje(gestion.getViaje()));
            gestion.cancelarViaje();
        } else {
            System.out.println("❌ Usuario no autorizado para cancelar el viaje.");
        }
    }

    @Override
    public void ajustarPrecio(double nuevoValor) {
        System.out.println("Intentando ajustar precio...");
        if (estaAutorizado()) {
            caretaker.guardarEstado(new MementoViaje(gestion.getViaje()));
            gestion.ajustarPrecio(nuevoValor);
        } else {
            System.out.println("❌ Usuario no autorizado para ajustar el precio.");
        }
    }

    public void deshacerUltimaOperacion(SolicitudViaje viaje) {
        if (caretaker.getRespaldo() != null) {
            caretaker.getRespaldo().restaurar(viaje);
            System.out.println("🔁 Estado del viaje restaurado: " + viaje.getEstado());
        } else {
            System.out.println("⚠️ No hay un respaldo disponible para restaurar.");
        }
    }
}