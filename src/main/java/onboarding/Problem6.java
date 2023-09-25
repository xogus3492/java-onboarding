package onboarding;

import onboarding.error.ErrorMessage;
import onboarding.error.exception.problem6.EmailLengthOutOfBoundsException;
import onboarding.error.exception.problem6.ListSizeOutOfRange;
import onboarding.error.exception.problem6.NicknameLengthOutOfBoundsException;

import java.util.*;

public class Problem6 {
    private static final int MIN_LIST_SIZE = 1;
    private static final int MAX_LIST_SIZE = 10000;
    private static final int MIN_EMAIL_LENGTH = 11;
    private static final int MAX_EMAIL_LENGTH = 19;
    private static final int MIN_NICKNAME_LENGTH = 1;
    private static final int MAX_NICKNAME_LENGTH = 19;

    public static List<String> solution(List<List<String>> forms) {
        List<String> emailList = new ArrayList<>();

        verifyListSize(forms);

        for (List<String> member : forms) {
            String email = member.get(0);
            String nickname = member.get(1);
            List<String> wordList = new ArrayList();

            verifyEmailLength(email);
            verifyNicknameLength(nickname);

            addWordList(nickname, wordList);
        }

        return emailList;
    }

    public static void addWordList(String nickname, List<String> wordList) {
        for (int i = 0; i < nickname.length() - 1; i++) {
            String head = String.valueOf(nickname.charAt(i));
            String tail = String.valueOf(nickname.charAt(i+1));
            wordList.add(head + tail);
        }
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

    public static void verifyNicknameLength(String nickname) {
        if (nickname.length() < MIN_NICKNAME_LENGTH || nickname.length() > MAX_NICKNAME_LENGTH) {
            throw new NicknameLengthOutOfBoundsException(ErrorMessage.INCLUDE_INCORRECT_NICKNAME_LENGTH);
        }
    }

}
