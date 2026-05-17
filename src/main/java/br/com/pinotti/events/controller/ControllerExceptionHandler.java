package br.com.pinotti.events.controller;

import br.com.pinotti.events.dto.ErrorDTO;
import br.com.pinotti.events.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorDTO> handleNotFoundException(NotFoundException ex) {

        return ResponseEntity
                .status(404)
                .body(new ErrorDTO(ex.getMessage()));
    }
}