package com.test.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.app.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
