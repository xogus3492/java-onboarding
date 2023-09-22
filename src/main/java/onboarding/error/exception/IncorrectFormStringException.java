package onboarding.error.exception;

import onboarding.error.ErrorMessage;

public class IncorrectFormStringException extends RuntimeException{
    public IncorrectFormStringException(ErrorMessage message) {
        super(message.getMessage());
    }
}