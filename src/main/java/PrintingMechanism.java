import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintingMechanism {
    void print(List<String> listOfPeople) {
        System.out.println("=== List of people ===");
        for (String person : listOfPeople) {
            System.out.println(person);
        }
    }

    public Map<String, List<Integer>> invertedIndex(List<String> listOfPeople) {
        Map<String, List<Integer>> result = new HashMap<>();

        for (int i = 0; i < listOfPeople.size(); i++) {
            String[] array = listOfPeople.get(i).split(" ");
            for (int j = 0; j < array.length; j++) {
                if (result.containsKey(array[j])) {
                    result.get(array[j]).add(i);
                } else {
                    List<Integer> index = new ArrayList<>();
                    index.add(i);
                    result.put(array[j], index);
                }

            }
        }
        return result;
    }
}
