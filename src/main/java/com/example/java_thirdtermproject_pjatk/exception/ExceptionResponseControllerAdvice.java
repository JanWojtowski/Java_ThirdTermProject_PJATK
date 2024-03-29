package com.example.java_thirdtermproject_pjatk.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.Instant;

@ControllerAdvice
public class ExceptionResponseControllerAdvice {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = {ResourceNotFoundException.class, StudioNotFoundException.class, AnimeNotFoundException.class, GenreNotFoundException.class})
    @ResponseBody
    public ErrorResponse handeNotFound(RuntimeException exception){
        return new ErrorResponse(Instant.now(), exception.getMessage());
    }
}
