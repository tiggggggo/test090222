import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String s1 = "test String";
        System.out.println(s1);

        List<String> list = new ArrayList<>();
        list.add("text1");
        list.add("text1.5");
        list.add("text2");
        list.add("text2.5");
        list.add("text3");
        for (String string : list) {
            System.out.println(string);
        }

    }

}
