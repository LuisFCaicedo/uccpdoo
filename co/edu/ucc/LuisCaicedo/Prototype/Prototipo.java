package co.edu.ucc.LuisCaicedo.Prototype;
// Prototipo
interface CuentaBancaria extends Cloneable {
    CuentaBancaria clone() throws CloneNotSupportedException;
    void mostrarInfo();
}

// Producto concreto: Cuenta de Ahorros
class CuentaAhorros implements CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaAhorros(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public CuentaBancaria clone() throws CloneNotSupportedException {
        return (CuentaAhorros) super.clone();
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cuenta de Ahorros - Titular: " + titular + ", Saldo: " + saldo);
    }
}

