package com.example.AP2.services;

import com.example.AP2.models.Cliente;
import com.example.AP2.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarClienteService() {
        return clienteRepository.getClientesRepository();
    }

    public Cliente getClienteByIdService(int id) {
        return clienteRepository.getClienteByIdRepository(id);
    }

    public void setClienteService(Cliente cliente) {
        clienteRepository.setClientesRepository(cliente);
    }
    public void deleteClienteService(int id){
        clienteRepository.deleteClienteRepository(id);
    }


}
