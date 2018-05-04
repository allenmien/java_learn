import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by Mark on 2018/1/3.
 */
public class Hello_List {
    public static void main(String args[]) {
        List<Item> arrList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Item item = new Item();
            item.url = "hhh";
            arrList.add(item);
        }
        removeDuplicate(arrList);
        System.out.print(arrList.size());
    }

    public static void removeDuplicate(List list) {
        Set set = new HashSet();
        List newList = new ArrayList();
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            Item element = (Item) iter.next();
            String url = element.url;
            if (set.add(url)) {
                newList.add(element);
            }
        }
        list.clear();
        list.addAll(newList);
    }
}