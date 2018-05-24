package az.itstep.azjava.testapp.service.impl;

import az.itstep.azjava.testapp.model.Board;
import az.itstep.azjava.testapp.repository.BoardRepository;
import az.itstep.azjava.testapp.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class BoardServiceImpl implements BoardService {

    private BoardRepository boardRepository;

    @Override
    public Board save(Board board) {
        if (Objects.isNull(board)) throw new RuntimeException("Board not entered");
        if (Objects.isNull(board.getId()) || Objects.isNull(board.getName()))
            throw new RuntimeException("Bad board data");
        return boardRepository.save(board);
    }

    @Override
    public Board update(Board board) {
        if (Objects.isNull(board)) throw new RuntimeException("Board not entered");
        if (Objects.isNull(board.getId()) || Objects.isNull(board.getName()))
            throw new RuntimeException("Bad board data");
        if (!boardRepository.existsById(board.getId()))
            throw new RuntimeException("Nothing to update");
        return boardRepository.save(board);
    }

    @Override
    public Board getById(Long id) {
        if (Objects.isNull(id))
            throw new RuntimeException("No id");
        Optional<Board> board = boardRepository.findById(id);
        if (board.isPresent())
            return board.get();
        throw new RuntimeException("Board not found");
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        boardRepository.deleteById(id);
    }

    @Autowired
    public void setBoardRepository(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }
}
