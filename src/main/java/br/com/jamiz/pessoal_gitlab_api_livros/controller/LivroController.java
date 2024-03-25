package br.com.jamiz.pessoal_gitlab_api_livros.controller;

import br.com.jamiz.pessoal_gitlab_api_livros.model.Livro;
import br.com.jamiz.pessoal_gitlab_api_livros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroService livroService;
    @PostMapping("/salvar")
    public void salvar (@RequestBody Livro livro){
        this.livroService.salvar(livro);
    }
    @GetMapping
    public List<Livro> listar (){
        return this.livroService.listar();
    }
}

