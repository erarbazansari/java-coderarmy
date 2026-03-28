class Demo {
    public static void main(String[] args) {
        BlackThar bThar = new BlackThar();
        bThar.driveCar();
    }
}

interface Car {

    void driveCar();
}

abstract class Thar implements Car {
    abstract public void driveCar();
}

class BlackThar extends Thar {
    public void driveCar() {
        System.out.println("driving car!");
    }
}