/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camilla.fastfood.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
public class Pedido {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    private Cliente cliente;
    
    private String obs;
    //colocar status
    
    @NotBlank
    private LocalDateTime data_hora_pedido;
    private LocalDateTime data_hora_entrega;

    public Pedido() {
    }
    

    public Pedido(long id, String obs, LocalDateTime data_hora_pedido, LocalDateTime data_hora_entrega) {
        this.id = id;
        this.obs = obs;
        this.data_hora_pedido = data_hora_pedido;
        this.data_hora_entrega = data_hora_entrega;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public LocalDateTime getData_hora_pedido() {
        return data_hora_pedido;
    }

    public void setData_hora_pedido(LocalDateTime data_hora_pedido) {
        this.data_hora_pedido = data_hora_pedido;
    }

    public LocalDateTime getData_hora_entrega() {
        return data_hora_entrega;
    }

    public void setData_hora_entrega(LocalDateTime data_hora_entrega) {
        this.data_hora_entrega = data_hora_entrega;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Pedido other = (Pedido) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
