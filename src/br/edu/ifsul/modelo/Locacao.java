/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author 20181pf.cc0086
 */
@Table(name = "tb_locacao" )
@Entity
public class Locacao {
    
    @Id
    @SequenceGenerator(name = "seq_locacao", sequenceName = "seq_locacao_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_locacao", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @NotNull(message = "A data de locacao deve ser informada")
    @Column(name = "datalocacao", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar datalocacao;
    
    @NotNull(message = "A data de devolucao deve ser informada")
    @Column(name = "datadevolucao")
    @Temporal(TemporalType.DATE)
    private Calendar datadevolucao;
    
    @NotNull(message = "O valor da diaria deve ser informado")
    @Column(name = "valordiaria", precision = 2, nullable = false)
    private Double valordiaria;
    
    @NotNull(message = "O km inicial deve ser informado")
    @Column(name = "kminicial", length = 20, nullable = false)
    private Integer kminicial;
    
    @NotNull(message = "A km final deve ser informado")
    @Column(name = "kmfinal", length = 20, nullable = false)
    private Integer kmfinal;
    
    @NotNull(message = "O valor total deve ser informado")
    @Column(name = "valortotal", precision = 2, nullable = false)
    private Double valortotal;
    
    @NotNull(message = "O vendedor deve ser informado")
    @ManyToOne(cascade = {CascadeType.ALL})
    private Vendedor vendedor;
    
    @NotNull(message = "O carro deve ser informado")
    @ManyToOne(cascade = {CascadeType.ALL})
    private Carro carro;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Cliente cliente;

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDatalocacao() {
        return datalocacao;
    }

    public void setDatalocacao(Calendar datalocacao) {
        this.datalocacao = datalocacao;
    }

    public Calendar getDatadevolucao() {
        return datadevolucao;
    }

    public void setDatadevolucao(Calendar datadevolucao) {
        this.datadevolucao = datadevolucao;
    }

    public Double getValordiaria() {
        return valordiaria;
    }

    public void setValordiaria(Double valordiaria) {
        this.valordiaria = valordiaria;
    }

    public Integer getKminicial() {
        return kminicial;
    }

    public void setKminicial(Integer kminicial) {
        this.kminicial = kminicial;
    }

    public Integer getKmfinal() {
        return kmfinal;
    }

    public void setKmfinal(Integer kmfinal) {
        this.kmfinal = kmfinal;
    }

    public Double getValortotal() {
        return valortotal;
    }

    public void setValortotal(Double valortotal) {
        this.valortotal = valortotal;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
