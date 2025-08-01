/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        
        char[][] charArrays = new char[strs.length][];

        int prefixLength = 0;

        int charArrayIteratorIndex = 1;

        boolean isCommon = true;

        for (int i = 0; i < strs.length; i++) {
            charArrays[i] = strs[i].toCharArray();
        }

        if (strs.length > 1) {
            for (int j = 0; j < charArrays[0].length; j++) {
                for (int i = 1; i < charArrays.length; i++) {
                    if (charArrays[i][j] != charArrays[0][j]) {
                       isCommon = false;
                       break;
                    }

                    charArrayIteratorIndex++;

                    if (charArrayIteratorIndex == charArrays.length) {
                        prefixLength++;
                        charArrayIteratorIndex = 1;
                    }
                }
                if (!isCommon) {
                    break;
                }
            }

            String prefix = new String(charArrays[0], 0, prefixLength);
            return prefix;

        } else {

            return strs[0];
            
        }
    }
}