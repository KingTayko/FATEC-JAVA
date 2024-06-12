package br.fatec.blog.repository;

import br.fatec.blog.model.Comentario;
import br.fatec.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BlogRepository extends JpaRepository<Post, Long> {

    List<Post> findAll();

    @Query("SELECT  p FROM Post p WHERE p.titulo LIKE %:keyword% OR p.descricao LIKE %:keyword%")
    List<Post> findByKeyword(String keyword);


}
