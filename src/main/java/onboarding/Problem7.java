package onboarding;

import onboarding.error.ErrorMessage;
import onboarding.error.exception.common.LengthOutOfBoundsException;

import java.util.Collections;
import java.util.List;

public class Problem7 {
    private static final int MIN_USER_LENGTH = 1;
    private static final int MAX_USER_LENGTH = 30;

    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();

        verifyUserInputLength(user);

        return answer;
    }

    public static void verifyUserInputLength(String user) {
        if (user.length() < MIN_USER_LENGTH || user.length() > MAX_USER_LENGTH) {
            throw new LengthOutOfBoundsException(ErrorMessage.USER_LENGTH_OUT_OF_BOUNDS);
        }
    }
}
