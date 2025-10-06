package com.guilherme.EventClean.infrastructure.gateway;

import com.guilherme.EventClean.core.entities.FichaTreino;
import com.guilherme.EventClean.core.gateway.FichaTreinoGateway;
import com.guilherme.EventClean.infrastructure.mappers.FichaTreinoEntityMapper;
import com.guilherme.EventClean.infrastructure.persistence.FichaTreinoEntity;
import com.guilherme.EventClean.infrastructure.persistence.FichaTreinoRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FichaTreinoRepositoryGateway implements FichaTreinoGateway {

    private final FichaTreinoRepository fichaTreinoRepository;
    private final FichaTreinoEntityMapper mapper;

    public FichaTreinoRepositoryGateway(FichaTreinoRepository fichaTreinoRepository, FichaTreinoEntityMapper mapper) {
        this.fichaTreinoRepository = fichaTreinoRepository;
        this.mapper = mapper;
    }

    @Override
    public FichaTreino criarFicha(FichaTreino fichaTreino) {
        FichaTreinoEntity entity = mapper.toEntity(fichaTreino);
        FichaTreinoEntity novaFicha = fichaTreinoRepository.save(entity);
        return mapper.toDomain(novaFicha);
    }

    @Override
    public List<FichaTreino> buscarFichas() {
        return fichaTreinoRepository.findAll().stream().map(mapper::toDomain).toList();
    }

    @Override
    public Optional<FichaTreino> filtrarNomeExercicio(String nome) {
        return fichaTreinoRepository.findByExerciseName(nome);
    }
}
