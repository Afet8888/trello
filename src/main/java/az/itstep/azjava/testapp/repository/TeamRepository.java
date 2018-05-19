package az.itstep.azjava.testapp.repository;

import az.itstep.azjava.testapp.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
}
