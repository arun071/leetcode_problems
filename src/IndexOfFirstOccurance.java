public class IndexOfFirstOccurance{
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int hayPointer = 0;
        int needlePointer = 0;
        while (hayPointer < haystack.length()) {
            if (haystack.charAt(hayPointer) == needle.charAt(needlePointer)) {
                hayPointer++;
                needlePointer++;
                if (needlePointer == needle.length()) {
                    return hayPointer - needlePointer;
                }
            } else {
                hayPointer = hayPointer - needlePointer + 1;
                needlePointer = 0;
            }
        }
        return -1;
    }
}


//28. Find the Index of the First Occurrence in a String
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//Example 1:
//
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
//Example 2:
//
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.
//
//
//Constraints:
//
//        1 <= haystack.length, needle.length <= 104
//haystack and needle consist of only lowercase English characters.
