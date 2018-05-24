package az.itstep.azjava.testapp.controller;

import az.itstep.azjava.testapp.model.Row;
import az.itstep.azjava.testapp.service.RowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/rows")

public class RowController {

    private RowService rowService;

    @PostMapping
    Row save(@RequestBody Row row) {
        return rowService.save(row);
    }

    @PutMapping
    Row update(@RequestBody Row row) {
        return rowService.update(row);
    }

    @GetMapping ("/{id}")
    Row getById(@PathVariable Long id) {
        return rowService.getById(id);
    }

    @DeleteMapping ("/{id}")
    void delete(@PathVariable Long id) {
        rowService.delete(id);
    }

    @Autowired
    public void setRowService(RowService rowService) {
        this.rowService = rowService;
    }
}
