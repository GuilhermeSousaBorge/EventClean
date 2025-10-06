package com.guilherme.EventClean.infrastructure.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerExceptionHandler {

    public ResponseEntity<Map<String, String>> handleNotFoundTrainingSheetException(NotFoundTrainingSheetException exception){

        Map<String, String> response = new HashMap<>();
        response.put("Error", exception.getMessage());
        response.put("Message", "Ficha nao encontrada");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}
