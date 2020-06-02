import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchMechanism {
    void search(List<String> listOfPeople){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name or email to search all suitable people:");
        String keyWorld = sc.next();
        List<Integer> indexes = new ArrayList<>();
        for (int k = 0; k < listOfPeople.size(); k++) {
            if (listOfPeople.get(k).toLowerCase().contains(keyWorld.toLowerCase())) {
                indexes.add(k);
            }
        }

        if (!indexes.isEmpty()) {
            System.out.println("Found people:");
            for (int x : indexes) {
                System.out.println(listOfPeople.get(x));
            }
        } else {
            System.out.println("No matching people found.");
        }

    }
}
