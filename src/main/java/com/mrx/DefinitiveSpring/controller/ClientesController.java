package com.mrx.DefinitiveSpring.controller;

import com.mrx.DefinitiveSpring.entity.Cliente;
import com.mrx.DefinitiveSpring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controlador para exponer los endpoints de Clientes.
 *
 * @author Carlos Reyes
 * @version 1.0
 * @since 2023
 */

@RestController
@RequestMapping(path = "api/v1/clientes")

public class ClientesController {

    /**
     * Servicio para operaciones con Clientes
     */
    @Autowired
    private ClienteService clienteService;

    /**
     * Obtener todos los clientes
     * @return lista de clientes
     */
    @GetMapping
    public List<Cliente> getAll(){
        return clienteService.getClientes();
    }

    /**
     * Obtener cliente por id
     * @param clienteId identificador del cliente
     * @return Objeto optional de Cliente
     */
    @GetMapping("/{clienteId}")
    public Optional<Cliente> getById(@PathVariable("clienteId") Integer clienteId){
        return clienteService.getClientes(clienteId);
    }

    /**
     * Guardar o actualizar cliente
     * @param cliente objeto cliente
     */
    @PostMapping
    public Cliente saveUpdate(@RequestBody Cliente cliente){
        clienteService.saveOrUpdate(cliente);
        return cliente;
    }

    /**
     * Eliminar cliente por id
     * @param clienteId
     */
    @DeleteMapping("/{clienteId}")
    public void delete(@PathVariable("clienteId") Integer clienteId){
        clienteService.delete(clienteId);
    }
}
