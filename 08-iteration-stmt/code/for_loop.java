
public class for_loop {
    public static void main(String[] args) {
        // for loop
        // for (int i = 1; i <= 10; i++) {
        // System.err.print(i + " ");
        // }

        // infinite loop
        // int i = 1;
        // for (;;) {
        // System.err.println("hello, bro " + i);
        // i++;
        // }

        // multiple variable
        // for (int i = 1, j = 1; i <= 10 && j <= 5; i++, j += 2) {
        // System.err.println(i + " * " + j + " => " + (i * j));
        // }

        // nested loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print("* ");
            }
            System.err.println("");
        }
    }
}
