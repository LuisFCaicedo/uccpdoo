package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2;

public class CancelarSolicitud implements ComandoSolicitud {
    @Override
    public void ejecutar() {
        System.out.println("La solicitud ha sido cancelada.");
    }
}
