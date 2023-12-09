package org.siriys.exceptions;

public class TooManyFruitsError extends Error {
    public TooManyFruitsError() {
        super();
    }

    public TooManyFruitsError(String message) {
        super(message);
    }

    public TooManyFruitsError(String message, Throwable cause) {
        super(message, cause);
    }

    public TooManyFruitsError(Throwable cause) {
        super(cause);
    }

    protected TooManyFruitsError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
