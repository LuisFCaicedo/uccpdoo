package ucc.LuisCaicedo.Semana12.State;

public class Main {
    public static void main(String[] args) {
        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        Cajero cajero = new Cajero();
         cajero.insertarTarjeta();
        cajero.ingresarPin(1111);
        cajero.ingresarPin(1234);
        cajero.retirarDinero(200);

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("Este es un ejemplo del: " + Autenticado.getPatron());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("               Patron State                  ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
