import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public boolean isTraditionalChineseCharacter(char c) {
        Character.UnicodeBlock block = Character.UnicodeBlock.of(c);
        if(!Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS.equals(block) &&
                !Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS.equals(block) &&
                !Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A.equals(block))
        {
            return false;
        }
        try {
            String s = ""+c;
            return s.equals(new String(s.getBytes("MS950"), "MS950"));
        } catch (java.io.UnsupportedEncodingException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String a = "習近平";
        char[] arr = a.toCharArray();
        Regex regex = new Regex();
        for(char c : arr){
            Boolean b = regex.isTraditionalChineseCharacter(c);
            System.out.print(b);
        }

    }
}
