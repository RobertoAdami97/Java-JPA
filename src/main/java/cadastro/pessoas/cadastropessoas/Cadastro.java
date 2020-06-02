package cadastro.pessoas.cadastropessoas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Cadastro {
    
    @Id
    // a anotação abaixo faz com que o banco de dados crie automaticamente o id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String dados;
}