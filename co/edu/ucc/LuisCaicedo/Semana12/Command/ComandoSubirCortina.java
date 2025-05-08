package ucc.LuisCaicedo.Semana12.Command;

// Comando concreto: Subir Cortina
class ComandoSubirCortina implements Comando {
    private Cortina cortina;
 
    public ComandoSubirCortina(Cortina cortina) {
        this.cortina = cortina;
    }
 
    public void ejecutar() {
        cortina.subir();
    }
}
