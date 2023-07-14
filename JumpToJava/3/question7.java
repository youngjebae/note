import java.util.ArrayList;
import java.util.Arrays;

public class question7 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(String.join(" ", myList));
        //System.out.println(myList.get(0) + " " ); 
    }
}