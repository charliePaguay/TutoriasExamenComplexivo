
package Modelo;

public class Cliente extends Banco{
    
    private String Email;
    private String TipoDeCuenta;
    private int CantCuenta;

    public Cliente(int CantCuenta) {
        this.CantCuenta = CantCuenta;
    }

    public Cliente() {
    }

    
    
    @Override
    public void mostrar() {
    super.mostrar();
        System.out.print("soy docente");
    }
    
    
    
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTipoDeCuenta() {
        return TipoDeCuenta;
    }

    public void setTipoDeCuenta(String TipoDeCuenta) {
        this.TipoDeCuenta = TipoDeCuenta;
    }

    public int getCantCuenta() {
        return CantCuenta;
    }

    public void setCantCuenta(int CantCuenta) {
        this.CantCuenta = CantCuenta;
    }
    
    
    
    
    
    
}
