import java.util.List;

public class PrintingMechanism {
    void print(List<String> listOfPeople) {
        System.out.println("=== List of people ===");
        for (String person : listOfPeople) {
            System.out.println(person);
        }

    }
}
