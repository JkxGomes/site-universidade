package acc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.university.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
