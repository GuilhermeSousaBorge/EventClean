package com.guilherme.EventClean.core.usecases;

import com.guilherme.EventClean.core.entities.FichaTreino;
import com.guilherme.EventClean.core.gateway.FichaTreinoGateway;

public class CriarFichaTreinoCaseImpl implements CriarFichaTreinoCase {


    private final FichaTreinoGateway fichatreinoGateway;

    public CriarFichaTreinoCaseImpl(FichaTreinoGateway fichatreinoGateway) {
        this.fichatreinoGateway = fichatreinoGateway;
    }

    @Override
    public FichaTreino execute(FichaTreino fichaTreino) {
        return fichatreinoGateway.criarFicha(fichaTreino);
    }
}
