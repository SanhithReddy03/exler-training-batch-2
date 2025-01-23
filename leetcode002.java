public class leetcode002 {
    public int myAtoi(String s) {
        int MAX_INT = Integer.MAX_VALUE;
        int MIN_INT = Integer.MIN_VALUE;

        int i = 0, n = s.length();

        // Discard all leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Check if the string is empty after discarding whitespaces
        if (i == n) return 0;

        // Check the sign of the number
        int sign = 1;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert the digits to an integer
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow or underflow
            if (result > (MAX_INT - digit) / 10) {
                return (sign == 1) ? MAX_INT : MIN_INT;
            }

            result = result * 10 + digit;
            i++;
        }

        // Apply the sign and return the result
        return result * sign;
    }
}

