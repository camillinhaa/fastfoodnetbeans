
package com.camilla.fastfood.domain.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author devsys-a
 */
@Entity
public class Item {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    private Produto produto;
    
    @NotBlank
    private BigDecimal quantidade;
   
    private String obs;
    
    @NotBlank
    private BigDecimal valor_unitario;

    public Item() {
    }
    

    public Item(long id, Pedido pedido, BigDecimal quantidade, String obs, BigDecimal valor_unitario) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.obs = obs;
        this.valor_unitario = valor_unitario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public BigDecimal getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(BigDecimal valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
    
    
    
}
