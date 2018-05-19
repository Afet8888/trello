package az.itstep.azjava.testapp.repository;

import az.itstep.azjava.testapp.model.Board;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board, Long> {
}
