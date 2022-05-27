package br.com.root.forum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.root.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    Curso findByNome(String nome);

}
