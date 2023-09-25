package onboarding.error;

public enum ErrorMessage {

    // problem2
    LENGTH_OUT_OF_BOUNDS_P2("길이 1 ~ 1000의 범위를 벗어났습니다."),
    INCORRECT_FORM_STRING("소문자 외 문자를 포함하고 있습니다."),

    // problem3
    INPUT_OUT_OF_BOUNDS_P3("입력받은 수가 1 ~ 10000의 범위를 벗어났습니다."),

    // problem4
    LENGTH_OUT_OF_BOUNDS_P4("길이 1 ~ 1000의 범위를 벗어났습니다."),

    // problem5
    INPUT_OUT_OF_BOUNDS_P5("입력받은 수가 1 ~ 1000000의 범위를 벗어났습니다."),

    // problem6
    INCORRECT_NUMBER_OF_MEMBER("크루원 수 1명 ~ 10000명을 벗어났습니다."),
    INCLUDE_INCORRECT_EMAIL_LENGTH("길이가 11자 ~ 20자가 아닌 이메일이 포함되어 있습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}