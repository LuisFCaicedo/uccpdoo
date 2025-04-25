package ucc.LuisCaicedo.Semana10.Decorator.Ejercicio3;

public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        Notificacion notificacion = new NotificacionSMS(
                                        new NotificacionEmail(
                                            new NotificacionBasica()));
        
        notificacion.enviar("Hola, esta es una prueba de Notificaciones de Usuario");
        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("Este es un ejemplo del patrón: " + NotificacionSMS.getPatron());


    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("               Patron Decotaror              ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
