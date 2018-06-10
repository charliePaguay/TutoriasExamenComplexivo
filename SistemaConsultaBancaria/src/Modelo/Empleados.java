
package Modelo;

public class Empleados extends Banco{
    
   private String Area;
   private int Sueldo;
   private String Cargo;
   private String Horario;

    public Empleados(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public Empleados() {
    }

      @Override
    public void mostrar() {
    super.mostrar();
    System.out.print(this.getNombre());
        System.out.print("soy estudiante");
    }
    
       
    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
   
   
    
    
   
   
    
}
