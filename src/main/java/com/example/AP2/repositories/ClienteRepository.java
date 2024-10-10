package com.example.AP2.repositories;

import com.example.AP2.models.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {
    private List<Cliente> clientes = new ArrayList<>();

    // Pegar Cliente pelo ID
    public Cliente getClienteByIdRepository(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    //GET
    public List<Cliente> getClientesRepository() {
        return clientes;
    }

    //POST
    public void setClientesRepository(Cliente cliente) {
        this.clientes.add(cliente);
    }

    //DELETE
    public void deleteClienteRepository(int id) {
        Cliente cliente = this.clientes.stream().filter(i -> i.getId() == id).findFirst().get();

        this.clientes.remove(cliente);
    }

    //PUT

}
