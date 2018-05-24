package az.itstep.azjava.testapp.controller;

import az.itstep.azjava.testapp.model.Task;
import az.itstep.azjava.testapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/tasks")

public class TaskController {

    private TaskService taskService;

    @PostMapping
    Task save(@RequestBody Task task) {
        return taskService.save(task);
    }

    @PutMapping
    Task update(@RequestBody Task task) {
        return taskService.update(task);
    }

    @GetMapping ("/{id}")
    Task getById(@PathVariable Long id) {
        return taskService.getById(id);
    }

    @DeleteMapping ("/{id}")
    void delete(@PathVariable Long id) {
        taskService.delete(id);
    }

    @Autowired

    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }
}
