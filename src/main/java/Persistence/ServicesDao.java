package Persistence;

import Model.PostUser;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ServicesDao {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExamIntra");

    public long createUser(String nomUser) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final PostUser postUser = new PostUser(nomUser);
        em.persist(postUser);

        em.getTransaction().commit();
        em.close();

        return postUser.getId();
    }
}
