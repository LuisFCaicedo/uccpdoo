package co.edu.ucc.LuisCaicedo.Semana3.Historia2;

import java.util.*;
import java.util.function.Supplier;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();

        Identidad identidad = new Identidad("Luis Caicedo");

        SystemaLiquidacionPension sistema = new SystemaLiquidacionPension();
        sistema.ejecutar();

        System.out.println("Patrón utilizado: " + sistema.getPatron());
        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("         Pension Col - Factory Method        ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
