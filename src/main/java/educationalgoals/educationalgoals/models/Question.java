package educationalgoals.educationalgoals.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ask")
    private String ask;

    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"question"})
    private List<Answer> answers;

    public Question(String ask, List<Answer> answers) {
        this.ask = ask;
        this.answers = answers;
    }

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
