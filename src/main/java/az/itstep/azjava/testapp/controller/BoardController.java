package az.itstep.azjava.testapp.controller;

import az.itstep.azjava.testapp.model.Board;
import az.itstep.azjava.testapp.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/boards")

public class BoardController {

    private BoardService boardService;

    @PostMapping
    Board save(@RequestBody Board team) {
        return boardService.save(team);
    }

    @PutMapping
    Board update(@RequestBody Board team) {
        return boardService.update(team);
    }

    @GetMapping("/{id}")
    Board getById(@PathVariable Long id) {
        return boardService.getById(id);
    }

    @DeleteMapping ("/{id}")
    void delete(@PathVariable Long id) {
        boardService.delete(id);
    }

    @Autowired
    public void setBoardService(BoardService boardService) {
        this.boardService = boardService;
    }
}
