
public class Project {
    public static void main(String[] args) {

        Direction NORTH = Direction.NORTH;
        Direction EAST = Direction.EAST;
        Direction SOUTH = Direction.SOUTH;
        Direction WEST = Direction.WEST;

        NORTH.move();
        EAST.move();
        SOUTH.move();
        WEST.move();
    }
}

enum Direction {
    NORTH {
        @Override
        public void move() {
            System.out.println("move (y+1)");
        }
    },
    EAST {
        @Override
        public void move() {
            System.out.println("move (x+1)");
        }
    },
    SOUTH {
        @Override
        public void move() {
            System.out.println("move (y+1)");
        }
    },
    WEST {
        @Override
        public void move() {
            System.out.println("move (y-1)");
        }
    };

    public abstract void move();

}