package onboarding;

import onboarding.error.ErrorMessage;
import onboarding.error.exception.problem6.ListSizeOutOfRange;

import java.util.List;

public class Problem6 {
    private static final int MIN_LIST_SIZE = 1;
    private static final int MAX_LIST_SIZE = 10000;

    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");

        verifyListSize(forms);

        return answer;
    }

    public static void verifyListSize(List<List<String>> forms) {
        if (forms.size() < MIN_LIST_SIZE || forms.size() > MAX_LIST_SIZE) {
            throw new ListSizeOutOfRange(ErrorMessage.INCORRECT_NUMBER_OF_MEMBER);
        }
    }

}
