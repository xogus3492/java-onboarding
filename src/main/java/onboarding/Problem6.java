package onboarding;

import onboarding.error.ErrorMessage;
import onboarding.error.exception.problem6.ListSizeOutOfRange;

import java.util.List;

public class Problem6 {
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 10000;

    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");

        if (isIncorrectListSize(forms)) {
            throw new ListSizeOutOfRange(ErrorMessage.INCORRECT_NUMBER_OF_MEMBER);
        }

        return answer;
    }

    public static boolean isIncorrectListSize(List<List<String>> forms) {
        return forms.size() < MIN_SIZE || forms.size() > MAX_SIZE;
    }
}
