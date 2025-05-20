package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia7;

import ucc.LuisCaicedo.Proyecto_final.uberapp.comun.BaseDatosViajes;
import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.SolicitudViaje;

import java.util.Scanner;

public class Historia7_Calificaciones {

    public static void ejecutar(Scanner scanner) {
        SolicitudViaje viaje = BaseDatosViajes.obtenerUltimoViaje();

        if (viaje == null || !viaje.getEstado().equals("Completado")) {
            System.out.println("❌ Solo se puede calificar un viaje completado.");
            return;
        }

        ElementoCalificable[] elementos = {
            new ConductorElemento("Luis Conductor"),
            new PasajeroElemento("Juan Pasajero"),
            new VehiculoElemento("XYZ-123")
        };

        VisitanteRegistroCalificacion visitante = new VisitanteRegistroCalificacion(scanner);

        for (ElementoCalificable e : elementos) {
            e.aceptar(visitante);
        }
    }
}