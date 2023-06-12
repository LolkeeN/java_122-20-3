package org.example.exceptions;

public class InvalidMatrixSizeException extends RuntimeException{

    public InvalidMatrixSizeException(String message) {
        super(message);
    }
}
