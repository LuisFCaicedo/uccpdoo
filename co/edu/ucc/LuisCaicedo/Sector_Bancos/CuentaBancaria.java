package ucc.LuisCaicedo.Sector_Bancos;

class CuentaBancaria implements Cloneable {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public boolean transferir(CuentaBancaria destino, double monto) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
            destino.saldo += monto;
            return true;
        }
        return false;
    }

    public void mostrarSaldo() {
        System.out.println("Cuenta: " + numeroCuenta + ", Saldo: " + saldo);
    }
    public CuentaBancaria clone() {
        try {
            return (CuentaBancaria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("No se pudo clonar la cuenta bancaria", e);
        }
    }
    public void getPatron() {
        System.out.println("Patrón Creacional Utilizado: Prototype");
    }
}