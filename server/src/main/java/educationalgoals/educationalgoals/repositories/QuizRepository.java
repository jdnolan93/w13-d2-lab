package educationalgoals.educationalgoals.repositories;

import educationalgoals.educationalgoals.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {


}
