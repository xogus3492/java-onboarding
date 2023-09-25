package onboarding;

import onboarding.error.ErrorMessage;
import onboarding.error.exception.problem6.EmailLengthOutOfBoundsException;
import onboarding.error.exception.problem6.ListSizeOutOfRange;

import java.util.List;

public class Problem6 {
    private static final int MIN_LIST_SIZE = 1;
    private static final int MAX_LIST_SIZE = 10000;
    private static final int MIN_EMAIL_LENGTH = 11;
    private static final int MAX_EMAIL_LENGTH = 20;

    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");

        verifyListSize(forms);

        for (List<String> member : forms) {
            String email = member.get(0);

            verifyEmailLength(email);
        }

        return answer;
    }

    public static void verifyListSize(List<List<String>> forms) {
        if (forms.size() < MIN_LIST_SIZE || forms.size() > MAX_LIST_SIZE) {
            throw new ListSizeOutOfRange(ErrorMessage.INCORRECT_NUMBER_OF_MEMBER);
        }
    }

    public static void verifyEmailLength(String email) {
        if (email.length() < MIN_EMAIL_LENGTH || email.length() > MAX_EMAIL_LENGTH) {
            throw new EmailLengthOutOfBoundsException(ErrorMessage.INCLUDE_INCORRECT_EMAIL_LENGTH);
        }
    }



}
