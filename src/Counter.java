class Counter implements Runnable {
    private int count;

    public Counter() {
        count = 0;
    }

    public synchronized void run() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}