package com.guilherme.EventClean.infrastructure.presentation;


import com.guilherme.EventClean.core.entities.FichaTreino;
import com.guilherme.EventClean.core.usecases.BuscarFichaTreinoCase;
import com.guilherme.EventClean.core.usecases.CriarFichaTreinoCase;
import com.guilherme.EventClean.core.usecases.FiltrarNomeExercicioCase;
import com.guilherme.EventClean.infrastructure.dtos.FichaTreinoDto;
import com.guilherme.EventClean.infrastructure.mappers.FichaTreinoDtoMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/training")
public class FichaTreinoController {

    private final CriarFichaTreinoCase criarFichaTreinoCase;
    private final FichaTreinoDtoMapper mapper;
    private final BuscarFichaTreinoCase buscarFichaTreinoCase;
    private final FiltrarNomeExercicioCase filtrarNomeExercicioCase;

    public FichaTreinoController(CriarFichaTreinoCase criarFichaTreinoCase, FichaTreinoDtoMapper mapper, BuscarFichaTreinoCase buscarFichaTreinoCase, FiltrarNomeExercicioCase filtrarNomeExercicioCase) {
        this.criarFichaTreinoCase = criarFichaTreinoCase;
        this.mapper = mapper;
        this.buscarFichaTreinoCase = buscarFichaTreinoCase;
        this.filtrarNomeExercicioCase = filtrarNomeExercicioCase;
    }

    @PostMapping("/criarFicha")
    public FichaTreinoDto criarFicha(@RequestBody FichaTreinoDto payload) {
        FichaTreino novaFicha = criarFichaTreinoCase.execute(mapper.toEntity(payload));
        return mapper.toDto(novaFicha);
    }

    @GetMapping("/listartodas")
    public List<FichaTreinoDto> listarFichas( ) {
        var listaFichas =  buscarFichaTreinoCase.execute();
        var resposta = listaFichas.stream().map(mapper::toDto).toList();
        return resposta;
    }

    @GetMapping("/{nome}")
    public ResponseEntity<FichaTreino> filtrarNomeExercicio(@PathVariable String nome ) {
        var resposta = filtrarNomeExercicioCase.execute(nome);
        return ResponseEntity.ok(resposta);
    }
}
