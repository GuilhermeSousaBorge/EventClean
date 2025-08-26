package com.guilherme.EventClean.core.entities;

import java.time.LocalDateTime;

public record FichaTreino(
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
