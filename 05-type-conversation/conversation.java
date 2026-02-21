public class conversation {
    public static void main(String[] args) {
        // implicit conversion
        // (byte to int)
        // byte value = 24;
        // int num = value;
        // System.out.println("num= "+value);

        // explicity conversion
        int data = 300;
        byte newData = (byte) data; // 300%256=>44
        System.out.println("data=" + newData);

        // truncating conversion
        float f = 10.502f;
        int i = (int) f;
        System.out.println(i);
    }
}