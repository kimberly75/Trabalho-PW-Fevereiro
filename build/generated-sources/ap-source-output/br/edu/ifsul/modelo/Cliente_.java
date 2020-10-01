package br.edu.ifsul.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ extends br.edu.ifsul.modelo.Pessoa_ {

	public static volatile SingularAttribute<Cliente, String> telefone;
	public static volatile SingularAttribute<Cliente, Cidade> cidade;
	public static volatile SingularAttribute<Cliente, String> endereco;
	public static volatile SingularAttribute<Cliente, String> bairro;
	public static volatile SingularAttribute<Cliente, String> cep;

	public static final String TELEFONE = "telefone";
	public static final String CIDADE = "cidade";
	public static final String ENDERECO = "endereco";
	public static final String BAIRRO = "bairro";
	public static final String CEP = "cep";

}

