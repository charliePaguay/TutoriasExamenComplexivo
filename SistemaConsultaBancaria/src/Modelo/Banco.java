
package Modelo;


public abstract class Banco {
    
   private String Nombre;
   private int ID;
   private String Direccion;
   private String Telefono;

   
   
    public Banco(int ID) {
        this.ID = ID;
    }

    public Banco() {
    }

    
    
    
    public  void mostrar() {
        
        System.out.println(String.format("Mi nombre es %s, %s" ,Nombre,Direccion,Telefono));
        
    }
    
    
    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
   
   
    
    
    
}
