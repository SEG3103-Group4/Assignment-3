public class CoverageAnalyzer {
    /**
     * Classifies a number as "Positive", "Negative", or "Zero".
     *
     * @param number The integer to classify.
     * @return A string classification.
     */
    public String classifyNumber(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    /**
     * Checks if a given string is a palindrome.
     * This method contains a conditional and a loop to test more complex coverage scenarios.
     *
     * @param input The string to check.
     * @return true if the string is a palindrome, false otherwise. Returns false for null input.
     */
    public boolean isPalindrome(String input) {
        // Branch 1: Check for null or empty input
        if (input == null || input.isEmpty()) {
            return false;
        }
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleanedInput.length() - 1;
        while (left < right) {
            // Branch 2: The main comparison logic inside the loop
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Determines a discount percentage based on customer type and purchase amount.
     *
     * @param isPremiumCustomer true if the customer is a premium member.
     * @param purchaseAmount    the total amount of the purchase.
     * @return The discount percentage.
     */
    public int getDiscount(boolean isPremiumCustomer, double purchaseAmount) {
        int discount = 0;
        // Branch 1: Check for premium customer
        if (isPremiumCustomer) {
            discount = 10;
            // Branch 2: Nested branch for high-value premium customers
            if (purchaseAmount > 1000) {
                discount += 5; // Extra 5% for large purchases
            }
        } else {
            // Branch 3: Standard discount for non-premium customers
            if (purchaseAmount > 500) {
                discount = 5;
            }
        }
        return discount;
    }
}
