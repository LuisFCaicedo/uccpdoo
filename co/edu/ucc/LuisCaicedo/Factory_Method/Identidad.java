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