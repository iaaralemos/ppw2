package br.edu.ifg.sistemacomercial.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "movimento_estoque")
public class MovimentoEstoque implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name="produto_id")
    private Produto produto;
    
    @ManyToOne
    @JoinColumn(name="fornecedor_id")
    private Fornecedor fornecedor;
    
    @Column(name="tipo_movimento")
    private String tipoMovimento;
    
    @Column(name="quantidade_recebida")
    private Long quantidadeRecebida;
    
    @Column(name="preco_custo")
    private Long precoCusto;
    
    private String observacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public Long getQuantidadeRecebida() {
        return quantidadeRecebida;
    }

    public void setQuantidadeRecebida(Long quantidadeRecebida) {
        this.quantidadeRecebida = quantidadeRecebida;
    }

    public Long getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Long precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MovimentoEstoque other = (MovimentoEstoque) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }   
     
}