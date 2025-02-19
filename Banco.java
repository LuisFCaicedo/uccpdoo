import java.util.Base64;

public class Banco {
    private static Banco instance;
    private String nombreBanco;
    private String identidad;
    
    private Banco() {
        nombreBanco = "Banco Central";
        identidad = "Luis Fernando Caicedo";
    }

    public static Banco getInstance() {
        if (instance == null) {
            instance = new Banco();
        }
        return instance;
    }

    public void mostrarNombre() {
        System.out.println("Bienvenido al " + nombreBanco);

    }

    public String getIdentidad() {
        return Base64.getEncoder().encodeToString(identidad.getBytes());
    }
}
