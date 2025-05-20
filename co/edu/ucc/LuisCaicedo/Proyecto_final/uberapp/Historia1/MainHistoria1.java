package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia1;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3.Conductor;
import ucc.LuisCaicedo.Proyecto_final.uberapp.comun.BaseDatosConductores;

import java.util.Scanner;

public class MainHistoria1 {

    public static void ejecutar(Scanner scanner) {
        System.out.println("\n--- Registro de Conductores ---");

        System.out.print("Nombre completo: ");
        String nombre = scanner.nextLine();

        System.out.print("Documento de identidad: ");
        String documento = scanner.nextLine();

        System.out.print("Tipo de licencia: ");
        String licencia = scanner.nextLine();

        System.out.print("¿Tiene seguro activo? (true/false): ");
        boolean tieneSeguro = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Antecedentes de conducción: ");
        String antecedentes = scanner.nextLine();

        PerfilConductor perfil = new PerfilConductor.Builder(nombre, documento, licencia)
                .conSeguroVehiculo(tieneSeguro ? "Sí" : null)
                .conAntecedentes(antecedentes)
                .construir();

        System.out.println("\nPerfil creado:");
        perfil.mostrarPerfil();

        PerfilConductor clon = perfil.clone();
        System.out.println("\nPerfil clonado:");
        clon.mostrarPerfil();


        // Convertir PerfilConductor → Conductor (Historia 3)
        double reputacion = 4.2;  // puedes pedir estos datos también si deseas
        double distancia = 2.0;
        double calificacion = 4.5;
        int viajesRecientes = 10;

        Conductor conductor = new Conductor(
                perfil.getNombre(),
                true,
                "economico",           // tipo de vehículo, puedes pedirlo si deseas
                perfil.tieneSeguro(),
                reputacion,
                distancia,
                calificacion,
                viajesRecientes
        );

        BaseDatosConductores.agregarConductor(conductor);
        System.out.println("\n✅ Conductor registrado en base de datos compartida.");
    }
}