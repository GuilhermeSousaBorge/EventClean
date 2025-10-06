package com.guilherme.EventClean.infrastructure.mappers;

import com.guilherme.EventClean.core.entities.FichaTreino;
import com.guilherme.EventClean.infrastructure.dtos.FichaTreinoDto;
import org.springframework.stereotype.Component;

@Component
public class FichaTreinoDtoMapper {

    public FichaTreinoDto toDto(FichaTreino fichaTreino){
        return new FichaTreinoDto(
                fichaTreino.id(),
                fichaTreino.exerciseName(),
                fichaTreino.weekDay(),
                fichaTreino.sets(),
                fichaTreino.reps(),
                fichaTreino.advancedTechnique(),
                fichaTreino.urlVideo(),
                fichaTreino.createdAt(),
                fichaTreino.updatedAt()
        );
    }

    public FichaTreino toEntity(FichaTreinoDto dto){
        return new FichaTreino(
                dto.id(),
                dto.exerciseName(),
                dto.weekDay(),
                dto.sets(),
                dto.reps(),
                dto.advancedTechnique(),
                dto.urlVideo(),
                dto.createdAt(),
                dto.updatedAt()
        );
    }
}
