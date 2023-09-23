package onboarding.error.exception.common;

import onboarding.error.ErrorMessage;

public class LengthOutOfBoundsException extends RuntimeException {
    public  LengthOutOfBoundsException(ErrorMessage em) {
        super(em.getMessage());
    }
}