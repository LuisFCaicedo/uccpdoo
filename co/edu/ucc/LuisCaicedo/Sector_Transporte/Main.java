package co.edu.ucc.LuisCaicedo.Sector_Transporte;

public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();

        Identidad identidad = new Identidad("Luis Caicedo");


        Autobus autobus = new Autobus();
        Boleto boleto = autobus.comprarBoleto("Ciudad A - Ciudad B", "Juan Pérez");
        boleto.mostrarBoleto();

        autobus.getPatron();

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());

    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("           Pasajeros - Factory Method        ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}

