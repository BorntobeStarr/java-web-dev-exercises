package excercises;
 import java.util.Locale;
 import java.util.Scanner;
public class StringsChapterTwo {
   public static void main(String[] args) {
        String aliceFirstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it," +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
          System.out.println(aliceFirstSentence);

          Scanner input = new Scanner(System.in);
          System.out.println("Lets try searching for the index of the word Alice in the first sentence...");
          System.out.println(" Type the word to search: ");
          String userSearch = input.nextLine().toLowerCase(Locale.ROOT);
          Integer indexOfSearch = aliceFirstSentence.indexOf(userSearch);
          System.out.println("Your word was found at index " + indexOfSearch + "! Thanks for searching!");

//       System.out.println(userSearch);

    }
}
