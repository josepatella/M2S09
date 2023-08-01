package controller;

import entidades.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.PessoaService;

import java.util.List;

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
    @GetMapping
    public ResponseEntity<List> listaPessoas(){
        List<Pessoa> response = service.ListaPessoas();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Pessoa> listaPessoaId(@PathVariable Long id){

        Pessoa response = service.ListaPessoaId(id);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
