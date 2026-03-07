public class stringArgs {
    public static void main(String[] args) {
        System.out.println("total length of args array: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println(i + " = " + args[i]);
        }
    }
}
