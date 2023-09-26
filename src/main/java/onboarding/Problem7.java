package onboarding;

import onboarding.error.ErrorMessage;
import onboarding.error.exception.common.LengthOutOfBoundsException;

import java.util.*;

public class Problem7 {
    private static final int MIN_USER_LENGTH = 1;
    private static final int MAX_USER_LENGTH = 30;
    private static final int MIN_FRIENDS_LENGTH = 1;
    private static final int MAX_FRIENDS_LENGTH = 10000;
    private static final int MAX_VISITORS_LENGTH = 10000;
    private static final int MUTUAL_FRIEND_RECOMMEND_POINT = 10;
    private static final int VISITOR_RECOMMEND_POINT = 1;
    private static final int MAX_NUMBER_OF_RECOMMEND_FRIEND = 5;

    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        Set<String> friendSet = new HashSet<>();
        Map<String, Integer> recommendFriendMap = new HashMap<>();
        List<String> rFMapKeySet;

        verifyUserInputLength(user);
        verifyFriendsListLength(friends);
        verifyVisitorsListLength(visitors);

        exploreFriendsListForSaveUserFriends(user, friends, friendSet);

        exploreFriendsListForGivePoints(user, friends, friendSet, recommendFriendMap);
        givePointsToVisitor(visitors, recommendFriendMap);

        rFMapKeySet = sortRecommendFriendBasedPoint(recommendFriendMap);
        addRecommendFriend(answer, rFMapKeySet);
        sortAnswerList(answer);

        return answer;
    }

    public static void exploreFriendsListForSaveUserFriends(String user, List<List<String>> friends, Set<String> friendSet) {
        for (List<String> relationship : friends) {
            String A = relationship.get(0);
            String B = relationship.get(1);
            saveUserFriends(user, A, B, friendSet);
        }
    }

    public static void saveUserFriends(String user, String A, String B, Set<String> friendSet) {
        if (A.equals(user)) {
            friendSet.add(B);
        }

        if (B.equals(user)) {
            friendSet.add(A);
        }
    }

    public static void exploreFriendsListForGivePoints(String user, List<List<String>> friends,
                                                       Set<String> friendSet, Map<String, Integer> recommendFriendMap) {
        for (List<String> relationship : friends) {
            String A = relationship.get(0);
            String B = relationship.get(1);
            givePointsToMutualFriend(user, A, B, friendSet, recommendFriendMap);
        }
    }

    public static void givePointsToMutualFriend(String user, String A, String B,
                                                Set<String> friendSet, Map<String, Integer> recommendFriendMap) {
        if (user.equals(A) || user.equals(B)) {
            return;
        }

        if (friendSet.contains(A) && !friendSet.contains(B)) {
            recommendFriendMap.put(A, recommendFriendMap.getOrDefault(A, 0) + MUTUAL_FRIEND_RECOMMEND_POINT);
        }

        if (friendSet.contains(B) && !friendSet.contains(A)) {
            recommendFriendMap.put(B, recommendFriendMap.getOrDefault(B, 0) + MUTUAL_FRIEND_RECOMMEND_POINT);
        }
    }

    public static void givePointsToVisitor(List<String> visitors, Map<String, Integer> recommendFriendMap) {
        for (String visitor : visitors) {
            recommendFriendMap.put(visitor, recommendFriendMap.getOrDefault(visitor, 0) + VISITOR_RECOMMEND_POINT);
        }
    }

    public static List<String> sortRecommendFriendBasedPoint(Map<String, Integer> recommendFriendMap) {
        List<String> rFMapKeySet = new ArrayList<>(recommendFriendMap.keySet());
        rFMapKeySet.sort((o1, o2)
                -> recommendFriendMap.get(o2).compareTo(recommendFriendMap.get(o1)));

        return rFMapKeySet;
    }

    public static void addRecommendFriend(List<String> answer, List<String> rFMapKeySet) {
        int index = 0;

        while (index < rFMapKeySet.size() && index <= MAX_NUMBER_OF_RECOMMEND_FRIEND) {
            answer.add(rFMapKeySet.get(index));
            index++;
        }
    }

    public static void sortAnswerList(List<String> answer) {
        Collections.sort(answer);
    }

    public static void verifyUserInputLength(String user) {
        if (user.length() < MIN_USER_LENGTH || user.length() > MAX_USER_LENGTH) {
            throw new LengthOutOfBoundsException(ErrorMessage.USER_LENGTH_OUT_OF_BOUNDS);
        }
    }

    public static void verifyFriendsListLength(List<List<String>> friends) {
        if (friends.size() < MIN_FRIENDS_LENGTH || friends.size() > MAX_FRIENDS_LENGTH) {
            throw new LengthOutOfBoundsException(ErrorMessage.FRIENDS_LENGTH_OUT_OF_BOUNDS);
        }
    }

    public static void verifyVisitorsListLength(List<String> friends) {
        if (friends.size() > MAX_VISITORS_LENGTH) {
            throw new LengthOutOfBoundsException(ErrorMessage.VISITORS_LENGTH_OUT_OF_BOUNDS);
        }
    }
}
