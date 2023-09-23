package onboarding;

import onboarding.error.ErrorMessage;
import onboarding.error.exception.common.LengthOutOfBoundsException;

public class Problem4 {
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 1000;
    private static final char LOWER_CASE_A = 'a';
    private static final char LOWER_CASE_Z = 'z';
    private static final char UPPER_CASE_A = 'A';
    private static final char UPPER_CASE_Z = 'Z';
    private static final int LOWER_CASE = 0;
    private static final int UPPER_CASE = 1;

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
        if (c >= LOWER_CASE_A && c <= LOWER_CASE_Z) {
            return convertChar(c, LOWER_CASE);
        }
        if (c >= UPPER_CASE_A && c <= UPPER_CASE_Z) {
            return convertChar(c, UPPER_CASE);
        }
        return c;
    }

    public static char convertChar(char c, int charCase) {
        return ' ';
    }

    public static boolean isIncorrectStringLength(String word) {
        return word.length() < MIN_LENGTH || word.length() > MAX_LENGTH;
    }
}
