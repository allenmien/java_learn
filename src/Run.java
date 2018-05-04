class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
            count = count + (i + 1);
//            Thread.yield();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - beginTime) + " 毫秒！");
    }
}

public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}