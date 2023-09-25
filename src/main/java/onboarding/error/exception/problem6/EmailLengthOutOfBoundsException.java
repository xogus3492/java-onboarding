package onboarding.error.exception.problem6;

import onboarding.error.ErrorMessage;

public class EmailLengthOutOfBoundsException extends RuntimeException {
    public EmailLengthOutOfBoundsException(ErrorMessage em) {
        super(em.getMessage());
    }
}
