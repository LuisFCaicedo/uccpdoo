package ucc.LuisCaicedo.singlleton;
public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();

        Banco banco = Banco.getInstance();
        banco.mostrarNombre();

    String identidad = banco.getIdentidad();
    System.out.println("La indentidad del estudiante en Base64 es: " + identidad);    
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println("    👷     BIENVENIDO A LA UCC      👷      ");
        System.out.println("        Banco Central - Singleton            ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis   ");
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }

}
