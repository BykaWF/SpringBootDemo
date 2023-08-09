package com.yaroslavcode.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;
// Will handle more than 1 exception
@ControllerAdvice
public class ApiExceptionHandler {
//    They have to match
    @ExceptionHandler(value = ApiRequestException.class)
    public ResponseEntity<Object> handleApiRequestException(
            // takes an exception that going to handle
//            we want to take this exception
            ApiRequestException e // math with value
    ){
        //Build payload for our client
        ApiException apiException = new ApiException(
                e.getMessage(),
                e,
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now()
        );

        // Send the Response
        return new ResponseEntity<>(
                apiException,
                HttpStatus.BAD_REQUEST);
    }
}
