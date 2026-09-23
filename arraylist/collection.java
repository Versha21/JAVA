import java.util.ArrayList;
import java.util.Collections;

public class collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(3);
        System.out.println(list);
        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
