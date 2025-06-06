package com.api.cliente.repository;

import com.clientes.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public class ClienteRepository extends JpaRepository<Cliente, Integer> {
}