package ucc.LuisCaicedo.Semana12.Command;

// Invocador: Botón configurable
class Boton {
    private Comando comando;
 
    public Boton(Comando comando) {
        this.comando = comando;
    }
 
    public void presionar() {
        comando.ejecutar();
    }
}
