/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author 20181pf.cc0086
 */
@Table(name = "tb_adicional")
@Entity
public class Adicional implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_adicional", sequenceName = "seq_adicional_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_adicional", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @NotNull(message = "O valor deve ser informado")
    @Column(name = "valor", precision = 2, nullable = false)
    private Double valor;
    
    @NotNull(message = "A locacao deve ser informada")
    @ManyToOne(cascade = {CascadeType.ALL})
    private Locacao locacao;

    @NotNull(message = "O tipo adicional deve ser informado")
    @ManyToOne(cascade = {CascadeType.ALL})
    private TipoAdicional tipoAdicional;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public TipoAdicional getTipoAdicional() {
        return tipoAdicional;
    }

    public void setTipoAdicional(TipoAdicional tipoAdicional) {
        this.tipoAdicional = tipoAdicional;
    }
    
    
    
}
