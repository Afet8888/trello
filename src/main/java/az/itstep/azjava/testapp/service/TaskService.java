package az.itstep.azjava.testapp.service;

import az.itstep.azjava.testapp.model.Task;

public interface TaskService {

    Task save (Task task);
    Task update (Task task);
    Task getById (Long id);
    void delete (Long id);
}
