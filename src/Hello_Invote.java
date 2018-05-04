import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Mark on 2018/1/3.
 */
public class Hello_Invote {
    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        String classPath = "FanShe";
        Class catClass = Class.forName(classPath);
        // 实例化这个类
        FanShe obj = (FanShe) catClass.newInstance();
        // 获得这个类的所有方法
        Method[] methods = catClass.getMethods();
        // 循环查找想要的方法
//        for(Method method : methods) {
//            if("Test".equals(method.getName())) {
//                // 调用这个方法，invoke第一个参数是类名，后面是方法需要的参数
//                method.invoke(obj, "Tom" );
//            }
//        }
        // 调用指定方法
        obj.shout();
//        catClass.getMethod("shout").invoke(obj, null);
    }
}