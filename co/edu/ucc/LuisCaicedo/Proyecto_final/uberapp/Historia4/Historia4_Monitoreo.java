package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia4;

import java.util.Scanner;

public class Historia4_Monitoreo {
    public static void ejecutar(Scanner scanner) {
        System.out.println("\n--- Historia 4: Monitoreo del viaje ---");
        System.out.println("Seleccione proveedor GPS: ");
        System.out.println("1. Google Maps");
        System.out.println("2. Waze");
        System.out.println("3. OpenStreetMap");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        IGPSViaje gps;
        switch (opcion) {
            case 1 -> gps = new GPSGoogleAdapter();
            case 2 -> gps = new GPSWazeAdapter();
            case 3 -> gps = new GPSOpenStreetAdapter();
            default -> {
                System.out.println("Opción inválida. Se usará Google.");
                gps = new GPSGoogleAdapter();
            }
        }

        ViajeObservable viaje = new ViajeObservable(gps);
        viaje.agregarObservador(new PasajeroObservador());
        viaje.agregarObservador(new CentroMonitoreoObservador());

        System.out.println("\nIniciando monitoreo del viaje...");
        viaje.simularMovimiento();
    }
}
