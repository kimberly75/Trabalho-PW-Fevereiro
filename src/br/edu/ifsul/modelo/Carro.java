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
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author 20181pf.cc0086
 */
@Table(name = "tb_carro")
@Entity
public class Carro implements Serializable {
    
    @Id
    @SequenceGenerator(name = "seq_carro", sequenceName = "seq_carro_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_carro", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @NotBlank(message = "O nome da placa não deve ser em branco")
    @Column(name = "placa", length = 10, nullable = false)
    private String placa;
    
    @NotNull(message = "O ano da fabricação deve ser informado")
    @Column(name = "anofabircacao", length = 10, nullable = false)
    private Integer anofabircacao;
    
    @NotNull(message = "O ano do modelo deve ser informado")
    @Column(name = "anomodelo", length = 10, nullable = false)
    private Integer anomodelo;
    
    @NotBlank(message = "A versao não deve ser em branco")
    @Column(name = "versao", length = 10, nullable = false)
    private String versao;
    
    @NotNull(message = "O modelo deve ser informado")
    @ManyToOne(cascade = {CascadeType.ALL})
    private Modelo modelo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getAnofabircacao() {
        return anofabircacao;
    }

    public void setAnofabircacao(Integer anofabircacao) {
        this.anofabircacao = anofabircacao;
    }

    public Integer getAnomodelo() {
        return anomodelo;
    }

    public void setAnomodelo(Integer anomodelo) {
        this.anomodelo = anomodelo;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
}
