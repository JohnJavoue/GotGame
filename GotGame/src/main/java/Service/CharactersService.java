package Service;

import Dao.CharactersDao;
import Model.Characters;
import org.springframework.beans.factory.annotation.Autowired;

public class CharactersService {

    @Autowired
    private CharactersDao charactersDao;

    public Characters find(long id) {
        return (Characters) charactersDao.find(id);
    }

    //TODO create service which call CharactersDao

}
