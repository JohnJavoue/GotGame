package Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

abstract class AbstractDao<T> {

    @PersistenceContext
    EntityManager entityManager;

    abstract T find(long id);

    //TODO create abstract class AbstractDao

}
