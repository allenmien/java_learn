/**
 * Created by Mark on 2018/1/4.
 */
public class Hello_variable{
    private String a = "a";
    private String b = "b";

    public void getA(String param){
        getB(param);
    }

    private void getB(String param) {
        getC(param);
    }

    private void getC(String param) {
        System.out.print(a);
        System.out.print(param);

    }

}
