package br.com.jamiz.pessoal_gitlab_api_livros.repository;

import br.com.jamiz.pessoal_gitlab_api_livros.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
