package br.edu.ifsul.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Carro.class)
public abstract class Carro_ {

	public static volatile SingularAttribute<Carro, Integer> anomodelo;
	public static volatile SingularAttribute<Carro, Integer> anofabircacao;
	public static volatile SingularAttribute<Carro, Integer> id;
	public static volatile SingularAttribute<Carro, Modelo> modelo;
	public static volatile SingularAttribute<Carro, String> versao;
	public static volatile SingularAttribute<Carro, String> placa;

	public static final String ANOMODELO = "anomodelo";
	public static final String ANOFABIRCACAO = "anofabircacao";
	public static final String ID = "id";
	public static final String MODELO = "modelo";
	public static final String VERSAO = "versao";
	public static final String PLACA = "placa";

}

