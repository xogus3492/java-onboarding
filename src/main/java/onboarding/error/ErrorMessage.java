package onboarding.error;

public enum ErrorMessage {

    LENGTH_OUT_OF_BOUNDS("길이 1 ~ 1000의 범위를 벗어났습니다."),
    INCORRECT_FORM_STRING("소문자 외 문자를 포함하고 있습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}