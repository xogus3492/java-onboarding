package onboarding;

import onboarding.error.ErrorMessage;
import onboarding.error.exception.IncorrectFormStringException;
import onboarding.error.exception.LengthOutOfBoundsException;

public class Problem2 {
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 1000;

    public static String solution(String cryptogram) {
        String answer = "";

        if (isInCorrectStringLength(cryptogram)) {
            throw new LengthOutOfBoundsException(ErrorMessage.LENGTH_OUT_OF_BOUNDS);
        }

        if (isNotComposedLowerCase(cryptogram)) {
            throw new IncorrectFormStringException(ErrorMessage.INCORRECT_FORM_STRING);
        }

        return answer;
    }

    public static boolean isInCorrectStringLength(String cryptogram) {
        return cryptogram.length() < MIN_LENGTH || cryptogram.length() > MAX_LENGTH;
    }

    public static boolean isNotComposedLowerCase(String cryptogram) {
        String regex = "^[a-z]+$";

        return !cryptogram.matches(regex);
    }


}