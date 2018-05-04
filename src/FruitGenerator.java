import java.util.Random;

/**
 * Created by Mark on 2018/3/6.
 */
public class FruitGenerator implements Generator<String>{
    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }
}