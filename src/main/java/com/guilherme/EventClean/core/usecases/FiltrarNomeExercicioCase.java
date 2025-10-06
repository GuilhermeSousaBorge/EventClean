package com.guilherme.EventClean.core.usecases;

import com.guilherme.EventClean.core.entities.FichaTreino;

import java.util.Optional;

public interface FiltrarNomeExercicioCase {

    public FichaTreino execute(String nome);
}
