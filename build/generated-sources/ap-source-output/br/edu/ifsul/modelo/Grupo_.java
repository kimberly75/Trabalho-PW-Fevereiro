package br.edu.ifsul.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Grupo.class)
public abstract class Grupo_ {

	public static volatile SingularAttribute<Grupo, Double> valordiaria;
	public static volatile SingularAttribute<Grupo, String> nome;
	public static volatile ListAttribute<Grupo, Acessorios> acessorios;
	public static volatile SingularAttribute<Grupo, Integer> id;

	public static final String VALORDIARIA = "valordiaria";
	public static final String NOME = "nome";
	public static final String ACESSORIOS = "acessorios";
	public static final String ID = "id";

}

