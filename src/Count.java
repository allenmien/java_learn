public class Count {
    private Integer countNum = 0;

    public void count() {
        for (int i = 1; i <= 10; i++) {
            countNum = countNum + i;
        }
        System.out.println(Thread.currentThread().getName() + "-" + countNum);
    }
}