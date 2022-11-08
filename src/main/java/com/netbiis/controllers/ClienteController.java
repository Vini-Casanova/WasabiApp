package com.netbiis.controllers;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.TypedQuery;

import com.netbiis.models.Cliente;
import com.netbiis.service.ClienteServices;

public final class ClienteController implements ClienteServices {
	@Override
	public void removeCliente(Cliente cliente) throws SQLException {
		tx.begin();
		em.remove(cliente);
		tx.commit();
	}
	@Override
	public void addCliente(Cliente cliente) {
		tx.begin();
		em.persist(cliente);
		tx.commit();
	}
	@Override
	public Cliente findById(Integer id) {
		Cliente cliente = em.find(Cliente.class,id);
		return cliente;
	}
	@Override
	public void updateCliente(Integer id, String nome, String endereco,String cpf) {
		tx.begin();
		Cliente cliente = em.find(Cliente.class,id);
		cliente.setClienteName(nome);
		cliente.setClienteEndereco(endereco);
		cliente.setClienteCpf(cpf);
		em.merge(cliente);
		tx.commit();
	}

	@Override
	public List<Cliente> findAll() {
		TypedQuery<Cliente> clienteQuery = em.createQuery("from Cliente", Cliente.class);
	    List<Cliente> clientes = clienteQuery.getResultList();
	    return clientes;    
	}
	@Override
	public Cliente findByName(String nome) {
		TypedQuery<Cliente> clienteQuerry = em.createQuery("from Cliente where cliente_name ='"+nome+"'", Cliente.class);
		Cliente cliente = clienteQuerry.getSingleResult();
		return cliente;
	}
}
