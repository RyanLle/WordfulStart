import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Arrays;

public class Wordful {

    String [] allWords;
    String [] guesses;
    String [] results;
    Scanner user_input = new Scanner(System.in);
    int total_guesses = 0;
    String current_word;

    public void start() {
        setupVariables();    
    }

    public void setupVariables() {
        // this setups up variables
        allWords = loadWords();
        System.out.println(allWords.length);
        guesses = new String[6];
        results = new String[6];
        populateGuesses();
        current_word = getRandomWord();

        run();
        /*
        System.out.println(allWords[0]);
        System.out.println(allWords[allWords.length-1]);
        System.out.println("words loaded: " + allWords.length);

        int count = 0;
        for (String word : allWords) {
            System.out.println(count+1 + ": " + word);
            count ++;
        }
        */
    }

    public void run() {
    }

    public String getValidWord() {
       String guess;
        // asks user for a five letter word and checks if it's at least five
        // letters and a real five letter word (using while loop)
       return guess;
    }

    public String processWord(String word) {

        String newStr;
        // this method evaluates each letter in user guess and compares to
        // letters in word to show (*) if right letter in right place
        // +, letter in word, wrong place, and -, letter not found in word.)
        return newStr;
    }

    public boolean letterInWord(String str, char letter) {
        // this method returns if a letter is in a word
        return false;
    }

    public String formatWord(String str) {
        String newStr;
        // this method formats a str with spaces between each letter
        return newStr;
    }

    public String getRandomWord() {
        String word;
        // this method gets a random word from a list of words
        return word;
    }

    public void populateGuesses() {
        // this method initializes the guesses and results array with empty
        // values _ _ _ _ _ and empty strings
    }

    public void displayGameStatus() {
        // this method displays total guess and outputs the contents of the
        // guesses and results arrays
    }

    public String getNewGuess() {
        String word;
        // this method asks user for a five letter word and returns a guess
        return word;
    }

    public boolean isValidWord(String word) {
        // this method returns true or false if the word is a valid five letter
        // word in allWords list
        return false;
    }


    public String [] loadWords() {
        // this method loads all five letter words from file into array and
        // returns it
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
    
    public void winner() {
        // displays user wins game
        System.out.println("The word was " + current_word);
        System.out.println("Winner!");
        System.exit(0);
    }

    public void loser() {
        // displays user loses game
        System.out.println("The word was " + current_word);
        System.out.println("Loser!");
        System.exit(0);
    }
}
