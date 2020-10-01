package br.edu.ifsul.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author 20181pf.cc0086
 */
@Entity
@Table(name = "tb_vendedor")
@DiscriminatorValue("V")
public class Vendedor extends Pessoa implements Serializable{
    @NotBlank(message = "O nome de usuário não deve ser em branco")
    @Column(name = "nomeUsuario", length = 20, nullable = false)
    private String nomeUsuario;
    
    @NotBlank(message = "A senha não deve ser em branco")
    @Column(name = "senha", length = 20, nullable = false)
    private String senha;
    
    @NotNull(message = "O valor ativo deve ser informado")
    @Column(name = "ativo", length = 20, nullable = false)
    private Boolean ativo;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    
    
}
