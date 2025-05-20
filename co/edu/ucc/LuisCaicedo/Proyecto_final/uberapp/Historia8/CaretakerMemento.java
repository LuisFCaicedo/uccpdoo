package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia8;

public class CaretakerMemento {
    private MementoViaje respaldo;

    public void guardarEstado(MementoViaje memento) {
        this.respaldo = memento;
    }

    public MementoViaje getRespaldo() {
        return respaldo;
    }
}