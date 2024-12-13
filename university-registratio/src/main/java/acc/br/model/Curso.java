package acc.br.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Curso {

    @jakarta.persistence.Id
    private Long id;
    private String nomeCurso;
}
