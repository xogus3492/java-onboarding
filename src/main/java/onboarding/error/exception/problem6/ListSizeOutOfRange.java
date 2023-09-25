package onboarding.error.exception.problem6;

import onboarding.error.ErrorMessage;

public class ListSizeOutOfRange extends RuntimeException {
    public ListSizeOutOfRange(ErrorMessage em) {
        super(em.getMessage());
    }
}
