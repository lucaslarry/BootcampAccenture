package controller;

import model.Mensagem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.MensagemRepository;

import java.util.List;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {


    private final MensagemRepository repository;


    public MensagemController(MensagemRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public List<Mensagem> listar() {
        return repository.findAll();
    }
}
