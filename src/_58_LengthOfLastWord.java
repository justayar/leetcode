public class _58_LengthOfLastWord {
    /**
     * Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.
     *
     * A word is a maximal substring consisting of non-space characters only.
     *
     * Example 1:
     *
     * Input: s = "Hello World"
     * Output: 5
     * Example 2:
     *
     * Input: s = " "
     * Output: 0
     *
     *
     * Constraints:
     *
     * 1 <= s.length <= 104
     * s consists of only English letters and spaces ' '.
     *
     */
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words.length == 0 ? 0 : words[words.length-1].length();
    }
}
