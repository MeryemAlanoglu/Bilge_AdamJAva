package week04.collection.list.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {
    public static void main(String[] args) {
        List<String> nameList= Arrays.asList("Java,C#,Python");

        nameList.replaceAll(String::toUpperCase); //yeniden yapılandırma.
        System.out.println(nameList);

        for (String name:nameList) {
            nameList.set(nameList.indexOf(name), name.toUpperCase());
        }
        System.out.println(nameList);

    }
}
