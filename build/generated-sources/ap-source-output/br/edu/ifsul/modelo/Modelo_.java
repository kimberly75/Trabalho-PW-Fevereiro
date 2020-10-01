package br.edu.ifsul.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Modelo.class)
public abstract class Modelo_ {

	public static volatile SingularAttribute<Modelo, Grupo> grupo;
	public static volatile SingularAttribute<Modelo, String> nome;
	public static volatile SingularAttribute<Modelo, Integer> id;
	public static volatile SingularAttribute<Modelo, Fabricante> fabricante;

	public static final String GRUPO = "grupo";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String FABRICANTE = "fabricante";

}

