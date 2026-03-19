
public class Project {
    public static void main(String[] args) {

        Direction NORTH = Direction.NORTH;
        System.out.println(NORTH + "->" + NORTH.getDegree());

        Direction EAST = Direction.EAST;
        System.out.println(EAST + "->" + EAST.getDegree());

        Direction SOUTH = Direction.SOUTH;
        System.out.println(SOUTH + "->" + SOUTH.getDegree());

        Direction WEST = Direction.WEST;
        System.out.println(WEST + "->" + WEST.getDegree());
    }
}

enum Direction {
    NORTH(0), EAST(90), SOUTH(180), WEST(270);

    private int degree;

    Direction(int deg) {
        this.degree = deg;
    }

    public int getDegree() {
        return this.degree;
    }
}