package ucc.LuisCaicedo.Proyecto_final;

import java.util.Scanner;

// Importar los módulos correspondientes a cada historia
import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia1.MainHistoria1;
import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.MainHistoria2;
import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3.Historia3_AsignacionConductor;
import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia4.Historia4_Monitoreo;

public class AppPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL - PLATAFORMA DE TRANSPORTE =====");
            System.out.println("1. Historia 1: Registro de Conductores");
            System.out.println("2. Historia 2: Solicitud de Viajes");
            System.out.println("3. Historia 3: Asignación Automática de Conductores");
            System.out.println("4. Historia 4: Monitoreo en Tiempo Real del Viaje");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> MainHistoria1.ejecutar(scanner);
                case 2 -> MainHistoria2.ejecutar(scanner);
                case 3 -> Historia3_AsignacionConductor.ejecutar(scanner);
                case 4 -> Historia4_Monitoreo.ejecutar(scanner);
                case 0 -> System.out.println("Gracias por usar la plataforma. ¡Hasta pronto!");
                default -> System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}