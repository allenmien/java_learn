/**
 * Created by Mark on 2017/9/9.
 */
public class threadSleep {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}