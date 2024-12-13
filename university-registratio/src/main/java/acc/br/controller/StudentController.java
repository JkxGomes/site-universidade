package acc.br.controller;

import com.university.model.Aluno;
import com.university.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private alunoRepository alunoRepository;

    @PostMapping("/register")
    public Aluno registerStudent(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @GetMapping("/register/{id}")
    public Aluno getStudent(@PathVariable Long id) {
        return alunoRepository.findById(id).orElse(null);
    }
    public class StudentWebController {

        @GetMapping("/studentRegistration")
        public String showRegistrationForm() {
            return "html/StudentRegistration";  // StudantReistration.html
        }
    }
}
