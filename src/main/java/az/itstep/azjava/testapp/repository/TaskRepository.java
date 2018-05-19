package az.itstep.azjava.testapp.repository;

import az.itstep.azjava.testapp.model.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
