public class Test {
    public static void main(String[] args) throws Exception {
        //Ingeter是Number的一个子类
        Generic<Integer> gInteger = new Generic<Integer>(123);
        Generic<Number> gNumber = new Generic<Number>(456);
        showKeyValue1(gInteger);

    }

    public static void showKeyValue1(Generic<?> obj){
        System.out.println("泛型测试");
        System.out.println(obj.getKey());
    }
}