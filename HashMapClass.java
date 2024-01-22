import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String,String> CapitalNames = new HashMap<String,String>();
        CapitalNames.put("Pakistan","Islamabad");
        CapitalNames.put("Bangladesh","Dhaka");
        CapitalNames.put("England", "London");
        CapitalNames.put("Germany", "Berlin");
        CapitalNames.put("Norway", "Oslo");
        CapitalNames.put("USA", "Washington DC");
        System.out.println(CapitalNames);

    }
}
