/**
 * Created by Mark on 2018/1/4.
 */
public class Hello_Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Employee employee = new Employee();
        employee.reload();
        for (int i = 1; i <= 50; i++) {
            new Thread(new HelloInstance(), "Thread=" + 1).start();
        }
    }
}