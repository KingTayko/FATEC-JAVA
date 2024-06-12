package br.fatec.blog.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Comentario> comentarios = new ArrayList<>();

    public Post() {
    }

    public Post(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(Comentario comentarios) {
        comentarios.setPost(this);
        this.comentarios.add(comentarios);
    }

    @Override
    public String toString() {
        return  titulo + '\'' +
                ", comentarios:" + comentarios ;
    }
}
