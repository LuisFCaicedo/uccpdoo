package ucc.LuisCaicedo.Semana12.Command;

// Comando concreto: Encender Luz
class ComandoEncenderLuz implements Comando {
    private Luz luz;
 
    public ComandoEncenderLuz(Luz luz) {
        this.luz = luz;
    }
 
    public void ejecutar() {
        luz.encender();
    }
}
