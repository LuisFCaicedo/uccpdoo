package ucc.LuisCaicedo.Prototype;

public class Main {
    public static void main(String[] args) {
        imprimirEncabezado();

        Identidad identidad = new Identidad("Luis Caicedo");
        try {
            CuentaAhorros cuentaOriginal = new CuentaAhorros("Carlos Gómez", 1000.0);
            CuentaAhorros cuentaClonada = (CuentaAhorros) cuentaOriginal.clone();

            cuentaOriginal.mostrarInfo();
            cuentaClonada.mostrarInfo();

            cuentaClonada.mostrarInfo();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // Imprimir identidad codificada solo al final
        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("         Cuenta Prototipo - Prototype        ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}