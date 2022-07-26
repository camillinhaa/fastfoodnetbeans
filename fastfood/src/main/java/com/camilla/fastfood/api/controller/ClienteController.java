
package com.camilla.fastfood.api.controller;

import com.camilla.fastfood.domain.model.Cliente;
import com.camilla.fastfood.domain.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author devsys-a
 */
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteRepository clienteRepository; 
    
    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }
}
  