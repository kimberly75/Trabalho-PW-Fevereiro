package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author 20181pf.cc0086
 */
@Table(name = "tb_grupo")
@Entity
public class Grupo implements Serializable {
    
    @Id
    @SequenceGenerator(name = "seq_grupo", sequenceName = "seq_grupo_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_grupo", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @NotBlank(message = "O nome não deve ser em branco")
    @Column(name = "nome", length = 10, nullable = false)
    private String nome;
    
    @Column(name = "valordiaria", precision = 2, nullable = false)
    private Double valordiaria;
    @ManyToMany
    @JoinTable(
        name = "acessorios", 
        joinColumns = @JoinColumn(name = "grupo_id"), 
        inverseJoinColumns = @JoinColumn(name = "grupo"))
    List<Acessorios> acessorios;

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

    public Double getValordiaria() {
        return valordiaria;
    }

    public void setValordiaria(Double valordiaria) {
        this.valordiaria = valordiaria;
    }
    
    
}
