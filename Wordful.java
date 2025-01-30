import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Wordful {

    public void start() {
        setup();    
    }

    public void setup() {
        String [] allWords = loadWords();
        System.out.println(allWords[0]);
        System.out.println(allWords[allWords.length-1]);
        System.out.println("words loaded: " + allWords.length);

        int count = 0;
        for (String word : allWords) {
            System.out.println(count+1 + ": " + word);
            count ++;
        }
    }


    public String [] loadWords() {
        String filePath = "words.txt"; // Update with your actual file path
        String [] words = new String[2304];
        try {
            // Read the entire file content as a single string
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // Remove square brackets
            content = content.trim().replaceAll("^\\[|\\]$", "");

            // Split by comma and trim extra spaces and quotes
            words = Arrays.stream(content.split(","))
                                   .map(word -> word.trim().replaceAll("^\"|\"$", "")) // Remove quotes
                                   .toArray(String[]::new);

            // Print the loaded words
        } catch (IOException e) {
            e.printStackTrace();
        }

        return words;
    }
}
