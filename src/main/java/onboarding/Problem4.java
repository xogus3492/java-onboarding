package onboarding;

import onboarding.error.ErrorMessage;
import onboarding.error.exception.common.LengthOutOfBoundsException;

public class Problem4 {
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 1000;

    public static String solution(String word) {
        String answer = "";

        if (isIncorrectStringLength(word)) {
            throw new LengthOutOfBoundsException(ErrorMessage.LENGTH_OUT_OF_BOUNDS_P4);
        }

        return answer;
    }

    public static boolean isIncorrectStringLength(String word) {
        return word.length() < MIN_LENGTH || word.length() > MAX_LENGTH;
    }
}
