package onboarding.error.exception.problem6;

import onboarding.error.ErrorMessage;

public class NicknameLengthOutOfBoundsException extends RuntimeException{
    public NicknameLengthOutOfBoundsException(ErrorMessage em) {
        super(em.getMessage());
    }
}
