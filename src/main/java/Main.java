import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        run(peopleInput());
    }

    private static void run(String[] listOfPeople){

        System.out.println("=== Menu ===");
        System.out.println("1. Find a person");
        System.out.println("2. Print all people");
        System.out.println("0. Exit");
        Scanner sc = new Scanner(System.in);
        String command = sc.next();

        switch (command){
            case "1":
                search(listOfPeople);
                run(listOfPeople);
                break;
            case "2":
                print(listOfPeople);
                run(listOfPeople);
                break;
            case "0":
                System.out.println("Bye!");
                break;
            default:
                System.out.println("Incorrect option! Try again.");
                run(listOfPeople);
        }
    }

    private static String[] peopleInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int numberOfLines = sc.nextInt();
        System.out.println("Enter all people:");
        sc.nextLine();
        String[] people = new String[numberOfLines];
        for (int i = 0; i < people.length; i++) {
            people[i] = sc.nextLine();
        }
        return people;
    }

    private static void search(String[] listOfPeople){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name or email to search all suitable people:");
        String keyWorld = sc.next();
        List<Integer> indexes = new ArrayList<>();
        for (int k = 0; k < listOfPeople.length; k++) {
            if (listOfPeople[k].toLowerCase().contains(keyWorld.toLowerCase())) {
                indexes.add(k);
            }
        }

        if (!indexes.isEmpty()) {
            System.out.println("Found people:");
            for (int x : indexes) {
                System.out.println(listOfPeople[x]);
            }
        } else {
            System.out.println("No matching people found.");
        }

    }

    public static void print(String[] listOfPeople){
        System.out.println("=== List of people ===");
        for (String person: listOfPeople) {
            System.out.println(person);
        }

    }
}
