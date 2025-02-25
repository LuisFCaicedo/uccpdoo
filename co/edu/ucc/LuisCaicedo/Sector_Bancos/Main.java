package co.edu.ucc.LuisCaicedo.Sector_Bancos;

public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();

        Identidad identidad = new Identidad("Luis Caicedo");

        CuentaBancaria cuenta1 = new CuentaBancaria("123456", 1000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("654321", 500.0);

        cuenta1.transferir(cuenta2, 200.0);

        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();

        cuenta1.getPatron();

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("           Cuanta Bancaria - Prototype       ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}

