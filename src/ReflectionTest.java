import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String args[]) throws Exception{
        Class clazz = Class.forName("Person");

        //1.获取方法
        //  1.1 获取取clazz对应类中的所有方法--方法数组（一）
        //     不能获取private方法,且获取从父类继承来的所有方法
        System.out.println("--------------getMethods--------------");
        Method[] methods = clazz.getMethods();
        for(Method method:methods){
            System.out.println(" "+method.getName());
        }
        System.out.println();

        //  1.2.获取所有方法，包括私有方法 --方法数组（二）
        //  所有声明的方法，都可以获取到，且只获取当前类的方法
        System.out.println("--------------getDeclaredMethods--------------");
        methods = clazz.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(" "+method.getName());
        }
        System.out.println();

        //  1.3.获取指定的方法
        //  需要参数名称和参数列表，无参则不需要写
        //  对于方法public void setName(String name) {  }
        Method method = clazz.getDeclaredMethod("setName", String.class);
        System.out.println(method);
        //  而对于方法public void setAge(int age) {  }
        method = clazz.getDeclaredMethod("setAge", Integer.class);
        System.out.println(method);
        //  这样写是获取不到的，如果方法的参数类型是int型
        //  如果方法用于反射，那么要么int类型写成Integer： public void setAge(Integer age) {  }

        //2.执行方法
        //  invoke第一个参数表示执行哪个对象的方法，剩下的参数是执行方法时需要传入的参数
        System.out.println("--------------invoke--------------");
        Object obje = clazz.newInstance();
        System.out.println("setAge : 2" );
        method.invoke(obje,2);
        Method getAgeMethod = clazz.getDeclaredMethod("getAge");
        int age = (int) getAgeMethod.invoke(obje);
        System.out.println("getAge : " + String.valueOf(age));
    }
}
