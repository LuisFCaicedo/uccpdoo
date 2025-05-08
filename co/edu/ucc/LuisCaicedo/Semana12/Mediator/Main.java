package ucc.LuisCaicedo.Semana12.Mediator;

public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        TorreControl torre = new TorreDeControl();
 
        Participante avion1 = new Avion("LATAM 123", torre);
        Participante controlador = new Controlador("ATC Norte", torre);
        Participante pista = new Pista("Pista A", torre);
 
        avion1.enviar("Solicito autorización para aterrizar");
        controlador.enviar("Autorizado a aterrizar");

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("Este es un ejemplo del: " + Pista.getPatron());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("               Patron Madiator               ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
