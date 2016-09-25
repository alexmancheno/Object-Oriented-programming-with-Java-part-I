
public class StringUtils {
    
    public static boolean included (String word, String searched) {
        return word.toUpperCase().contains(searched.trim().toUpperCase());
    }
}
