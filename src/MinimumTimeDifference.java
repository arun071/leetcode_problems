import java.util.*;

public class MinimumTimeDifference {
    public static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();

        for (String str : s1.split(" ")) {
            map.put(str, map.getOrDefault(str, 1) + 1);
        }
        for (String str : s2.split(" ")) {
            map.put(str, map.getOrDefault(str, 1) + 1);
        }

        map.forEach((key, value) -> {
            if (value == 1) {
                ans.add(key);
            }
        });
        int size = ans.size();
        String[] arr = new String[size];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }

    public static int findMinDifference(List<String> timePoints) {
        List<Integer> minuteList = new ArrayList<>();
        int size = timePoints.size();
        for (int i = 0; i < size; i++) {
            String str = timePoints.get(i);
            String[] arr = str.split(":");
            int hours = Integer.parseInt(arr[0]);
            int minutes = Integer.parseInt(arr[1]);
            int totalMinutes = (hours * 60) + minutes;
            minuteList.add(totalMinutes);
        }


        Collections.sort(minuteList);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < size; i++) {
            int currDiff = minuteList.get(i) - minuteList.get(i - 1);
            minDiff = Math.min(minDiff, currDiff);
        }
        int roundDiff = (1440 - minuteList.get(minuteList.size() - 1)) + minuteList.get(0);
        minDiff = Math.min(roundDiff, minDiff);
        return minDiff;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("abc nvc", "ada andx")));
    }
}


//539. Minimum Time Difference
//Given a list of 24-hour clock time points in "HH:MM" format, return the minimum minutes difference between any two time-points in the list.
//
//
//Example 1:
//
//Input: timePoints = ["23:59","00:00"]
//Output: 1
//Example 2:
//
//Input: timePoints = ["00:00","23:59","00:00"]
//Output: 0
//
//
//Constraints:
//
//        2 <= timePoints.length <= 2 * 104
//timePoints[i] is in the format "HH:MM".
