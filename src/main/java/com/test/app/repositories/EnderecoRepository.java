package com.test.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.app.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
