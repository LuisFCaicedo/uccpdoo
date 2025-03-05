package ucc.LuisCaicedo.Semana5.Builder;

public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        Usuario usuario = new Usuario.UsuarioBuilder("Juan Pérez")
                .setEdad(30)
                .setDireccion("Av. Principal 123")
                .setTelefono("123456789")
                .build();
                usuario.getPatron();
        
        System.out.println(usuario);

        // Imprimir identidad codificada solo al final
        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷          BIENVENIDO A LA UCC      👷    ");
        System.out.println("              Atributos - Builder            ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}

