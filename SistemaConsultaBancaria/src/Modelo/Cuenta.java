
package Modelo;

public class Cuenta extends Banco{
    
    private String TipoDeCuenta;
    private String TitularCuenta;

    public Cuenta(String TipoDeCuenta) {
        this.TipoDeCuenta = TipoDeCuenta;
    }

    public Cuenta() {
    }

    
    @Override
    public void mostrar() {
    super.mostrar();
        System.out.print("soy docente");
    }
    
    
    
    public String getTipoDeCuenta() {
        return TipoDeCuenta;
    }

    public void setTipoDeCuenta(String TipoDeCuenta) {
        this.TipoDeCuenta = TipoDeCuenta;
    }

    public String getTitularCuenta() {
        return TitularCuenta;
    }

    public void setTitularCuenta(String TitularCuenta) {
        this.TitularCuenta = TitularCuenta;
    }
    
    
    
    
    
    
    
}
