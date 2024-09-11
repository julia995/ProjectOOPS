public class Task7 {
    public static void main(String[] args) {
        String input = "Hello, world!";
        int wordCount = countWords(input);
        System.out.println(wordCount);
    }

    public static int countWords(String str) {
        // Regular expression to match non-word characters
        String[] words = str.split("\\W+");

        // Filter out any empty strings that might result from splitting
        int wordCount = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }

        return wordCount;
    }
}
