package ucc.LuisCaicedo.Semana3.Historia2;

import java.util.*;
import java.util.function.Supplier;
import java.text.NumberFormat;
import java.util.Locale;

// Interfaz base para la estrategia de cálculo
interface PensionCalcul {
    double calcularPension(double salario);
}

// Implementaciones de las leyes de pensión
class Ley78 implements PensionCalcul {
    public double calcularPension(double salario) {
        return salario * 15;
    }
}

class Ley86 implements PensionCalcul {
    public double calcularPension(double salario) {
        return salario * 5;
    }
}

class Ley98 implements PensionCalcul {
    public double calcularPension(double salario) {
        return salario * 2.5;
    }
}

class Ley100 implements PensionCalcul {
    private List<Double> ultimosSalarios;
    
    public Ley100(List<Double> ultimosSalarios) {
        this.ultimosSalarios = ultimosSalarios;
    }
    
    public double calcularPension(double salario) {
        double suma = 0;
        for (double s : ultimosSalarios) {
            suma += s;
        }
        return suma / ultimosSalarios.size();
    }
}

class LeyPetro implements PensionCalcul {
    public double calcularPension(double salario) {
        if (salario > 3.5 * 1400000) {
            return 3.5 * 1400000;
        } else {
            return salario * 0.7;
        }
    }
}

// Factory Method
class PensionFactory {
    public static PensionCalcul getCalculator(String ley, Double... salarios) {
        switch (ley) {
            case "78":
                return new Ley78();
            case "86":
                return new Ley86();
            case "98":
                return new Ley98();
            case "Petro":
                return new LeyPetro();
            case "100":
                return new Ley100(Arrays.asList(salarios));
            default:
                throw new IllegalArgumentException("Ley no válida: " + ley);
        }
    }
}

class SystemaLiquidacionPension {
    public void ejecutar() {
        List<Double> pensiones = new ArrayList<>(15); // Se inicializa con una capacidad estimada
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        
        // Ley 78
        for (int i = 0; i < 3; i++) {
            pensiones.add(PensionFactory.getCalculator("78").calcularPension(850000));
        }
        
        // Ley 86
        for (int i = 0; i < 2; i++) {
            pensiones.add(PensionFactory.getCalculator("86").calcularPension(930000));
        }
        
        // Ley 98
        for (int i = 0; i < 3; i++) {
            pensiones.add(PensionFactory.getCalculator("98").calcularPension(1020000));
        }
        for (int i = 0; i < 2; i++) {
            pensiones.add(PensionFactory.getCalculator("98").calcularPension(1020000 * 2));
        }
        
        // Ley 100
        pensiones.add(PensionFactory.getCalculator("100", 1200000.0, 1200000.0, 1200000.0, 1200000.0, 1200000.0, 1200000.0, 1200000.0, 1200000.0, 1200000.0, 1200000.0).calcularPension(0));
        pensiones.add(PensionFactory.getCalculator("100", 1200000.0, 1200000.0, 1200000.0, 1200000.0, 1200000.0, 1300000.0, 1300000.0, 1300000.0, 1300000.0, 1300000.0).calcularPension(0));
        
        // Ley Petro
        for (int i = 0; i < 4; i++) {
            pensiones.add(PensionFactory.getCalculator("Petro").calcularPension(4 * 1400000));
        }
        for (int i = 0; i < 3; i++) {
            pensiones.add(PensionFactory.getCalculator("Petro").calcularPension(1400000));
        }
        
        // Mostrar resultados
        double totalPension = 0;
        for (double pension : pensiones) {
            System.out.println("Pensión: " + formatoMoneda.format(pension));
            totalPension += pension;
        }
        System.out.println("Total pagado en pensiones: " + formatoMoneda.format(totalPension));
    }
    public String getPatron() {
        return "Factory Method";
    }
}

