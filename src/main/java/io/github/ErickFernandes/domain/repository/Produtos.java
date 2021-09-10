package io.github.ErickFernandes.domain.repository;

import io.github.ErickFernandes.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
