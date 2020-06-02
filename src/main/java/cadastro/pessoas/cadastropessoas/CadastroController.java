package cadastro.pessoas.cadastropessoas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CadastroController {
    @Autowired
    CadastroRepository cadastroRepository;

    @PostMapping(value="/cadastro")
    public ModelAndView postCadastro(
        @RequestParam String nome,
        @RequestParam int idade,
        @RequestParam String email,
        @RequestParam String telefone) {
        
        String listarCadastro = nome + " / " + idade + " / " + email + " / " + telefone;

        Cadastro cadastro = new Cadastro();
        cadastro.setDados(listarCadastro);

        cadastroRepository.save(cadastro);
        ModelAndView modelAndView = new ModelAndView("index");        
        // modelAndView.addObject("resultado", listarCadastro);
        modelAndView.addObject("resultado", cadastroRepository.findAll());
        return modelAndView;
    }

}
