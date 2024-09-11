import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Banana");
        list.add("Banana");
        list.add("Peach");
        list.add("Apple");


        LinkedHashSet<String> duplicate=new LinkedHashSet<>(list);
        System.out.println(duplicate);


    }
}
