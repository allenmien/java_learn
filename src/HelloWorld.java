import java.util.concurrent.*;

/**
 * @author Mark
 */
public class HelloWorld {
    private int putThreadSize = 5;
    private int getThreadSize = 5;
    private LinkedBlockingQueue<ListRequest> listQueue = new LinkedBlockingQueue<>(putThreadSize + getThreadSize + 5);

    public void start() {
        ExecutorService threadPool = Executors.newFixedThreadPool(putThreadSize + getThreadSize);
        for (int i = 0; i < putThreadSize; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    put();
                }
            });
        }

        for (int i = 0; i < getThreadSize; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    get();
                }
            });
        }


    }


    private void get() {
        while (true) {
            ListRequest message = listQueue.poll();
            if (message != null) {
                System.out.print(message.getParam1());
                System.out.print(message.getParam2());
            }
        }
    }

    private void put() {
        while (true) {
            ListRequest listRequest = new ListRequest();
            listRequest.setParam1("1");
            listRequest.setParam2("2");
            listQueue.offer(listRequest);
        }
    }
}