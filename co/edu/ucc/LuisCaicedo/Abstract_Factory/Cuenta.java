package ucc.LuisCaicedo.Abstract_Factory;
// Producto abstracto: Cuenta
interface Cuenta {
    void abrir();
}

// Producto concreto: Cuenta Corriente
class CuentaCorriente implements Cuenta {
    @Override
    public void abrir() {
        System.out.println("Abriendo cuenta corriente.");
    }
}

// Producto concreto: Cuenta Ahorros
class CuentaAhorros implements Cuenta {
    @Override
    public void abrir() {
        System.out.println("Abriendo cuenta de ahorros.");
    }
}

// Producto abstracto: Tarjeta
interface Tarjeta {
    void emitir();
}

// Producto concreto: Tarjeta Débito
class TarjetaDebito implements Tarjeta {
    @Override
    public void emitir() {
        System.out.println("Emitiendo tarjeta de débito.");
    }
}

// Producto concreto: Tarjeta Crédito
class TarjetaCredito implements Tarjeta {
    @Override
    public void emitir() {
        System.out.println("Emitiendo tarjeta de crédito.");
    }
}

// Fábrica abstracta
interface BancoFactory {
    Cuenta crearCuenta();
    Tarjeta crearTarjeta();
}

// Fábrica concreta para Cuenta Corriente y Tarjeta Débito
class BancoCorrienteFactory implements BancoFactory {
    @Override
    public Cuenta crearCuenta() {
        return new CuentaCorriente();
    }

    @Override
    public Tarjeta crearTarjeta() {
        return new TarjetaDebito();
    }
}

// Fábrica concreta para Cuenta Ahorros y Tarjeta Crédito
class BancoAhorrosFactory implements BancoFactory {
    @Override
    public Cuenta crearCuenta() {
        return new CuentaAhorros();
    }

    @Override
    public Tarjeta crearTarjeta() {
        return new TarjetaCredito();
    }
}