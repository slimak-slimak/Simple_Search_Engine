import java.io.File;
import java.io.IOException;
import java.util.*;

public class TextFileReader {

    private final String inputPath;

    public TextFileReader(String inputPath) {
        this.inputPath = inputPath;
    }

    List<String> getData() throws IOException {
        List<String> inputData = new ArrayList<>();
        File file = new File(inputPath);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                inputData.add(sc.nextLine());
            }
            sc.close();
            return inputData;

        } catch (IOException e) {

            System.out.println("Reading file error");
        } finally {
            //Files.delete(Path.of(inputPath));
        }
        return inputData;
    }


}

