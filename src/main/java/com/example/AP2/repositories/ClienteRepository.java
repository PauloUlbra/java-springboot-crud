package com.example.AP2.repositories;

import com.example.AP2.models.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {
    public List<Cliente> clientes = new ArrayList<>();

    //GET
    public List<Cliente> getClientesRepository() {
        return clientes;
    }

    public Cliente getClientesPelaIdRepository(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente; //Se tiver com mesmo id ele retorna
            }
        }
        return null;
    }

    public List<Cliente> getClientesPelaIdadeRepository(int idade) {
        List<Cliente> clientesPelaIdade = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getIdade() == idade) {
                clientesPelaIdade.add(cliente); // Vai adicionar nessa lista que criamos, se damos um return cliente, tu tá falando que se o cliente tiver uma idade ele vai retornar
            }
        }
        return clientesPelaIdade;  //Não vamos ter como válidar, então se colocar uma idade que não existe, ele vai dar status 200 OK, mas vai retornar um objeto json vazio, ou seja, = []
    }

    //POST
    public Cliente setClientesRepository(Cliente cliente) {
        if (getClientesPelaIdRepository(cliente.getId()) != null) { // se o id não estiver nulo, significa que ele já existe
            return null; // então não cria
        }
        cliente.incrementId();
        clientes.add(cliente); // se estiver nulo, pode criar
        return cliente;
    }

    //DELETE
    public Cliente deleteClienteRepository(int id) {
        Cliente cliente = getClientesPelaIdRepository(id);
        if (cliente != null) {
            clientes.remove(cliente);
            return cliente;
        }
        return null;
    }

    //PUT
    public Cliente updateClienteRepository(int id, Cliente clienteAtualizado) {

        Cliente cliente = getClientesPelaIdRepository(id);

        int index = clientes.indexOf(cliente);
        cliente.setNome(clienteAtualizado.getNome());
        cliente.setIdade(clienteAtualizado.getIdade());
        cliente.setProfissao(clienteAtualizado.getProfissao());

        clientes.set(index,cliente);

        return clienteAtualizado;
    }
}
