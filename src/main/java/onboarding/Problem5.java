package onboarding;

import onboarding.error.ErrorMessage;
import onboarding.error.exception.common.InputOutOfBoundsException;

import java.util.Collections;
import java.util.List;

public class Problem5 {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 1000000;

    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();

        if (isIncorrectInput(money)) {
            throw new InputOutOfBoundsException(ErrorMessage.INPUT_OUT_OF_BOUNDS_P5);
        }

        return answer;
    }

    public static boolean isIncorrectInput(int input) {
        return input < MIN_VALUE || input > MAX_VALUE;
    }
}
