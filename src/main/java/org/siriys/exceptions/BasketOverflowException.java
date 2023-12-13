package org.siriys.exceptions;

public class BasketOverflowException extends RuntimeException {
    public BasketOverflowException() {
        super();
    }

    public BasketOverflowException(String message) {
        super(message);
    }

    public BasketOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasketOverflowException(Throwable cause) {
        super(cause);
    }

    protected BasketOverflowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
