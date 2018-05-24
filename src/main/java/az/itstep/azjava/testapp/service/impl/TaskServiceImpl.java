package az.itstep.azjava.testapp.service.impl;

import az.itstep.azjava.testapp.model.Task;
import az.itstep.azjava.testapp.repository.TaskRepository;
import az.itstep.azjava.testapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    @Override
    public Task save(Task task) {
        if (Objects.isNull(task)) throw new RuntimeException("Task not entered");
        if (Objects.isNull(task.getId())) throw new RuntimeException("Wrong task data");
        return taskRepository.save(task);
    }

    @Override
    public Task update(Task task) {
        if (Objects.isNull(task)) throw new RuntimeException("Task not entered");
        if (Objects.isNull(task.getId())) throw new RuntimeException("Wrong task data");
        if (!taskRepository.existsById(task.getId()))
            throw new RuntimeException("Nothing to update");
        return taskRepository.save(task);
    }

    @Override
    public Task getById(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        Optional<Task> task = taskRepository.findById(id);
        if (task.isPresent())
        return task.get();
        throw new RuntimeException("Task not found");
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        taskRepository.deleteById(id);
    }

    @Autowired
    public void setTaskRepository(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
}
