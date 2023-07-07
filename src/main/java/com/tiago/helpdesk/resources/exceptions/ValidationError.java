package com.tiago.helpdesk.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{
    public static final long serializebleUID = 1L;

    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(){
        super();
    }

    public ValidationError(List<FieldMessage> errors) {
        this.errors = errors;
    }

    public ValidationError(Long timesTemp, Integer status, String error, String message, String path) {
        super(timesTemp, status, error, message, path);
        this.errors = errors;
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message) {
        this.errors.add(new FieldMessage(fieldName, message));
    }
}
