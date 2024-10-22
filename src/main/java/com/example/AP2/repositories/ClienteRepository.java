package com.example.AP2.repositories;

import com.example.AP2.models.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {
    private List<Cliente> clientes = new ArrayList<>();

    //GET
    public List<Cliente> getClientesRepository() {
        return clientes;
    }

    public Cliente getClientesPelaIdRepository(int id) {
        Cliente cliente = this.clientes.stream().filter(i -> i.getId() == id).findFirst().get();
        return cliente;
    }

    public List<Cliente> getClientesPelaIdadeRepository(int idade) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdade() == idade) {
                return clientes;
            }
        }
        return null;
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
    public Cliente updateClienteRepository(int id, Cliente cliente) {
        cliente = this.clientes.stream().filter(i -> i.getId() == id).findFirst().get();
        cliente.setarCliente(cliente.getNome(), cliente.getIdade(), cliente.getProfissao());
        return cliente;
    }
}
