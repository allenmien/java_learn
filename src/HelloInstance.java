/**
 * Created by Mark on 2018/1/5.
 */
public class HelloInstance implements Runnable {

    @Override
    public void run() {
        ExtraProcessor GKprocessor = Employee.configMap.get("GKprocessor");
        int num = 3;
        System.out.println("当前线程是：" + Thread.currentThread().getName() + ",num的值是：" + String.valueOf(GKprocessor.getProcessor(num)));
        num = 5;
        System.out.println("当前线程是：" + Thread.currentThread().getName() + ",num的值是：" + String.valueOf(GKprocessor.getProcessor(num)));
    }
}