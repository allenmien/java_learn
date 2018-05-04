import java.util.ArrayList;
import java.util.List;

public class RollDice {
    //ThreadLocal封装静态变量
    public static ThreadLocal<List<Object>> threadRollList = new ThreadLocal<List<Object>>() {
        //这里加同步是因为ThreadRollList是静态全局变量，防止ThreadLocal本身被并发。
        @Override
        protected synchronized List<Object> initialValue() {
            return new ArrayList<Object>(0);
        }
    };
    //用此种方式定义全局变量，遭遇多线程并发时，会出现bug.
    public static List<Object> rollList = new ArrayList<Object>(0);
    //私有全局变量
    public ThreadLocal<List<Object>> priTreadRollList = new ThreadLocal<List<Object>>() {
        //因为是私有变量，ThreadLocal本身会被放进线程，所以不用担心并发，因此也不需要synchronized。
        @Override
        protected List<Object> initialValue() {
            return new ArrayList<Object>(0);
        }
    };

    //调用方式
    public static void main(String[] args) {
        //ThreadLocal调用方式
        threadRollList.get().add(new Object());
        //普通定义调用方式
        rollList.add(new Object());
    }
}
