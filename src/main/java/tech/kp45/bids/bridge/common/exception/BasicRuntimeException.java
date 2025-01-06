package tech.kp45.bids.bridge.common.exception;

public class BasicRuntimeException extends RuntimeException {

    public BasicRuntimeException(String message) {
        super(message);
    }

    public BasicRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
