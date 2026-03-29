
public class Demo {
    public static void main(String[] args) {
        String name = "Arbaz Ansari";

        // System.out.println(name.length());
        // System.out.println(name.isEmpty());
        // System.out.println(name.isBlank());

        // char access
        // System.out.println(name.charAt(0));
        // System.out.println(name.indexOf(name));
        char[] chArray = name.toCharArray();
        // System.out.println(chArray);

        // comparision
        String s1 = "arbaz";
        String s2 = "arbaz";

        // System.out.println(s1.compareTo(s2)); // 0 => lexicographical comparision
        // System.out.println(s1 == s2);
        // System.out.println(s1.equals(s2));

        // searching
        // System.out.println(s1.contains("az")); // true
        // System.out.println(s1.indexOf('z'));
        // System.out.println(s1.startsWith("ar")); // true
        // System.out.println(s1.endsWith("az")); // true

        // substring
        // System.out.println(s1.substring(0, 4)); // ar
        // System.out.println(s1.substring(2)); // baz

        // replace
        // System.out.println(s1.replace('a', 'z')); // zrbz
        // System.out.println(s1.replace("ar", "za")); // zarbz

        // System.out.println(s1.toUpperCase()); // ARBAZ
        // System.out.println(s1.toLowerCase()); // arbaz
        String name1 = "    arbaz    ";
        // System.out.println(name1.trim()); // arbaz
        // System.out.println(name1.strip()); // arbaz => strip is unicode capable

        // System.out.println(s1.repeat(10));

        // spite and join
        String new_example = "arbaz, ansari, bro, i, am, comming";
        String[] data = new_example.split(", ");

        // for (String s : data) {
        // System.out.println(s);
        // }

        // String joined = String.join(" ", data);
        // System.out.println(joined);

        // getBytes
        String name2 = "arbaz 😭";

        // byte[] arr = name2.getBytes();
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(name2.charAt(i) + "=>" + arr[i] + " " + "\n");
        // }

        // String.format();
        String example = String.format("Name: %s, Age: %d", "Arbaz", 21);
        // System.out.println(example);

        // string buffer and builder with example
        // System.out.println("**************stringbuffer**************");
        StringBuffer sb = new StringBuffer("Arbaz");
        // System.out.println("capacity befroe append: " + sb.capacity());

        sb.append("AnsariAnsariAnsariAnsariAnsariAnsariAnsariAnsari");
        // System.out.println("capacity after append: " + sb.capacity());

        // System.out.println("**************stringbuilder**************");
        StringBuilder sb2 = new StringBuilder("");
        // System.out.println("capacity befroe append: " + sb2.capacity());

        sb2.append("AnsariAnsariAnsariAnsarAnsari");
        // System.out.println("capacity after append: " + sb2.capacity());

        // System.out.println(sb.reverse());
        // System.out.println(sb2.reverse());

        // insert
        sb2.insert(0, "ArbazArbazArbazArbazArbazArbazA");
        // System.out.println(sb2);

        // difference b/t length and capacity

        System.out.println("length: " + sb2.length()); // 60
        System.out.println("capacity: " + sb2.capacity()); // 70

        sb2.ensureCapacity(1000);
        System.out.println("capacity after ensuring: " + sb2.capacity()); // 1000

        sb2.trimToSize();
        System.out.println("capacity after trimToSize: " + sb2.capacity()); // 60
    }
}
