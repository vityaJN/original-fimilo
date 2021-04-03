package com.fimilo.backend.exception;

import com.fimilo.exception.BusinessException;
import com.fimilo.exception.BusinessErrorMessages;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Handles globally the threw Business exceptions,
 * if a business exception is arises, this handler responds to the frontend server
 * with a error message and with a http status code
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({BusinessException.class})
    public ResponseEntity<BusinessErrorMessages> businessExceptionHandler(BusinessException ex ) {
        return new ResponseEntity<>(ex.getBusinessErrorMessages(), HttpStatus.BAD_REQUEST);
    }
}
