import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Demo {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();

        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        System.out.println(c);

        c.addAll(List.of(50, 49, 48));
        System.out.println(c);

        // list iterator
        ListIterator<Integer> it = c.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        List<Integer> ll = List.of(10, 20, 30); // unmodifiable list
        System.out.println(ll);
    }
}