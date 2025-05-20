package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3;

import java.util.*;

public class Historia3_AsignacionConductor {

    public static void ejecutar(Scanner scanner) {
        System.out.println("\n--- Asignación Automática de Conductores ---");

        List<Conductor> conductores = new ArrayList<>();

        System.out.print("¿Cuántos conductores desea registrar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nConductor #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("¿Está disponible? (true/false): ");
            boolean disponible = scanner.nextBoolean();

            System.out.print("Tipo de vehículo (economico / ejecutivo): ");
            scanner.nextLine(); // limpiar
            String tipoVehiculo = scanner.nextLine();

            System.out.print("¿Tiene seguro activo? (true/false): ");
            boolean seguroActivo = scanner.nextBoolean();

            System.out.print("Reputación (1.0 a 5.0): ");
            double reputacion = scanner.nextDouble();

            System.out.print("Distancia al pasajero (km): ");
            double distancia = scanner.nextDouble();

            System.out.print("Calificación general (1.0 a 5.0): ");
            double calificacion = scanner.nextDouble();

            System.out.print("Número de viajes recientes: ");
            int viajesRecientes = scanner.nextInt();
            scanner.nextLine(); // limpiar

            conductores.add(new Conductor(nombre, disponible, tipoVehiculo, seguroActivo,
                    reputacion, distancia, calificacion, viajesRecientes));
        }

        System.out.print("\nTipo de vehículo solicitado por el pasajero: ");
        String tipoSolicitado = scanner.nextLine();

        System.out.println("\nSeleccione estrategia de asignación:");
        System.out.println("1. Más cercano");
        System.out.println("2. Mejor calificado");
        System.out.println("3. Mejor desempeño reciente");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        EstrategiaAsignacion estrategia;

        switch (opcion) {
            case 1 -> estrategia = new AsignacionPorCercania();
            case 2 -> estrategia = new AsignacionPorCalificacion();
            case 3 -> estrategia = new AsignacionPorDesempeno();
            default -> {
                System.out.println("Opción inválida. Se usará estrategia por cercanía.");
                estrategia = new AsignacionPorCercania();
            }
        }

        AsignadorConductores asignador = new AsignadorConductores(estrategia);
        Conductor asignado = asignador.asignarConductor(conductores, tipoSolicitado);

        System.out.println("\nResultado:");
        if (asignado != null) {
            System.out.println("✅ Conductor asignado: " + asignado.getNombre());
        } else {
            System.out.println("⚠️ No hay conductores disponibles que cumplan los filtros.");
        }
    }
}