package br.com.jamiz.pessoal_gitlab_api_livros.service;

import br.com.jamiz.pessoal_gitlab_api_livros.model.Livro;
import br.com.jamiz.pessoal_gitlab_api_livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;
    //acessa a base usando o livroRepository
    //save é um método que foi implementado automaticamente
    //ele faz um insert numa base relacional
    public void salvar (Livro livro){
        this.livroRepository.save(livro);
    }
    //findAll é um método que foi implementado automaticamente
    //ele faz um SELECT * numa base relacional
    public List<Livro> listar (){
        return this.livroRepository.findAll();
    }
}