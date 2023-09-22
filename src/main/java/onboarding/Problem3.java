package onboarding;

import onboarding.error.ErrorMessage;
import onboarding.error.exception.problem3.InputOutOfBoundsException;

public class Problem3 {
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 10000;

    public static int solution(int number) {
        int answer = 0;

        if (isIncorrectNumRange(number)) {
            throw new InputOutOfBoundsException(ErrorMessage.INPUT_OUT_OF_BOUNDS);
        }

        return answer;
    }

    public static boolean isIncorrectNumRange(int number) {
        return number < MIN_NUM || number > MAX_NUM;
    }
}
