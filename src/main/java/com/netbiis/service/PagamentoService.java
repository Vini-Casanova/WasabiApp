package com.netbiis.service;

import java.sql.SQLException;
import java.util.List;

import com.netbiis.databasePersist.Entitys;
import com.netbiis.models.Pagamento;
import com.netbiis.models.Produtos;

public interface PagamentoService extends Entitys{
	public List<Pagamento> findPagamento(int id_cliente)throws SQLException;
	
	public List<Produtos> findPagamentoProdutos(int id_cliente)throws SQLException;
	
	public void removePagamento(int id_pagamento)throws SQLException;
	
	public void addPagamento(int id_produto,int id_cliente)throws SQLException;
}
