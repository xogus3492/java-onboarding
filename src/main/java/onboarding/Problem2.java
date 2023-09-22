package onboarding;

import onboarding.error.ErrorMessage;
import onboarding.error.exception.problem2.IncorrectFormStringException;
import onboarding.error.exception.problem2.LengthOutOfBoundsException;

import java.util.Stack;

public class Problem2 {
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 1000;

    public static String solution(String cryptogram) {
        String prevStr = "";

        if (isInCorrectStringLength(cryptogram)) {
            throw new LengthOutOfBoundsException(ErrorMessage.LENGTH_OUT_OF_BOUNDS);
        }

        if (isNotComposedLowerCase(cryptogram)) {
            throw new IncorrectFormStringException(ErrorMessage.INCORRECT_FORM_STRING);
        }

        while (!prevStr.equals(cryptogram)) {
            prevStr = cryptogram;
            cryptogram = decrypt(cryptogram);
        }

        return prevStr;
    }

    public static String decrypt(String cryptogram) {
        String result = "";
        Stack<Character> stack = new Stack<>();

        for (char c : cryptogram.toCharArray()) {
            processStack(stack, c);
        }

        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }

        return result;
    }

    public static void processStack(Stack<Character> stack, char c) {
        if (stack.empty()) {
            stack.push(c);
            return;
        }
        if (stack.peek() == c) {
            stack.pop();
            return;
        }
        if (stack.peek() != c) {
            stack.push(c);
        }
    }

    public static boolean isInCorrectStringLength(String cryptogram) {
        return cryptogram.length() < MIN_LENGTH || cryptogram.length() > MAX_LENGTH;
    }

    public static boolean isNotComposedLowerCase(String cryptogram) {
        return !cryptogram.matches("^[a-z]+$");
    }

}