package acc.br.test;

import com.university.model.Aluno;
import com.university.repository.AlunoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StudentControllerTest {

    @Autowired
    private AlunoRepository alunoRepository;

    @Test
    public void testRegisterStudent() {
        Aluno aluno = new Aluno();
        aluno.setNome("João Silva");
        aluno.setDataNascimento("2000-01-01");
        aluno.setCep("12345678");
        aluno.setCidade("São Paulo");
        aluno.setCurso("Engenharia");

        Aluno savedAluno = alunoRepository.save(aluno);

        assertNotNull(savedAluno.getId());
    }
}
