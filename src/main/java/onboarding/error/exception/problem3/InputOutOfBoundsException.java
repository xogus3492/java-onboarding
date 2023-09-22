package onboarding.error.exception.problem3;

import onboarding.error.ErrorMessage;

public class InputOutOfBoundsException extends RuntimeException {
    public InputOutOfBoundsException(ErrorMessage em) {
        super(em.getMessage());
    }
}
