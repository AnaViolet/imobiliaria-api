package com.imobiliaria.crm.controller;

import java.util.List;

import com.imobiliaria.crm.model.Cliente;
import com.imobiliaria.crm.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public String listar(){
        return "Olá"; 
    }    

    @PostMapping
    public Cliente adicionar(@RequestBody Cliente cliente)
    {
        return clienteRepository.save(cliente);
    }    
}
