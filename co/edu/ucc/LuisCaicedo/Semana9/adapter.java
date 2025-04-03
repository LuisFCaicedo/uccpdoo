package ucc.LuisCaicedo.Semana9;

// Interfaz común para todos los dispositivos GPS
interface DispositivoGPS {
    String obtenerUbicacion();
}

// APIs de dispositivos GPS con sus propios métodos

class Garmin {
    public String coordenadas() {
        return "Garmin: Lat 37.7749, Long -122.4194";
    }
}

class TomTom {
    public String posicion() {
        return "TomTom: Lat 40.7128, Long -74.0060";
    }
}

class Huawei {
    public String localizacion() {
        return "Huawei: Lat 34.0522, Long -118.2437";
    }
}

// Adaptadores para convertir cada API a la interfaz común

class AdaptadorGarmin implements DispositivoGPS {
    private Garmin garmin;

    public AdaptadorGarmin(Garmin garmin) {
        this.garmin = garmin;
    }

    public String obtenerUbicacion() {
        return garmin.coordenadas();
    }
}

class AdaptadorTomTom implements DispositivoGPS {
    private TomTom tomtom;

    public AdaptadorTomTom(TomTom tomtom) {
        this.tomtom = tomtom;
    }

    public String obtenerUbicacion() {
        return tomtom.posicion();
    }
}

class AdaptadorHuawei implements DispositivoGPS {
    private Huawei huawei;

    public AdaptadorHuawei(Huawei huawei) {
        this.huawei = huawei;
    }

    public String obtenerUbicacion() {
        return huawei.localizacion();
    }
    public static String getPatron() {
        return "Patrón Adapter";
    }
}
