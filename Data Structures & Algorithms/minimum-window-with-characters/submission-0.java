class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        int[] target = new int[128];
        int[] window = new int[128];

        int required = 0;

        for (char c : t.toCharArray()) {
            if (target[c] == 0) {
                required++;
            }

            target[c]++;
        }

        int formed = 0;
        int left = 0;

        int bestStart = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);

            window[curr]++;

            if (target[curr] > 0 && window[curr] == target[curr]) {
                formed++;
            }

            while (formed == required) {
                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                    bestStart = left;
                }

                char leftChar = s.charAt(left);
                window[leftChar]--;

                if (target[leftChar] > 0 &&
                    window[leftChar] < target[leftChar]) {
                    formed--;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(bestStart, bestStart + minLength);
    }
}