package com.guilherme.EventClean.infrastructure.persistence;

import com.guilherme.EventClean.core.entities.FichaTreino;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FichaTreinoRepository extends JpaRepository<FichaTreinoEntity, Long> {

    Optional<FichaTreino> findByExerciseName(String exerciseName);
}
