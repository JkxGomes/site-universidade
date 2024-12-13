package acc.br.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {

    @jakarta.persistence.Id
    private Long id;
    private String nome;
    private String dataNascimento;
    private String cep;
    private String cidade;
    private String curso;
}
