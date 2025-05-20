package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia_Especial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimuladorPrincipal {

    public static void ejecutar(Scanner scanner) {
        System.out.println("\n--- Simulación de viajes concurrentes ---");
        System.out.print("Ingrese cantidad de viajes a simular: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        CentroMonitoreo monitoreo = new CentroMonitoreo();
        List<Thread> hilos = new ArrayList<>();

        for (int i = 1; i <= cantidad; i++) {
            String id = "V" + i;
            String tipoVehiculo = FabricaFlyweight.getTipoVehiculo(i % 2 == 0 ? "Economico" : "Ejecutivo");
            String metodoPago = FabricaFlyweight.getMetodoPago(i % 3 == 0 ? "Tarjeta" : "Efectivo");

            ViajeSimulado viaje = new ViajeSimulado(id, tipoVehiculo, metodoPago);
            viaje.agregarObservador(monitoreo);

            SimuladorViaje hilo = new SimuladorViaje(viaje);
            hilos.add(hilo);
            hilo.start();
        }

        // Esperar que todos los hilos terminen
        for (Thread h : hilos) {
            try {
                h.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("✅ Simulación finalizada.");
    }
}

