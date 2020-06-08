import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SearchMechanism {
    void search(Map<String, List<Integer>> invertedIndex, List<String> listOfPeople) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name or email to search all suitable people:");
        String keyWorld = sc.next();

        if (invertedIndex.containsKey(keyWorld)) {
            System.out.println("Found people:");
            for (int i = 0; i < invertedIndex.get(keyWorld).size(); i++) {
                System.out.println(listOfPeople.get(invertedIndex.get(keyWorld).get(i)));
            }

        } else {
            System.out.println("No matching people found.");
        }

    }
}
