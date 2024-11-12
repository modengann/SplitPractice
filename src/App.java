import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //countWords test
        //Finish the countWords method that will take in a sentence String and return
        //the number of words in that sentence.
        String test1Sentence = "Java split method practice";
        int wordCount = countWords(test1Sentence);
        System.out.println("Expected: 4, Got: " + wordCount);


        //firstWord test
        //Finish the firstWord method that will take in a sentence String and return
        //the first word
        String test2Sentence = "Learning Java is exciting";
        String first = firstWord(test2Sentence);
        System.out.println("Expected: Learning, Got: " + first);

        //reverseWords test
        //Finish the reverseWords method that will take in a sentence String and return
        //an array with the words reversed
        String test3Sentence = "Hello world from Java";
        String[] reversed = reverseWords(test3Sentence);
        System.out.println("Expected: [Java, from, world, Hello] Got " + Arrays.toString(reversed));

        //get domain test
        //Finish the extractDomain method that will take in an email address with the
        //format: email@network.edu. Return only the domain portion of the email
        String exampleEmail = "user@example.com";
        String domain = extractDomain(exampleEmail);
        System.out.println("Expected: example.com, Got: " + domain);
    }

    //Finish the countWords method that will take in a sentence String and return
    //the number of words in that sentence.
    public static int countWords(String sentence){
        return -1;
    }

    //Complete firstWord method that will take in a sentence String and return
    //the first word
    public static String firstWord(String sentence){
        return null;
    }

    //Finish the reverseWords method that will take in a sentence String and return
    //an array with the words reversed
    public static String[] reverseWords(String sentence){
        return null;

    }

    //Finish the extractDomain method that will take in an email address with the
    //format: email@network.edu. Return only the domain portion of the email    
    public static String extractDomain(String email){
        return null;
    }




}
