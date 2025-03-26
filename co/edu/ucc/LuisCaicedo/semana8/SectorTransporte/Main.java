package ucc.LuisCaicedo.semana8.SectorTransporte;

interface LocalizadorWeb {
    void mostrarUbicacion(String coordenadas);
}
 
class GPSCamion {
    public String obtenerUbicacion() {
        return "Lat: 4.60971, Lon: -74.08175";
    }
}
 
class AdaptadorGPS implements LocalizadorWeb {
    private GPSCamion gps;
 
    public AdaptadorGPS(GPSCamion gps) {
        this.gps = gps;
    }
 
    public void mostrarUbicacion(String coordenadas) {
        String ubicacion = gps.obtenerUbicacion();
        System.out.println("Ubicación del camión: " + ubicacion);
    }
    public static String getPatron() {
        return "Patrón Adapter";
    }
}
 
public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        LocalizadorWeb localizador = new AdaptadorGPS(new GPSCamion());
        localizador.mostrarUbicacion("");

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("\nEl Patrón de diseño utilizado: " + AdaptadorGPS.getPatron());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("                Patron Adapter                ");
        System.out.println("                 Historia 1                  ");
        System.out.println("Como administrador de flotas, necesito integrar el sistema GPS de los camiones, que usa un protocolo diferente, con la plataforma web de monitoreo de rutas en tiempo real.");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
