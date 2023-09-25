package onboarding;

import onboarding.error.ErrorMessage;
import onboarding.error.exception.common.InputOutOfBoundsException;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 1000000;
    private static final int[] MONEYTARY_UNITS = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

    public static List<Integer> solution(int money) {
        if (isIncorrectInput(money)) {
            throw new InputOutOfBoundsException(ErrorMessage.INPUT_OUT_OF_BOUNDS_P5);
        }

        return getdMoneytaryUnitList(money);
    }

    public static boolean isIncorrectInput(int input) {
        return input < MIN_VALUE || input > MAX_VALUE;
    }

    public static List<Integer> getdMoneytaryUnitList(int money) {
        List<Integer> moneytaryUnitList = new ArrayList<>();

        for (int unit : MONEYTARY_UNITS) {
            moneytaryUnitList.add(money / unit);
            money %= unit;
        }

        return moneytaryUnitList;
    }

}
