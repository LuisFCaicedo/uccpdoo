package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2;

public class InvocadorSolicitud {
    private ComandoSolicitud comando;

    public void setComando(ComandoSolicitud comando) {
        this.comando = comando;
    }

    public void procesar() {
        if (comando != null) {
            comando.ejecutar();
        }
    }
}