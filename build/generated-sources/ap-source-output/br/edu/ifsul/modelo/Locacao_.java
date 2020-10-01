package br.edu.ifsul.modelo;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Locacao.class)
public abstract class Locacao_ {

	public static volatile SingularAttribute<Locacao, Carro> carro;
	public static volatile SingularAttribute<Locacao, Cliente> cliente;
	public static volatile SingularAttribute<Locacao, Calendar> datadevolucao;
	public static volatile SingularAttribute<Locacao, Double> valordiaria;
	public static volatile SingularAttribute<Locacao, Vendedor> vendedor;
	public static volatile SingularAttribute<Locacao, Integer> kminicial;
	public static volatile SingularAttribute<Locacao, Double> valortotal;
	public static volatile SingularAttribute<Locacao, Integer> id;
	public static volatile SingularAttribute<Locacao, Integer> kmfinal;
	public static volatile SingularAttribute<Locacao, Calendar> datalocacao;

	public static final String CARRO = "carro";
	public static final String CLIENTE = "cliente";
	public static final String DATADEVOLUCAO = "datadevolucao";
	public static final String VALORDIARIA = "valordiaria";
	public static final String VENDEDOR = "vendedor";
	public static final String KMINICIAL = "kminicial";
	public static final String VALORTOTAL = "valortotal";
	public static final String ID = "id";
	public static final String KMFINAL = "kmfinal";
	public static final String DATALOCACAO = "datalocacao";

}

