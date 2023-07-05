package com.tiago.helpdesk.service.exceptions;


public class ObjectNotFoundException extends RuntimeException{
    private static final long serializableUID = 1l;

    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjectNotFoundException(String message) {
        super(message);
    }
}
