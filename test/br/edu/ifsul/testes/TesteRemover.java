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
public class TesteRemover {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PW-2020-1-ModelPU");
        EntityManager em = emf.createEntityManager();      
        
        Fabricante e = em.find(Fabricante.class, 1);

        Grupo g = em.find(Grupo.class, 1);

        Modelo m = em.find(Modelo.class, 1);

        em.getTransaction().begin();
        em.remove(e);
        em.remove(g);
        em.remove(m);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
