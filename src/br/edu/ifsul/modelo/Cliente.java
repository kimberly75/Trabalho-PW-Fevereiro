package br.edu.ifsul.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author 20181pf.cc0086
 */
@Entity
@Table(name = "tb_cliente")
@DiscriminatorValue("C")
public class Cliente extends Pessoa implements Serializable{
    
    @NotBlank(message = "O telefone não deve ser em branco")
    @Column(name = "telefone", length = 12, nullable = false)
    private String telefone;
    
    @NotBlank(message = "O endereço não deve ser em branco")
    @Column(name = "endereco", length = 50, nullable = false)
    private String endereco;
    
    @NotBlank(message = "O cpf não deve ser em branco")
    @Column(name = "cep", length = 10, nullable = false)
    private String cep;
    
    @NotBlank(message = "O bairro não deve ser em branco")
    @Column(name = "bairro", length = 12, nullable = false)
    private String bairro;
    
    @NotNull(message = "A cidade deve ser informada")
    @ManyToOne(cascade = {CascadeType.ALL})
    private Cidade cidade;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
       
}
