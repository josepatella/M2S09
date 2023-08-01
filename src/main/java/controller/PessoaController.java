package controller;

import entidades.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    PessoaService service;

    @PostMapping
    public ResponseEntity<Pessoa> cadastraPessoa(@RequestBody Pessoa pessoa){
        Pessoa response = service.cadastraPessoa(pessoa);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
