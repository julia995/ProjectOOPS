public class Task4 {
    public static void main(String[] args) {
        String input = "madam";
        checkPalindrome(input);

    }

    public static void checkPalindrome(String originalStr) {

        StringBuilder sb = new StringBuilder(originalStr);
        String reversedStr = sb.reverse().toString();
        if (originalStr.equals(reversedStr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
