package com.example.AP2.controllers;

import com.example.AP2.models.Cliente;
import com.example.AP2.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    final ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping("/clientes")
    public List<Cliente> getClientesController() {
        return clienteService.listarClienteService();
    }
    @GetMapping("/clientes/{id}")
    public Cliente getClienteByIdController(@PathVariable int id) {
        return clienteService.getClienteByIdService(id);
    }

    @PostMapping("/clientes")
    public Cliente setClienteController(@RequestBody Cliente cliente) {
        clienteService.setClienteService(cliente);
        return cliente;
    }

    @DeleteMapping("/clientes/{id}")
    public void deleteClienteController(@PathVariable int id) {
        clienteService.deleteClienteService(id);
    }

}
