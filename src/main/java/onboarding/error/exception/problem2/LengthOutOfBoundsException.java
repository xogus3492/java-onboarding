package onboarding.error.exception.problem2;

import onboarding.error.ErrorMessage;

public class LengthOutOfBoundsException extends RuntimeException {
    public  LengthOutOfBoundsException(ErrorMessage em) {
        super(em.getMessage());
    }
}