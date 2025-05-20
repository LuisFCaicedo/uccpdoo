package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia8;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.SolicitudViaje;
import ucc.LuisCaicedo.Proyecto_final.uberapp.comun.BaseDatosViajes;

import java.util.Scanner;

public class Historia8_Seguridad {

    public static void ejecutar(Scanner scanner) {
        SolicitudViaje viaje = BaseDatosViajes.obtenerUltimoViaje();

        if (viaje == null) {
            System.out.println("❌ No hay viaje cargado en memoria.");
            return;
        }

        System.out.print("\n🔐 Ingrese su usuario (admin / pasajero): ");
        String usuario = scanner.nextLine();

        CaretakerMemento caretaker = new CaretakerMemento();
        ProxyGestionViaje proxy = new ProxyGestionViaje(viaje, usuario, caretaker);

        int opcion;
        do {
            System.out.println("\n📄 Estado actual del viaje: " + viaje.getEstado());
            System.out.println("1. Cancelar viaje");
            System.out.println("2. Ajustar precio");
            System.out.println("3. Deshacer última operación");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> proxy.cancelarViaje();
                case 2 -> {
                    System.out.print("Ingrese nuevo precio: ");
                    double nuevo = scanner.nextDouble();
                    scanner.nextLine();
                    proxy.ajustarPrecio(nuevo);
                }
                case 3 -> proxy.deshacerUltimaOperacion(viaje);
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}