package com.guilherme.EventClean.infrastructure.dtos;

import java.time.LocalDateTime;

public record FichaTreinoDto(
        Long id,
        String exerciseName,
        String weekDay,
        int sets,
        int reps,
        String advancedTechnique,
        String urlVideo,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) { }
