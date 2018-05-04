import java.util.HashMap;
import java.util.Map;

public class Employee{
     public static Map<String, ExtraProcessor> configMap = new HashMap<>();

     public void reload() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
         configMap.put("GKprocessor", (ExtraProcessor) Class.forName("GKprocessor").newInstance());
     }
}