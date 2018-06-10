/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaconsultabancaria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karlos
 */
public class SistemaConsultaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code applicatio
        Docente dnl = new Docente(100);
        dnl.setApellido("Paguay");
        dnl.setNombre("Charlie");
        Administrativo tal = new Administrativo (200);
        tal.setApellido("La Mero");
        tal.setNombre("La Diana");
        Estudiante enl = new Estudiante (300);
        enl.setApellido("El Guapo");
        enl.setNombre("El Pedro");
        List<Persona> personas =new ArrayList<Persona>();n logic here
    }
    
}
