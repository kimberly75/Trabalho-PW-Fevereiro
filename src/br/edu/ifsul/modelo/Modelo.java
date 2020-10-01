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
@Table(name = "tb_modelo")
@Entity
public class Modelo implements Serializable {
    
    @Id
    @SequenceGenerator(name = "seq_modelo", sequenceName = "seq_modelo_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_modelo", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @NotBlank(message = "O nome não deve ser em branco")
    @Column(name = "nome", length = 10, nullable = false)
    private String nome;
    
    @NotNull(message = "O fabricante deve ser informado")
    @ManyToOne(cascade = {CascadeType.ALL})
    private Fabricante fabricante;
    
    @NotNull(message = "O grupo deve ser informado")
    @ManyToOne(cascade = {CascadeType.ALL})
    private Grupo grupo;

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

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    
    
}
