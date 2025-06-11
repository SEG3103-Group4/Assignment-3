import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoverageAnalyzerTest {

    private CoverageAnalyzer analyzer;

    @BeforeEach
    void setUp() {
        // This method runs before each test, ensuring a fresh instance.
        analyzer = new CoverageAnalyzer();
    }

    @Nested
    @DisplayName("Tests for classifyNumber()")
    class ClassifyNumberTests {

        @Test
        @DisplayName("Test with a positive number")
        void testPositiveNumber() {
            assertEquals("Positive", analyzer.classifyNumber(50), "50 should be classified as Positive");
        }

        @Test
        @DisplayName("Test with a negative number")
        void testNegativeNumber() {
            assertEquals("Negative", analyzer.classifyNumber(-50), "-50 should be classified as Negative");
        }

        @Test
        @DisplayName("Test with zero")
        void testZero() {
            assertEquals("Zero", analyzer.classifyNumber(0), "0 should be classified as Zero");
        }
    }

    @Nested
    @DisplayName("Tests for isPalindrome()")
    class IsPalindromeTests {

        @Test
        @DisplayName("Test with a true palindrome")
        void testTruePalindrome() {
            assertTrue(analyzer.isPalindrome("level"), "'level' is a palindrome");
        }

        @Test
        @DisplayName("Test with a non-palindrome string")
        void testFalsePalindrome() {
            assertFalse(analyzer.isPalindrome("java"), "'java' is not a palindrome");
        }

        @Test
        @DisplayName("Test with an empty string input")
        void testEmptyStringPalindrome() {
            assertFalse(analyzer.isPalindrome(""), "Empty string should not be considered a palindrome");
        }
    }

    @Nested
    @DisplayName("Tests for getDiscount()")
    class GetDiscountTests {

        @Test
        @DisplayName("Premium customer with a high purchase amount")
        void testPremiumHighPurchase() {
            assertEquals(15, analyzer.getDiscount(true, 1500), "Premium customer with purchase > 1000 should get 15% discount");
        }

        @Test
        @DisplayName("Standard customer with a high purchase amount")
        void testStandardHighPurchase() {
            assertEquals(5, analyzer.getDiscount(false, 600), "Standard customer with purchase > 500 should get 5% discount");
        }

        @Test
        @DisplayName("Standard customer with a low purchase amount")
        void testStandardLowPurchase() {
            assertEquals(0, analyzer.getDiscount(false, 400), "Standard customer with purchase < 500 should get 0% discount");
        }
    }
}