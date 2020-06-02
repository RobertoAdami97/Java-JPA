package cadastro.pessoas.cadastropessoas;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// A extensão CrudRepository facilita muito a vida do dev, pois, ele ja possui varios metodos prontos
// pra fazer persistencia no banco, metodos como: save, delete, findAll, findById, ja estão todos prontos
// é so criar uma instancia dessa interface CrudRepository e utlizar no model Cadastro
@Repository
public interface CadastroRepository extends CrudRepository<Cadastro, Long> {
    List<Cadastro> findAll();
}