package com.guilherme.EventClean.core.gateway;

import com.guilherme.EventClean.core.entities.FichaTreino;

import java.util.List;
import java.util.Optional;

public interface FichaTreinoGateway {

    FichaTreino criarFicha(FichaTreino fichaTreino);

    List<FichaTreino> buscarFichas();

    Optional<FichaTreino> filtrarNomeExercicio(String nome);
}
