package com.guilherme.EventClean.core.usecases;

import com.guilherme.EventClean.core.entities.FichaTreino;
import com.guilherme.EventClean.core.gateway.FichaTreinoGateway;

import java.util.List;

public class BuscarFichaTreinoCaseImpl implements BuscarFichaTreinoCase{


    private final FichaTreinoGateway fichaTreinoGateway;

    public BuscarFichaTreinoCaseImpl(FichaTreinoGateway fichaTreinoGateway) {
        this.fichaTreinoGateway = fichaTreinoGateway;
    }

    @Override
    public List<FichaTreino> execute() {
        return fichaTreinoGateway.buscarFichas();
    }
}
