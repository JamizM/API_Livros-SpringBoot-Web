package br.com.jamiz.pessoal_gitlab_api_livros.model;

import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@NoArgsConstructor
//construtor com todos os parâmetros, na ordem de declaração
@AllArgsConstructor
//quando aplicados a uma classe
//geram getters/setters para todos os campos não marcados como
@Getter
@Setter
@Entity
public class Livro {
    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String autor;
    private int edicao;
}
