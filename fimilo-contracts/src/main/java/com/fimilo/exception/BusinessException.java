package com.fimilo.exception;

import lombok.Getter;

/**
 * Unchecked exception type, which can be thrown anywhere in the code.
 */
public class BusinessException extends RuntimeException {

    @Getter
    private final BusinessErrorMessages businessErrorMessages;

    public BusinessException(BusinessErrorMessages businessErrorMessages) {
        this.businessErrorMessages = businessErrorMessages;
    }

    @Override
    public String toString() {
        return  "Business Exception: " + businessErrorMessages.toString();
    }
}
