package az.itstep.azjava.testapp.service.impl;

import az.itstep.azjava.testapp.model.Row;
import az.itstep.azjava.testapp.repository.RowRepository;
import az.itstep.azjava.testapp.service.RowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class RowServiceImpl implements RowService {

    private RowRepository rowRepository;

    @Override
    public Row save(Row row) {
        if (Objects.isNull(row)) throw new RuntimeException("Row not entered");
        if (Objects.isNull(row.getId()) || Objects.isNull(row.getName()))
            throw new RuntimeException("Wrong row data");
        return rowRepository.save(row);
    }

    @Override
    public Row update(Row row) {
        if (Objects.isNull(row)) throw  new RuntimeException("Row not entered");
        if (Objects.isNull(row.getId()) || Objects.isNull(row.getName()))
            throw new RuntimeException("Wrong row data");
        if (!rowRepository.existsById(row.getId()))
            throw new RuntimeException("Nothing to update");
        return rowRepository.save(row);
    }

    @Override
    public Row getById(Long id) {
        if (Objects.isNull(id)) throw  new RuntimeException("No id");
        Optional<Row> row = rowRepository.findById(id);
        if (row.isPresent())
        return row.get();
        throw new RuntimeException("Row not found");
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        rowRepository.deleteById(id);
    }

    @Autowired
    public void setRowRepository(RowRepository rowRepository) {
        this.rowRepository = rowRepository;
    }
}
