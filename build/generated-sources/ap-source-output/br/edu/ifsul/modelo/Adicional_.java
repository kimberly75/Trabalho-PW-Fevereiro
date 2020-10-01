package br.edu.ifsul.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Adicional.class)
public abstract class Adicional_ {

	public static volatile SingularAttribute<Adicional, TipoAdicional> tipoAdicional;
	public static volatile SingularAttribute<Adicional, Double> valor;
	public static volatile SingularAttribute<Adicional, Integer> id;
	public static volatile SingularAttribute<Adicional, Locacao> locacao;

	public static final String TIPO_ADICIONAL = "tipoAdicional";
	public static final String VALOR = "valor";
	public static final String ID = "id";
	public static final String LOCACAO = "locacao";

}

