package ucc.LuisCaicedo.Semana11.Flyweight;

import java.util.HashMap;

public class FabricaLetras {
    private static final HashMap<Character, ILetra> pool = new HashMap<>();
 
    public static ILetra obtenerLetra(char simbolo) {
        if (!pool.containsKey(simbolo)) {
            pool.put(simbolo, new LetraConcreta(simbolo));
        }
        return pool.get(simbolo);
    }
}

