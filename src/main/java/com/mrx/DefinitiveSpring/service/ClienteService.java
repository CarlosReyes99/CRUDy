package com.mrx.DefinitiveSpring.service;


import com.mrx.DefinitiveSpring.entity.Cliente;
import com.mrx.DefinitiveSpring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio para gestionar Clientes
 * Hace uso de un ClienteRepository para
 * acceder a la capa de datos
 *
 * @author Carlos Reyes
 * @version 1.0
 * @since 2024
 */

@Service
public class ClienteService {
    /**
     * Repositorio de acceso a datos de Cliente
     */
    @Autowired
    ClienteRepository clienteRepository;

    /**
     * Obtiene todos los clientes
     * @return lista de clientes
     */
    public List<Cliente> getClientes(){
        return clienteRepository.findAll();
    }

    /**
     * Obtiene un cliente por Id
     * @param id identificador del cliente
     * @return Optional del cliente
     */
    public Optional<Cliente> getClientes(Integer id){
        return clienteRepository.findById(id);
    }

    /**
     * Guarda o actualiza un cliente
     * @param cliente objeto cliente a guardar
     */
    public void saveOrUpdate(Cliente cliente){
        clienteRepository.save(cliente);
    }

    /**
     * Elimina un cliente por id
     * @param id identificador del cliente a eliminar
     */
    public void delete(Integer id){
        clienteRepository.deleteById(id);
    }

}
