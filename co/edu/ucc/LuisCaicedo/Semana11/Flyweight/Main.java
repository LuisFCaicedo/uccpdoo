package ucc.LuisCaicedo.Semana11.Flyweight;

public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        ILetra letraA1 = FabricaLetras.obtenerLetra('A');
        ILetra letraA2 = FabricaLetras.obtenerLetra('A');
        ILetra letraB = FabricaLetras.obtenerLetra('B');
 
        letraA1.mostrar("1");
        letraA2.mostrar("2");
        letraB.mostrar("3");

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("Este es un ejemplo del: " + LetraConcreta.getPatron());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("               Patron Flyweight              ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}

