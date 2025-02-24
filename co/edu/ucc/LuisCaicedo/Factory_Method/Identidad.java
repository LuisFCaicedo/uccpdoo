package co.edu.ucc.LuisCaicedo.Factory_Method;
import java.util.Base64;
// Clase Identidad para manejar la codificación en Base64
public class Identidad {
    private String nombre;

    public Identidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCodificado() {
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }
}

// Producto abstracto
interface Medicamento {
    void administrar();
}

// Producto concreto: Analgésico
class Analgesico implements Medicamento {
    @Override
    public void administrar() {
        System.out.println("Administrando analgésico para el dolor.");
    }
}

// Producto concreto: Antibiótico
class Antibiotico implements Medicamento {
    @Override
    public void administrar() {
        System.out.println("Administrando antibiótico para la infección.");
    }
}

// Creador abstracto
abstract class Farmacia {
    public abstract Medicamento crearMedicamento();

    public void recetarMedicamento() {
        Medicamento medicamento = crearMedicamento();
        medicamento.administrar();
    }
}

// Creador concreto para Analgésico
class FarmaciaAnalgesico extends Farmacia {
    @Override
    public Medicamento crearMedicamento() {
        return new Analgesico();
    }
}

// Creador concreto para Antibiótico
class FarmaciaAntibiotico extends Farmacia {
    @Override
    public Medicamento crearMedicamento() {
        return new Antibiotico();
    }
}



