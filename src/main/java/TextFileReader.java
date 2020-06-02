import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFileReader {

    private final String inputPath;

    public TextFileReader(String inputPath) {
        this.inputPath = inputPath;
    }

    List<String> getData() {
        List<String> inputData = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(inputPath));
            while (sc.hasNextLine()) {
                inputData.add(sc.nextLine());
            }
            sc.close();
            return inputData;

        } catch (IOException e) {
            System.out.println("Reading file error");
        }
        return inputData;
    }
}
