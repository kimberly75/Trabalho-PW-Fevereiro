package br.edu.ifsul.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Vendedor.class)
public abstract class Vendedor_ extends br.edu.ifsul.modelo.Pessoa_ {

	public static volatile SingularAttribute<Vendedor, String> nomeUsuario;
	public static volatile SingularAttribute<Vendedor, String> senha;
	public static volatile SingularAttribute<Vendedor, Boolean> ativo;

	public static final String NOME_USUARIO = "nomeUsuario";
	public static final String SENHA = "senha";
	public static final String ATIVO = "ativo";

}

