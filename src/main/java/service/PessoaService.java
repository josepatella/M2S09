package service;

import entidades.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {
    @Autowired private PessoaRepository repository;
    public Pessoa cadastraPessoa(Pessoa pessoa){
        Pessoa novaPessoa = new Pessoa();
        novaPessoa = repository.save(novaPessoa);
        return novaPessoa;
    }

    public List<Pessoa> ListaPessoas() {
        List<Pessoa> response = repository.findAll();
        return response;
    }
}
