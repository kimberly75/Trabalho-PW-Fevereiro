package br.edu.ifsul.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;


/**
 *
 * @author 20181pf.cc0086
 */
@Table(name = "tb_fabricante")
@Entity
public class Fabricante implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_fabricante", sequenceName = "seq_fabricante_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_fabricante", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @NotBlank(message = "O nome deve ser em branco")
    @Column(name = "nome", length = 10, nullable = false)
    private String nome;

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
    
    
}
