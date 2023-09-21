package onboarding;

import java.util.List;

class Problem1 {
    private static final int EXCEPTION_NUMBER = -1;
    private static final int FIRST_PAGE = 1;
    private static final int LAST_PAGE = 400;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = 0;

        if (pageValidation(pobi) || pageValidation(crong)) {
            return EXCEPTION_NUMBER;
        }

        return answer;
    }

    public static boolean pageValidation(List<Integer> pageList) {
        return isEmpty(pageList) || isNotPageRange(pageList) ||
                isNotContinuous(pageList) || isInCorrectOddOrEven(pageList);
    }

    public static boolean isEmpty(List<Integer> pageList) {
        return pageList.isEmpty();
    }

    public static boolean isNotPageRange(List<Integer> pageList) {
        return pageList.get(0) < FIRST_PAGE || pageList.get(0) > LAST_PAGE ||
            pageList.get(1) < FIRST_PAGE || pageList.get(1) > LAST_PAGE;
    }

    public static boolean isNotContinuous(List<Integer> pageList) {
        return Math.abs(pageList.get(0) - pageList.get(1)) != 1;
    }

    public static boolean isInCorrectOddOrEven(List<Integer> pageList) {
        return pageList.get(0) % 2 != 1 || pageList.get(1) % 2 != 0;
    }
}