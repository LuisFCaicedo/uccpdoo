package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia5;

import java.util.Scanner;
import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.SolicitudViaje;
import ucc.LuisCaicedo.Proyecto_final.uberapp.comun.BaseDatosViajes;

public class Historia5_Estados {

    public static void ejecutar(Scanner scanner) {
        System.out.println("\n--- Historia 5: Gestión de estados del viaje ---");

        // 🔗 Obtener viaje real guardado en Historia 2
        SolicitudViaje viajeGuardado = BaseDatosViajes.obtenerUltimoViaje();
        if (viajeGuardado == null) {
            System.out.println("⚠️ No hay viaje registrado aún. Registre uno desde la Historia 2.");
            return;
        }

        MediadorSistema mediador = new MediadorCentral();
        ViajeConEstado viaje = new ViajeConEstado(mediador, viajeGuardado);

        int opcion;
        do {
            System.out.println("\n📍 Estado actual: " + viaje.getEstadoActual());
            System.out.println("1. Asignar viaje");
            System.out.println("2. Iniciar viaje");
            System.out.println("3. Completar viaje");
            System.out.println("4. Cancelar viaje");
            System.out.println("5. Ver detalles del viaje");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una acción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> viaje.asignar();
                case 2 -> viaje.iniciar();
                case 3 -> viaje.completar();
                case 4 -> viaje.cancelar();
                case 5 -> {
                    System.out.println("\n📄 Detalles del viaje:");
                    System.out.println("Origen: " + viaje.getSolicitud().getOrigen());
                    System.out.println("Destino: " + viaje.getSolicitud().getDestino());
                    System.out.println("Método de pago: " + viaje.getSolicitud().getMetodoPago());
                    System.out.println("Estado sincronizado: " + viaje.getSolicitud().getEstado());
                }
                case 0 -> System.out.println("Volviendo al menú...");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}