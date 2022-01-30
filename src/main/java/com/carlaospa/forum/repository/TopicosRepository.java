package com.carlaospa.forum.repository;

import java.util.List;
import com.carlaospa.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TopicosRepository
 */
public interface TopicosRepository extends JpaRepository<Topico, Long>{
    
    //outra forma de pesquisa com jpql 
    //@Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
    //List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso")  String nomeCurso);

    List<Topico> findByCursoNome(String nomeCurso);
    
}