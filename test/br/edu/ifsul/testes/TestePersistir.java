package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Adicional;
import static br.edu.ifsul.modelo.Adicional_.tipoAdicional;
import br.edu.ifsul.modelo.Carro;
import br.edu.ifsul.modelo.Cidade;
import br.edu.ifsul.modelo.Cliente;
import br.edu.ifsul.modelo.Fabricante;
import br.edu.ifsul.modelo.Grupo;
import br.edu.ifsul.modelo.Locacao;
import br.edu.ifsul.modelo.Modelo;
import br.edu.ifsul.modelo.TipoAdicional;
import br.edu.ifsul.modelo.Vendedor;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author 20181pf.cc0086
 */
public class TestePersistir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PW-2020-1-ModelPU");
        EntityManager em = emf.createEntityManager();
        Fabricante fabricante = new Fabricante();
        fabricante.setNome("fabricante2");
        
        Grupo grupo = new Grupo();
        grupo.setNome("grupo2");
        grupo.setValordiaria(2.00);
        
        Modelo modelo = new Modelo();
        modelo.setNome("modelo2");
        modelo.setGrupo(grupo);
        modelo.setFabricante(fabricante);
        
        Cidade cidade = new Cidade();
        cidade.setEstado("RS");
        cidade.setNome("Passo Fundo");
        
        Vendedor vendedor = new Vendedor();
        vendedor.setAtivo(Boolean.TRUE);
        vendedor.setCpf("04685500032");
        vendedor.setNome("kim");
        vendedor.setNomeUsuario("kim");
        vendedor.setRg("12345678");
        vendedor.setSenha("kim");
        
        Cliente cliente = new Cliente();
        cliente.setCidade(cidade);
        cliente.setBairro("centro");
        cliente.setCep("123456");
        cliente.setEndereco("rua");
        cliente.setNome("kim");
        cliente.setRg("2345679");
        cliente.setTelefone("1234567");
        cliente.setCpf("1234569");
        
        Carro carro = new Carro();
        carro.setAnofabircacao(2015);
        carro.setAnomodelo(2015);
        carro.setModelo(modelo);
        carro.setPlaca("1234");
        carro.setVersao("versao");
        
        Locacao locacao = new Locacao();
        locacao.setCarro(carro);
        locacao.setCliente(cliente);
        locacao.setDatadevolucao(Calendar.getInstance());
        
        Calendar past = Calendar.getInstance();
        past.set(Calendar.DAY_OF_MONTH, 01);
        locacao.setDatalocacao(past);
        locacao.setKmfinal(10);
        locacao.setKminicial(0);
        locacao.setValordiaria(120.00);
        
        TipoAdicional tipoAdicional = new TipoAdicional();
        tipoAdicional.setNome("adicional");
        tipoAdicional.setValor(12.00);
        
        Adicional adicional = new Adicional();
        adicional.setLocacao(locacao);
        adicional.setTipoAdicional(tipoAdicional);
        adicional.setValor(12.00);
       
        Double total = 0.0;
        while (locacao.getDatadevolucao().before(locacao.getDatalocacao())){
             total = total + locacao.getValordiaria();
         }
        total = total + adicional.getValor();
        locacao.setValortotal(total);
        
        em.getTransaction().begin();
        em.persist(fabricante);
        em.persist(grupo);
        em.persist(modelo);
        em.persist(vendedor);
        em.persist(carro);
        em.persist(locacao);
        em.persist(tipoAdicional);
        em.persist(adicional);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
