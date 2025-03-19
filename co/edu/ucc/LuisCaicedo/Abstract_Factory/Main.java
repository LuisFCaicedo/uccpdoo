package ucc.LuisCaicedo.Abstract_Factory;

public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();

        Identidad identidad = new Identidad("Luis Caicedo");        
        BancoFactory bancoCorriente = new BancoCorrienteFactory();
        Cuenta cuentaCorriente = bancoCorriente.crearCuenta();
        Tarjeta tarjetaDebito = bancoCorriente.crearTarjeta();
        cuentaCorriente.abrir();
        tarjetaDebito.emitir();

        BancoFactory bancoAhorros = new BancoAhorrosFactory();
        Cuenta cuentaAhorros = bancoAhorros.crearCuenta();
        Tarjeta tarjetaCredito = bancoAhorros.crearTarjeta();
        cuentaAhorros.abrir();
        tarjetaCredito.emitir();

        // Imprimir identidad codificada solo al final
        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("         Cuenta - Abstract Factory           ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}

