package com.netbiis.models;
// Generated 4 de nov. de 2022 11:28:17 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Produtos generated by hbm2java
 */
@Entity
@Table(name = "produtos", uniqueConstraints = @UniqueConstraint(columnNames = "name_produdo"))
public class Produtos implements java.io.Serializable {

	private Integer idProduto;
	private Categoria categoria;
	private String nameProdudo;
	private double precoProduto;
	private String discProduto;
	private Set<Pagamento> pagamentos = new HashSet<Pagamento>(0);

	public Produtos() {
	}

	public Produtos(Categoria categoria, String nameProdudo, double precoProduto, String discProduto) {
		this.categoria = categoria;
		this.nameProdudo = nameProdudo;
		this.precoProduto = precoProduto;
		this.discProduto = discProduto;
	}

	public Produtos(Categoria categoria, String nameProdudo, double precoProduto, String discProduto,
			Set<Pagamento> pagamentos) {
		this.categoria = categoria;
		this.nameProdudo = nameProdudo;
		this.precoProduto = precoProduto;
		this.discProduto = discProduto;
		this.pagamentos = pagamentos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_produto", unique = true, nullable = false)
	public Integer getIdProduto() {
		return this.idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_categoria", nullable = false)
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Column(name = "name_produdo", unique = true, nullable = false, length = 45)
	public String getNameProdudo() {
		return this.nameProdudo;
	}

	public void setNameProdudo(String nameProdudo) {
		this.nameProdudo = nameProdudo;
	}

	@Column(name = "preco_produto", nullable = false, precision = 22, scale = 0)
	public double getPrecoProduto() {
		return this.precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	@Column(name = "disc_produto", nullable = false, length = 60)
	public String getDiscProduto() {
		return this.discProduto;
	}

	public void setDiscProduto(String discProduto) {
		this.discProduto = discProduto;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produtos")
	public Set<Pagamento> getPagamentos() {
		return this.pagamentos;
	}

	public void setPagamentos(Set<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

}
