package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3;

public class Conductor {
    private String nombre;
    private boolean disponible;
    private String tipoVehiculo;
    private boolean seguroActivo;
    private double reputacion;
    private double distancia;
    private double calificacion;
    private int viajesRecientes;

    public Conductor(String nombre, boolean disponible, String tipoVehiculo,
                     boolean seguroActivo, double reputacion, double distancia,
                     double calificacion, int viajesRecientes) {
        this.nombre = nombre;
        this.disponible = disponible;
        this.tipoVehiculo = tipoVehiculo;
        this.seguroActivo = seguroActivo;
        this.reputacion = reputacion;
        this.distancia = distancia;
        this.calificacion = calificacion;
        this.viajesRecientes = viajesRecientes;
    }

    // Getters
    public String getNombre() { return nombre; }
    public boolean isDisponible() { return disponible; }
    public String getTipoVehiculo() { return tipoVehiculo; }
    public boolean isSeguroActivo() { return seguroActivo; }
    public double getReputacion() { return reputacion; }
    public double getDistancia() { return distancia; }
    public double getCalificacion() { return calificacion; }
    public int getViajesRecientes() { return viajesRecientes; }
}