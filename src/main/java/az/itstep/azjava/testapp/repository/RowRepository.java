package az.itstep.azjava.testapp.repository;

import az.itstep.azjava.testapp.model.Row;
import org.springframework.data.repository.CrudRepository;

public interface RowRepository extends CrudRepository<Row, Long> {
}
