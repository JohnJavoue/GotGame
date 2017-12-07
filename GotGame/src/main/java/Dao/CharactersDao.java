package Dao;

import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@RestController
public class CharactersDao<Characters> extends AbstractDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Characters find(long id) {

        Query query = entityManager.createQuery("SELECT ch FROM characters ch WHERE ch.id = :id");
        query.setParameter("id", id);
        Object result = query.getSingleResult();
        //TODO revoir le cast plus proprement
        return (Characters) result;
    }

    //TODO create this dao too

}
