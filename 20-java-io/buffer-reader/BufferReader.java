import java.io.*;;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        // buffer-reader
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        String name = br.readLine();
        System.out.println("username: " + name);
    }
}
