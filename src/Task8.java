import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Task8 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Alex", "John", "Anna", "Mike");

        List<String> result = new ArrayList<>();

        for (String s: strings){
            if(s.startsWith("A")) {
                result.add(s.toLowerCase());
            }
        }

        System.out.println(result);
    }
}
