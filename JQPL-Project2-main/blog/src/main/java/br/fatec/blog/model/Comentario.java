package br.fatec.blog.model;

import jakarta.persistence.*;


@Entity
@Table(name = "comentarios")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String autor;
    private String conteudo;

    @ManyToOne
    private Post post;

    public Comentario() {
    }

    public Comentario(String autor, String conteudo, Post post) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.post = post;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "autor='" + autor + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
