import java.util.Iterator;

class Demo {
    public static void main(String[] args) {
        String[] names = { "arbaz", "ansari", "vivke" };
        NameContainer c = new NameContainer(names);

        Iterator<String> it = c.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class NameContainer implements Iterable<String> {
    private String[] names;
    private int size;

    NameContainer(String[] names) {
        this.names = names;
        this.size = this.names.length;
    }

    @Override
    public Iterator<String> iterator() {
        return new NameContainerIterable();
    }

    private class NameContainerIterable implements Iterator<String> {
        private int pos = 0;

        @Override
        public boolean hasNext() {
            return pos < size;
        }

        @Override
        public String next() {
            return names[pos++];
        }
    }
}