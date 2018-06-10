package sistemaconsultabancaria;

import Modelo.Banco;
import Modelo.Empleados;
import Modelo.Cliente;
import Modelo.Cuenta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaConsultaBancaria {

    public static void main(String[] args) {

        Empleados en = new Empleados(100);
        en.setNombreEmpleados("Charlie Paguay ");
        en.setCargo("Cajero");
        
        Cliente cl = new Cliente(100);
        cl.setNombreClientes("Elias");
        cl.setAplellidosCliente("Mejia");
        cl.setTipoDeCuenta("Ahorros");
        cl.setCantCuenta(100);

        List<Banco> bancos = new ArrayList<Banco>();

        bancos.add(en);
        bancos.add(cl);
     

        for (Banco banco : bancos) {
            banco.mostrar();
        }

        Scanner s = new Scanner(System.in);
        s.nextLine();
    }

}
