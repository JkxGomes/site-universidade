package acc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.university.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
