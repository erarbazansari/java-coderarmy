import java.util.*;

class Demo {
    public static void main(String[] args) {
        Collection<Integer> c = new LinkedList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        c.add(60);

        System.out.println("size is: " + c.size());
        System.out.println("is empty: " + c.isEmpty());
        System.out.println("is 30 contains: " + c.contains(30));

        // object toArray => any collection -> converted -> toArray object
        Object[] obj = c.toArray();
        for (Object object : obj) {
            System.out.println(object);
        }

        System.out.println(c.remove(10));

        Iterator<Integer> itr = c.iterator();
        System.out.println("printing after 10 value delete");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(c.containsAll(List.of(20, 30, 40)));
        System.out.println(c.removeAll(List.of(50)));

        Iterator<Integer> itr2 = c.iterator();
        while (itr2.hasNext()) {
            System.out.print(itr2.next() + " ");
        }
    }

}