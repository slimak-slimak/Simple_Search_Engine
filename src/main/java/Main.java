import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        AplicationArguments aplicationArguments = new AplicationArguments(args);
        TextFileReader textFileReader = new TextFileReader(aplicationArguments.fileName);
        run(textFileReader.getData());
    }

    private static void run(List<String> listOfPeople) {

        System.out.println("=== Menu ===");
        System.out.println("1. Find a person");
        System.out.println("2. Print all people");
        System.out.println("0. Exit");

        Scanner sc = new Scanner(System.in);
        String command = sc.next();
        SearchMechanism searchMechanism = new SearchMechanism();
        PrintingMechanism printingMechanism = new PrintingMechanism();


        switch (command) {
            case "1":
                searchMechanism.search(printingMechanism.invertedIndex(listOfPeople), listOfPeople);
                run(listOfPeople);
                break;
            case "2":
                printingMechanism.print(listOfPeople);
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

}