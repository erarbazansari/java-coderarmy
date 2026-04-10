import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

class Demo {
    public static void main(String[] args) {
        // List<Integer> c = new ArrayList<>();

        Collection<Integer> c = new TreeSet<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);

        Iterator<Integer> itr = c.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}