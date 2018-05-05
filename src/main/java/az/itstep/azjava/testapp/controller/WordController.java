package az.itstep.azjava.testapp.controller;

import az.itstep.azjava.testapp.model.Word;
import az.itstep.azjava.testapp.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/words")
public class WordController {

    private WordService wordService;

    @PostMapping
    Word save(@RequestBody Word word) {
        return wordService.save(word);
    }

    @Autowired
    public void setWordService(WordService wordService) {
        this.wordService = wordService;
    }
}
