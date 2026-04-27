import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.next();

        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        in.close();
    }
}