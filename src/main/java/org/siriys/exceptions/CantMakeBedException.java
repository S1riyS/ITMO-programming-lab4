package org.siriys.exceptions;

public class CantMakeBedException extends Exception {
    public CantMakeBedException() {
        super();
    }

    public CantMakeBedException(String message) {
        super(message);
    }

    public CantMakeBedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CantMakeBedException(Throwable cause) {
        super(cause);
    }

    protected CantMakeBedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
