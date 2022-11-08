package com.netbiis.service;

import java.sql.SQLException;
import java.util.List;

import com.netbiis.databasePersist.Entitys;
import com.netbiis.models.Cliente;


public interface ClienteServices extends Entitys{
	
	
	public void removeCliente(Cliente cliente) throws SQLException;
	
	public void addCliente(Cliente cliente)throws SQLException;
	
	public  Cliente findById(Integer id)throws SQLException;
	
	public void updateCliente(Integer id, String nome, String endereco,String cpf)throws SQLException;
	
	public List<Cliente> findAll()throws SQLException;
	
	public Cliente findByName(String nome) throws SQLException;
	
}


