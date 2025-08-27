package com.guilherme.EventClean.infrastructure.persistence;

import com.guilherme.EventClean.core.entities.FichaTreino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FichaTreinoRepository extends JpaRepository<FichaTreino, Long> {
}
