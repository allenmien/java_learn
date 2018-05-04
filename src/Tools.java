import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Random;

/**
 * Created by Mark on 2017/11/29.
 */
public class Tools {
    private static final Random r = new Random(new Date().getTime());
    private static final int[] randomSeedCharacters = new int[26 + 26];
    /**
     * 随机字符串
     *
     * @param length 需要生成的字符串长度
     * @return 随机生成的字符串
     * @throws NoSuchAlgorithmException 异常
     */
    public static String randomCharacters(int length) throws NoSuchAlgorithmException {
        StringBuffer sb = new StringBuffer();
        while (sb.length() < length) {
            int random = r.nextInt(26 + 26);
            int charInt = randomSeedCharacters[random];
            char charVal = (char) charInt;
            sb.append(charVal);
        }
        return sb.toString();
    }
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String a = randomCharacters(30);
        System.out.println("haha");
    }

}