package com.netbiis.controllers;

import java.util.List;

import javax.persistence.TypedQuery;

import com.netbiis.models.Categoria;
import com.netbiis.models.Produtos;
import com.netbiis.service.ProdustosService;

public class ProdutoController implements ProdustosService{
	
	public void removeProduto(Produtos produto) {
		tx.begin();
		em.remove(produto);
		tx.commit();
	}
	
	public void addProduto(Produtos produto) {
		tx.begin();
		em.persist(produto);
		tx.commit();
	}
	
	public Produtos findById(Integer id) {
		Produtos produto = em.find(Produtos.class,id);
		return produto;
	}
	
	public void updateProduto(Integer id, String nome, Double preco, String discricao,Categoria cat) {
		tx.begin();
		Produtos produto = em.find(Produtos.class,id);
		produto.setNameProdudo(nome);
		produto.setPrecoProduto(preco);
		produto.setDiscProduto(discricao);
		produto.setCategoria(cat);
		tx.commit();
	}
	
	public List<Produtos> findAllCategoria(int id){
		TypedQuery<Produtos> produtosQuery = em.createQuery("from Produtos where id_categoria="+id, Produtos.class);
	    List<Produtos> produtos = produtosQuery.getResultList();
	    return produtos;  
	}
}
