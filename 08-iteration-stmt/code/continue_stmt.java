
public class continue_stmt {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6 || i == 7)
                continue;
            System.err.print(i + " ");
        }
    }
}
