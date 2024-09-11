public class Task2 {
    public static void main(String[] args) {
        String input = "Hello World! 123";

        int alphaCount = countAlphaCharacters(input);

        System.out.println("Number of alphabetic characters: " + alphaCount);
    }

    public static int countAlphaCharacters(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        }

        return count;

    }
}
