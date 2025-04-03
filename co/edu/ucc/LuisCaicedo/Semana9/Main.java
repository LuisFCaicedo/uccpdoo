package ucc.LuisCaicedo.Semana9;

public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        // Creación de dispositivos GPS con sus adaptadores
        DispositivoGPS garmin = new AdaptadorGarmin(new Garmin());
        DispositivoGPS tomtom = new AdaptadorTomTom(new TomTom());
        DispositivoGPS huawei = new AdaptadorHuawei(new Huawei());

        // Creación de interfaces de usuario
        InterfazRastreo interfazEscritorio = new PanelEscritorio();
        InterfazRastreo interfazMovil = new PanelMovil();

        // Creación del sistema de rastreo con diferentes interfaces
        RastreadorVehicular rastreoEscritorio = new SistemaRastreo(interfazEscritorio);
        RastreadorVehicular rastreoMovil = new SistemaRastreo(interfazMovil);

        // Prueba con distintos dispositivos en ambas plataformas
        rastreoEscritorio.actualizarUbicacion(garmin);
        rastreoMovil.actualizarUbicacion(tomtom);
        rastreoEscritorio.actualizarUbicacion(huawei);

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("\nEl Patrón de diseño utilizado: " + AdaptadorHuawei.getPatron());
        System.out.println("\nEl Patrón de diseño utilizado: " + SistemaRastreo.getPatron());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("           Patron Bridge y Adapter           ");
        System.out.println("          integra Adapter + Bridge           ");
        System.out.println("Como desarrollador de un sistema de facturación electrónica, necesito que el sistema pueda emitir facturas tanto en formato PDF como en XML, dependiendo del cliente.");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
