import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap();
        map.put("hello","world");
        String value = map.get("hello");
        System.out.println(value);
    }
}
