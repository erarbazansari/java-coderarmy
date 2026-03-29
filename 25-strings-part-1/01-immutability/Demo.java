class Demo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1.concat(" world!");

        System.out.println(s1); // hello => immutability
        System.out.println(s2);
    }
}