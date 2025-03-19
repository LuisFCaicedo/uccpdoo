package ucc.LuisCaicedo.Semana3.Singleton;

public class Main {
    public static void main(String[] args) {
        
        imprimirEncabezado();

        Identidad identidad = new Identidad("Luis Caicedo");

        Database db1 = Database.getInstance();
        db1.ejecutarConsulta("SELECT * FROM pedidos");

        String patron = db1.getPatron();
        System.out.println("Patrón utilizado: " + patron);

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
    }

    public static void imprimirEncabezado() {
    System.out.println("=============================================");
    System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
    System.out.println("           Databade - Singleton              ");
    System.out.println("=============================================");
    System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
    System.out.println("Patrones de Diseño Orientado a Odjeto        ");
    System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
    System.out.println("=============================================");
    System.out.println();
    }

}