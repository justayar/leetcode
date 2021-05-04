public class _14_LongestCommonPrefix {
    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     *
     * If there is no common prefix, return an empty string "".
     *
     * Example 1:
     *
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * Example 2:
     *
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     *
     */
    public String longestCommonPrefix(String[] strs) {
        int i=0;
        StringBuilder prefix = new StringBuilder();

        if(strs.length == 1)
            return strs[0];

        while(i < strs[0].length()){
            for(int j=1;j<strs.length;j++){
                if(strs[j].length() <= i  || (strs[0].charAt(i) != strs[j].charAt(i)))
                    return prefix.toString();
            }
            prefix.append(strs[0].charAt(i));
            i++;
        }
        return prefix.toString();
    }
}
