package com.fimilo.exception;

/**
 * In this class we can define Business exception messages which the BusinessException uses
 */
public enum BusinessErrorMessages {
    TestError("Something bad happened"),
    ;

    private String errorMessage;

    BusinessErrorMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
