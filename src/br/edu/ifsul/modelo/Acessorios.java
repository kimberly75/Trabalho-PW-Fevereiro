/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author 20181pf.cc0086
 */
@Table(name = "tb_acessorios")
@Entity
public class Acessorios implements Serializable{
       
    @Id
    @SequenceGenerator(name = "seq_acessorios", sequenceName = "seq_acessorios_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_acessorios", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @NotBlank(message = "O nome não deve ser em branco")
    @Column(name = "nome", length = 10, nullable = false)
    private String nome;
    @NotNull(message = "Os acessórios devem ser informados")
    @ManyToMany(mappedBy = "acessorios")
    private List<Grupo> grupo;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Grupo> getGrupo() {
        return grupo;
    }

    public void setGrupo(List<Grupo> grupo) {
        this.grupo = grupo;
    }
    
    

}
