import java.util.regex.Pattern;

public class regexTest {
    public static void main(String[] args) {
        
        String singleLetterCheck = "\\w";
        String multiLetterCheck = "\\w+";

        if(Pattern.matches(singleLetterCheck, "n")){
            System.out.println("input string has only 1 letter");
        } else if(Pattern.matches("\\w+", "nice")){
            System.out.println("input string has more than 1 letter");
        }
    }
}