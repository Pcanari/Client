package com.idat.SUSPatriciaCanariCliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.SUSPatriciaCanariCliente.entity.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}

