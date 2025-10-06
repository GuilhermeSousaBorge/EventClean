package com.guilherme.EventClean.core.usecases;

import com.guilherme.EventClean.core.entities.FichaTreino;
import com.guilherme.EventClean.core.gateway.FichaTreinoGateway;
import com.guilherme.EventClean.infrastructure.exception.NotFoundTrainingSheetException;

import java.util.Optional;

public class FiltrarNomeExercicioCaseImpl implements FiltrarNomeExercicioCase{

    private final FichaTreinoGateway fichaTreinoGateway;

    public FiltrarNomeExercicioCaseImpl(FichaTreinoGateway fichaTreinoGateway) {
        this.fichaTreinoGateway = fichaTreinoGateway;
    }


    @Override
    public FichaTreino execute(String nome) {
        return fichaTreinoGateway.filtrarNomeExercicio(nome)
                .orElseThrow(() -> new NotFoundTrainingSheetException("Not found"));
    }
}