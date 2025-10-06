package com.guilherme.EventClean.infrastructure.mappers;

import com.guilherme.EventClean.core.entities.FichaTreino;
import com.guilherme.EventClean.infrastructure.persistence.FichaTreinoEntity;
import org.springframework.stereotype.Component;

@Component
public class FichaTreinoEntityMapper {

    public FichaTreinoEntity toEntity(FichaTreino fichaTreino){
        return new FichaTreinoEntity(
                fichaTreino.id(),
                fichaTreino.exerciseName(),
                fichaTreino.weekDay(),
                fichaTreino.advancedTechnique(),
                fichaTreino.urlVideo(),
                fichaTreino.sets(),
                fichaTreino.reps(),
                fichaTreino.createdAt(),
                fichaTreino.updatedAt()
        );
    }

    public FichaTreino toDomain(FichaTreinoEntity fichaTreinoEntity){
        return new FichaTreino(
                fichaTreinoEntity.getId(),
                fichaTreinoEntity.getExerciseName(),
                fichaTreinoEntity.getWeekDay(),
                fichaTreinoEntity.getSets(),
                fichaTreinoEntity.getReps(),
                fichaTreinoEntity.getAdvancedTechnique(),
                fichaTreinoEntity.getUrl_video(),
                fichaTreinoEntity.getCreatedAt(),
                fichaTreinoEntity.getUpdatedAt()
        );
    }
}
