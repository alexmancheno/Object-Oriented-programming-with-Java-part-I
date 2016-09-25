
public class StringUtils {
    
    public static boolean included (String word, String searched) {
        if (word.toUpperCase().equals(searched.toUpperCase().trim()))
            return true;
        else
            return false;
    }
}
