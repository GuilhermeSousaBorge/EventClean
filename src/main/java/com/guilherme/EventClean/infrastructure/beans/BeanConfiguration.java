package com.guilherme.EventClean.infrastructure.beans;

import com.guilherme.EventClean.core.gateway.FichaTreinoGateway;
import com.guilherme.EventClean.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CriarFichaTreinoCase criarFichaTreinoCase(FichaTreinoGateway fichatreinoGateway){
        return new CriarFichaTreinoCaseImpl(fichatreinoGateway);
    }

    @Bean
    public BuscarFichaTreinoCase buscarFichaTreinoCase(FichaTreinoGateway fichaTreinoGateway){
        return new BuscarFichaTreinoCaseImpl(fichaTreinoGateway);
    }

    @Bean
    public FiltrarNomeExercicioCaseImpl filtrarNomeExercicioCase(FichaTreinoGateway fichaTreinoGateway){
        return new FiltrarNomeExercicioCaseImpl(fichaTreinoGateway);
    }
}
