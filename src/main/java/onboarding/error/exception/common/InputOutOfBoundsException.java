package onboarding.error.exception.common;

import onboarding.error.ErrorMessage;

public class InputOutOfBoundsException extends RuntimeException {
    public InputOutOfBoundsException(ErrorMessage em) {
        super(em.getMessage());
    }
}
