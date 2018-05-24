package az.itstep.azjava.testapp.service;

import az.itstep.azjava.testapp.model.Row;

public interface RowService {

    Row save (Row row);
    Row update (Row row);
    Row getById (Long id);
    void delete (Long id);
}
