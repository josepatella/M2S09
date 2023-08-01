package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PessoaRepository;

@Service
public class PessoaService {
    @Autowired private PessoaRepository repository;
}
