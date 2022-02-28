package educationalgoals.educationalgoals.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "quizzes")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"quiz"})
    private List<Question> questions;


    public Quiz(List<Question> questions) {
        this.questions = questions;
    }

    public Quiz() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question){
        this.questions.add(question);
    }

    public void removeQuestion(Question question){
        this.questions.remove(question);
    }
}
