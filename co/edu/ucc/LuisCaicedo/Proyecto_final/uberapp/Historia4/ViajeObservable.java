package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia4;

import java.util.ArrayList;
import java.util.List;

public class ViajeObservable {
    private List<Observador> observadores = new ArrayList<>();
    private IGPSViaje gps;

    public ViajeObservable(IGPSViaje gps) {
        this.gps = gps;
    }

    public void agregarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void eliminarObservador(Observador obs) {
        observadores.remove(obs);
    }

    public void notificarCambio() {
        String ubicacion = gps.obtenerUbicacionActual();
        for (Observador obs : observadores) {
            obs.actualizar(ubicacion);
        }
    }

    public void simularMovimiento() {
        System.out.println("Simulando movimiento del vehículo...");
        notificarCambio();
    }
}