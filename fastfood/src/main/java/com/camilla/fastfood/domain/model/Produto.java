
package com.camilla.fastfood.domain.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author devsys-a
 */
@Entity
public class Produto {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    
   @NotBlank
   private String descricao;
   
   @NotBlank
   private BigDecimal valor_unitario;

    public Produto() {
    }
  

    public Produto(Long id, String descricao, BigDecimal valor_unitario) {
        this.id = id;
        this.descricao = descricao;
        this.valor_unitario = valor_unitario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(BigDecimal valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    
   
   
}
