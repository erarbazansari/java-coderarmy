import java.io.IOException;

public class Reading {
    public static void main(String[] args) throws IOException {
        int value = System.in.read();
        System.out.println("enter num: " + (char) (value));
    }
}