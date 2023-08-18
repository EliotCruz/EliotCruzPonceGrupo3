package com.example.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class TareaHandler {

    @ExceptionHandler(value = {TareaException.class})
    public ResponseEntity<Object> handleTareaException(TareaException ex) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

        ApiException apiException = new ApiException(
            ex.getMessage(),
                httpStatus,
                ZonedDateTime.now()
        );

        return new ResponseEntity<>(apiException, httpStatus);
    }





}
