package GroupTasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Day");
        stringList.add("Evening");
        stringList.add("Afternoon");
        stringList.add("Morning");

        List<String> filteredList = filterAndLowerCase(stringList);

        System.out.println("Filtered and lowercased strings: " + filteredList);
    }

    public static List<String> filterAndLowerCase(List<String> inputList) {
        List<String> result = new ArrayList<>();

        for (String str : inputList) {
            if (str.startsWith("A")) {
                result.add(str.toLowerCase());
            }
        }

        return result;
    }
}
