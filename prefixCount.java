public class prefixCount {
    // today we are going to solve the another leetcode problem which given in daily
    // streak
    // Example 1:

    // Input: words = ["pay","attention","practice","attend"], pref = "at"
    // Output: 2
    // Explanation: The 2 strings that contain "at" as a prefix are: "attention" and
    // "attend".
    public static void main(String[] args) {

        String[] words = { "pays", "attention", "practice", "attend" };
        String pref = "at";

        System.out.println(PrefixCount(words, pref));
    }

    // this is the funtion returns how words are there in the words arrays that that starts with given prefix , so it return prefix words count that matches the prefix
    private static int PrefixCount(String[] words, String pref) {

        int count = 0;
        for (String str : words) {
            if (str.length() > pref.length() && str.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
