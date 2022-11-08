package com.netbiis.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import com.netbiis.models.Cliente;
import com.netbiis.models.Pagamento;
import com.netbiis.models.Produtos;
import com.netbiis.service.PagamentoService;

public class PagamentoController implements PagamentoService{

	@Override
	public List<Pagamento> findPagamento(int id_cliente) {
		TypedQuery<Pagamento> pagamentoQuery = em.createQuery("from Pagamento where id_cliente="+id_cliente, Pagamento.class);
        List<Pagamento> pagamentos = pagamentoQuery.getResultList();
        return pagamentos;
	}

	@Override
	public List<Produtos> findPagamentoProdutos(int id_cliente) {
		TypedQuery<Pagamento> pagamentoQuery = em.createQuery("from Pagamento where id_cliente="+id_cliente, Pagamento.class);
        List<Pagamento> pagamentos = pagamentoQuery.getResultList();
        List<Produtos> prod = new ArrayList<Produtos>() ;
        pagamentos.forEach(pagamento -> prod.add(pagamento.getProdutos()) );
		return prod;
	}

	@Override
	public void removePagamento(int id_pagamento) {
		tx.begin();
		Pagamento prod = em.find(Pagamento.class, id_pagamento);
		em.remove(prod);
		tx.commit();
		
		
	}

	@Override
	public void addPagamento(int id_produto, int id_cliente) {
		tx.begin();
		Produtos prod = em.find(Produtos.class, id_produto);
		Cliente cliente = em.find(Cliente.class, id_cliente);
		
		Pagamento novoPag = new Pagamento(cliente,prod);
		
		em.persist(novoPag);
		
		tx.commit();
		
	}

}
