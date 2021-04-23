package com.test.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.app.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
