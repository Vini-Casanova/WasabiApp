package com.netbiis.service;

import java.sql.SQLException;
import java.util.List;

import com.netbiis.databasePersist.Entitys;
import com.netbiis.models.Categoria;
import com.netbiis.models.Produtos;

public interface ProdustosService extends Entitys {
	public static void removeProduto(Produtos produto) {}
	
	public void addProduto(Produtos produto)throws SQLException;
	
	public Produtos findById(Integer id)throws SQLException;
	
	public void updateProduto(Integer id, String nome, Double preco, String discricao,Categoria cat)throws SQLException;
	
	public List<Produtos> findAllCategoria(int id)throws SQLException;
	
}
