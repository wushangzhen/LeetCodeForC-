class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int max = 1;
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(j) == s.charAt(i) && (i - j < 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                    if (i - j + 1 > max) {
                        max = i - j + 1;
                        start = j;
                    }
                }
            }
        }
        return s.substring(start, start + max);
    }
}
