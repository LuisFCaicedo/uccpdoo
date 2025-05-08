package ucc.LuisCaicedo.Semana12.Command;
// Cliente
public class Main {
    public static void main(String[] args) {
        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        Luz luz = new Luz();
        Cortina cortina = new Cortina();
 
        Comando cmdLuz = new ComandoEncenderLuz(luz);
        Comando cmdCortina = new ComandoSubirCortina(cortina);
 
        Boton boton1 = new Boton(cmdLuz);
        Boton boton2 = new Boton(cmdCortina);
 
        boton1.presionar(); // Luz encendida
        boton2.presionar(); // Cortina subida

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("Este es un ejemplo del: " + Cortina.getPatron());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("               Patron Command                ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
