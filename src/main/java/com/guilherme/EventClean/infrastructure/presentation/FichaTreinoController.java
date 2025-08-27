package com.guilherme.EventClean.infrastructure.presentation;


import com.guilherme.EventClean.core.entities.FichaTreino;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class FichaTreinoController {

    @PostMapping("criarFicha")
    public String criarFicha(@RequestBody FichaTreino payload) {
        return "Ficha criada";
    }
}
