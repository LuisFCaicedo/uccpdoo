package ucc.LuisCaicedo.Semana3.Logger;

public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();

        Identidad identidad = new Identidad("Luis Caicedo");

        Logger logger1 = Logger.getInstance();
        logger1.log("Inicio de sesión");
        Logger logger2 = Logger.getInstance();
        logger2.log("Transacción realizada");

        String patron = logger1.getPatron();
        System.out.println("Patrón utilizado: " + patron);

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("             Logger - Singleton              ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
        }
}