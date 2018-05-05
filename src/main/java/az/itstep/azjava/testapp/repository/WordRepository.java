package az.itstep.azjava.testapp.repository;

import az.itstep.azjava.testapp.model.Word;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface WordRepository extends CrudRepository<Word, Integer> {

    Optional<Word> findByAz(String az);

    //SELECT * FROM word WHERE en = :en LIMIT 1
    Optional<Word> findByEn(String en);

}
