
public class Demo {
    public static void main(String[] args) {
        Directions[] d = Directions.values();

        for (Directions dir : d) {
            System.out.println(dir.name());
        }
    }
}

enum Directions {
    NORTH, EAST, SOUTH, WEST;
}
