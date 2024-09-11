import java.util.HashMap;
import java.util.Map;

public class Task9 {
    public static void main(String[] args) {

        String input = "abracadabra";
        try {
            char result = findFirstNonRepeatingCharacter(input);
            System.out.println("The first non-repeating character is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static char findFirstNonRepeatingCharacter(String str) {

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }

        return '\0';
    }
}
