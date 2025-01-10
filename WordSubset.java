import java.util.*;
public class WordSubset {
        public static void main(String[] args) {

            String words1 [] = {"amazon","apple","facebook","google","leetcode"};
            String words2[] ={"e","o"};
            List<String> result = wordSubsets(words1, words2);
            System.out.println(result);
        }



    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> universalWords = new ArrayList<>();max

        // Step 1: Calculate the maximum frequency for each character in words2
        int[] maxFreq = new int[26];
        for (String word : words2) {
            int[] freq = countCharFrequency(word);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }

        // Step 2: Check each word in words1 against the maxFreq
        for (String word : words1) {
            int[] wordFreq = countCharFrequency(word);
            if (isUniversal(wordFreq, maxFreq)) {
                universalWords.add(word);
            }
        }

        return universalWords;
    }

    // Helper method to count character frequency
    private static int[] countCharFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    // Helper method to check if a word satisfies the universal condition
    private  static boolean isUniversal(int[] wordFreq, int[] maxFreq) {
        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < maxFreq[i]) {
                return false;
            }
        }
        return true;
    }
}

