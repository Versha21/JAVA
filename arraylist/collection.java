import java.util.ArrayList;
import java.util.Collections;

public class collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();

        list.add(1);
        list.add(5);
        list.add(3);

        l2.add(12);
        l2.add(95);
        l2.add(45);
        l2.add(33);

        list.addAll(l2);
        System.out.println(list);

        //sorting
        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.contains(9));
        System.out.println(list.contains(95));

        System.out.println(list.indexOf(33));
        System.out.println(list.indexOf(9));

    }
}
