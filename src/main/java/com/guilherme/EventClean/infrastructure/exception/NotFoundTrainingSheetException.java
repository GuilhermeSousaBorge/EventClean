package com.guilherme.EventClean.infrastructure.exception;

public class NotFoundTrainingSheetException extends RuntimeException{

    public NotFoundTrainingSheetException(String message) {
        super(message);
    }
}
