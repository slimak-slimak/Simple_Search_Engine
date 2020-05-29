import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int numberOfLines = sc.nextInt();
        System.out.println("Enter all people:");
        sc.nextLine();
        String[] people = new String[numberOfLines];
        for (int i = 0; i < people.length; i++) {
            people[i] = sc.nextLine();
        }
        System.out.println("Enter the number of search queries:");
        int numberOfSearchQueries = sc.nextInt();


        for (int j = 0; j <numberOfSearchQueries ; j++) {
            System.out.println("Enter data to search people:");
            String keyWorld = sc.next();
            List<Integer> indexes = new ArrayList<>();
            for (int k = 0; k < people.length ; k++) {
                if (people[k].toLowerCase().contains(keyWorld.toLowerCase())){
                    indexes.add(k);
                }
            }

            if (!indexes.isEmpty()){
                System.out.println("Found people:");
                for (int x: indexes) {
                    System.out.println(people[x]);
                }
            }
            else {
                System.out.println("No matching people found.");
            }
        }
    }
}