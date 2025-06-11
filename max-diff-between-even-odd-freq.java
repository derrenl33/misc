/*

You are given a string s consisting of lowercase English letters.

Your task is to find the maximum difference diff = freq(a1) - freq(a2) between the frequency of characters a1 and a2 in the string such that:

a1 has an odd frequency in the string.
a2 has an even frequency in the string.
Return this maximum difference.

*/

class Solution {
    public int maxDifference(String s) {
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : charArray) {
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            if (!map.containsKey(ch)){
                map.put(ch, 1);
            }
        }
        int maxOdd = Collections.min(map.values());
        int minEven = Collections.max(map.values());
        for (int num : map.values()) {
            if (num % 2 != 0 && num > maxOdd) {
                maxOdd = num;
            }
            if (num % 2 == 0 && num < minEven) {
                minEven = num;
            }
        }
        return maxOdd - minEven;
    }
}