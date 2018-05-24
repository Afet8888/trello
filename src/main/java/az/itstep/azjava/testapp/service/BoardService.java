package az.itstep.azjava.testapp.service;

import az.itstep.azjava.testapp.model.Board;

public interface BoardService {

    Board save (Board board);
    Board update (Board board);
    Board getById (Long id);
    void delete (Long id);
}
