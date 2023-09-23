package onboarding;

import onboarding.error.ErrorMessage;
import onboarding.error.exception.common.LengthOutOfBoundsException;

public class Problem4 {
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 1000;

    public static String solution(String word) {
        if (isIncorrectStringLength(word)) {
            throw new LengthOutOfBoundsException(ErrorMessage.LENGTH_OUT_OF_BOUNDS_P4);
        }

        return generateConvertedString(word);
    }

    public static String generateConvertedString(String word) {
        String resultStr = "";

        for (int i = 0; i < word.length(); i++) {
            resultStr += getFilteredChar(word.charAt(i));
        }

        return resultStr;
    }

    public static char getFilteredChar(char c) {
        return ' ';
    }

    public static boolean isIncorrectStringLength(String word) {
        return word.length() < MIN_LENGTH || word.length() > MAX_LENGTH;
    }
}
