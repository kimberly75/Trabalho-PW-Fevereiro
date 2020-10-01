package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Fabricante;
import br.edu.ifsul.modelo.Grupo;
import br.edu.ifsul.modelo.Modelo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author 20181pf.cc0086
 */
public class TesteAlterar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PW-2020-1-ModelPU");
        EntityManager em = emf.createEntityManager();      
        
        Fabricante e = em.find(Fabricante.class, 1);
        e.setNome("fabri1");
   
        Grupo g = em.find(Grupo.class, 1);
        g.setNome("grupo1");

        Modelo m = em.find(Modelo.class, 1);
        m.setNome("model1");
   
        em.getTransaction().begin();
        em.merge(e);
        em.merge(g);
        em.merge(m);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
