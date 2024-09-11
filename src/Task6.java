public class Task6 {
    public static void main(String[] args) {
        String input = "documentation";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String str) {

        String vowels = "aeiou";
        int count = 0;

        str = str.toLowerCase();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }
}
