package io.github.ErickFernandes.domain.repository;

import io.github.ErickFernandes.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
}