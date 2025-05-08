package ucc.LuisCaicedo.Semana12.Observer;

// Observador 2: Registro en sistema
class RegistroEvento implements Observador {
    public void actualizar(double temperatura) {
        if (temperatura > 8.0) {
            System.out.println("Evento registrado en base de datos -> " + temperatura + "°C");
        }
    }
}

