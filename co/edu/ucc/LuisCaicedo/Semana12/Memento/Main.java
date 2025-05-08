package ucc.LuisCaicedo.Semana12.Memento;
// Cliente
public class Main {
    public static void main(String[] args) {
        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();
 
        editor.escribir("Hola");
        historial.guardar(editor.guardar());
 
        editor.escribir(" mundo");
        historial.guardar(editor.guardar());
 
        editor.escribir(" cruel");
 
        System.out.println("Actual: " + editor.getContenido()); // Hola mundo cruel
 
        editor.restaurar(historial.deshacer());
        System.out.println("Undo 1: " + editor.getContenido()); // Hola mundo
 
        editor.restaurar(historial.deshacer());
        System.out.println("Undo 2: " + editor.getContenido()); // Hola

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("Este es un ejemplo del: " + Historial.getPatron());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("               Patron Memento                ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}