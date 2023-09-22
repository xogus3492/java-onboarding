package onboarding;

import java.util.List;

class Problem1 {
    private static final int EXCEPTION_NUMBER = -1;
    private static final int FIRST_PAGE = 1;
    private static final int LAST_PAGE = 400;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = 0;
        int pobiScore = 0;
        int crongScore = 0;

        if (pageValidation(pobi) || pageValidation(crong)) {
            return EXCEPTION_NUMBER;
        }

        pobiScore = getMaxNum(getMaxNum(calculateAdd(pobi.get(0)), calculateMulti(pobi.get(0)))
                , getMaxNum(calculateAdd(pobi.get(0)), calculateMulti(pobi.get(1))));

        crongScore = getMaxNum(getMaxNum(calculateAdd(crong.get(0)), calculateMulti(crong.get(0)))
                , getMaxNum(calculateAdd(crong.get(0)), calculateMulti(crong.get(1))));

        return answer;
    }

    public static int calculateAdd(int num) {
        int result = 0;

        while (num > 0) {
            result += num % 10;
            num /= 10;
        }

        return result;
    }

    public static int calculateMulti(int num) {
        int result = 1;

        while (num > 0) {
            result *= num % 10;
            num /= 10;
        }

        return result;
    }

    public static int getMaxNum(int firstNum, int secondNum) {
        return Math.max(firstNum, secondNum);
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