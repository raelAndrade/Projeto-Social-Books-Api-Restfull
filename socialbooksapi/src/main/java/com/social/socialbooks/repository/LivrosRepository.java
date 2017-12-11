/*
 * A camada repository é uma camada responsavel para acessar o banco de dados
 */
package com.social.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{
	
	
}
