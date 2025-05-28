package org.example.MercaDaw;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Mercadaw {

    List<Cliente> clienteList;

    //creo un cliente de pruebas para poder ejecutar el programa
    public void generarClientes(){

        clienteList=new LinkedList<>();
        Cliente cliente = new Cliente("prueba", "Prueba123");
        clienteList.add(cliente);

    }

    //la lista de cliente cuando la cogan otras clases, no puede ser modificable
    public List<Cliente> getClienteList(){
        return Collections.unmodifiableList(clienteList);
    }

}
