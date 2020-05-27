import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputData = sc.nextLine();
        String keyWord = sc.nextLine();
        String [] inputDataArray = inputData.split(" ");

        if (inputData.contains(keyWord)){
            int indexOdFirstOccurance = Arrays.asList(inputDataArray).indexOf(keyWord) +1;
            System.out.println(indexOdFirstOccurance);
        }
        else if(!inputData.contains(keyWord)){
            System.out.println("Not Found");
        }
        else System.out.println("Error");
    }

}
