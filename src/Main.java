import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String s1 = "test String";
        System.out.println(s1);

        List<String> list = new ArrayList<>();
        list.add("text1");
        list.add("text1.1");
        list.add("text1.2");
        list.add("text1.3");
        for (String string : list) {
            System.out.println(string);
        }
        list.add("text1.5");

    }

}
