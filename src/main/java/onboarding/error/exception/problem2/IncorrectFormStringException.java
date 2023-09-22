package onboarding.error.exception.problem2;

import onboarding.error.ErrorMessage;

public class IncorrectFormStringException extends RuntimeException {
    public IncorrectFormStringException(ErrorMessage em) {
        super(em.getMessage());
    }
}