package com.idat.SUSPatriciaCanariCliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.idat.SUSPatriciaCanariCliente.entity.Cliente;
import com.idat.SUSPatriciaCanariCliente.repository.ClienteRepository;

public class ClienteServiceImpl implements ClienteService {
	
	
	@Autowired
	private ClienteRepository repository;

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

}
