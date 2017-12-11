package com.social.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long>{

}
