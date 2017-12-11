package com.social.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long>{

}
