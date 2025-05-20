package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia6;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.SolicitudViaje;
import ucc.LuisCaicedo.Proyecto_final.uberapp.comun.BaseDatosViajes;

import java.util.Scanner;

public class Historia6_Facturacion {
    public static void ejecutar(Scanner scanner) {
        System.out.println("\n--- Historia 6: Facturación del viaje ---");

        SolicitudViaje viaje = BaseDatosViajes.obtenerUltimoViaje();

        if (viaje == null || !viaje.getEstado().equals("Completado")) {
            System.out.println("❌ No hay un viaje completado disponible para facturar.");
            return;
        }

        FacturaFacade facade = new FacturaFacade();
        facade.generarYMostrarFactura(viaje);
    }
}