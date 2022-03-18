package palindromeTest;

import com.ibm.academy.palindrome.Palindrome;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @ParameterizedTest
    @ValueSource(strings = {"civic", "racecar", "ana", "abba"})
    void isPalindromeTest(String word){
        assertTrue(Palindrome.isPalindrome(word));
    }

    @ParameterizedTest
    @ValueSource(strings = {"IBM", "JAVA", "Academy"})
    void isPalindromeFailTest(String word){
        //assertTrue(Palindrome.isPalindrome(word));
        assertFalse(Palindrome.isPalindrome(word));
    }
}
