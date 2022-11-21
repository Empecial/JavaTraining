
import java.util.regex.Pattern;

public class regexTest {
    public static void main(String[] args) {
        
        String singleLetterCheck = "\\w";
        String multiLetterCheck = "\\w+";

        if(Pattern.matches(singleLetterCheck, "n")){

            System.out.println("input string has only 1 letter");

        } if(Pattern.matches(multiLetterCheck, "nice")){

            System.out.println("input string has more than 1 letter");

        } if(singleLetterCheck.equals("\\w")){

            System.out.println("test3");
        }
    }
}