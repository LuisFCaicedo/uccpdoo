package ucc.LuisCaicedo.Semana12.Observer;

// Observador 1: Notificación por correo
class NotificadorEmail implements Observador {
    public void actualizar(double temperatura) {
        if (temperatura > 8.0) {
            System.out.println("Email enviado: temperatura alta -> " + temperatura + "°C");
        }
    }
}

