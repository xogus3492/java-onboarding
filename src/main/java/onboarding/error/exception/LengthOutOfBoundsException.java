package onboarding.error.exception;

import onboarding.error.ErrorMessage;

public class LengthOutOfBoundsException extends RuntimeException{
    public  LengthOutOfBoundsException(ErrorMessage message) {
        super(message.getMessage());
    }
}