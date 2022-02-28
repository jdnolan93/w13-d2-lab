package educationalgoals.educationalgoals.controllers;

import educationalgoals.educationalgoals.models.Question;
import educationalgoals.educationalgoals.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    QuestionRepository questionRepository;

    @GetMapping(value = "/questions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/questions/{id}")
    public ResponseEntity getAnswer(@PathVariable Long id){
        return new ResponseEntity(questionRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/questions")
    public ResponseEntity<Question> postShip(@RequestBody Question question){
        questionRepository.save(question);
        return new ResponseEntity<>(question, HttpStatus.CREATED);
    }
}
