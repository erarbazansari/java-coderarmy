import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter username: ");
        String username = sc.nextLine();

        System.out.print("enter age: ");
        int age = sc.nextInt();

        System.out.print("enter price: ");
        double price = sc.nextDouble();

        System.err.println("\nusername: " + username);
        System.err.println("age : " + age);
        System.err.println("price : " + price);
        sc.close();
    }
}
