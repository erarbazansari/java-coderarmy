
public class Demo {
    public static void main(String[] args) {
        PaymentStatus f = PaymentStatus.FAILED;
        PaymentStatus p = PaymentStatus.PENDING;
        PaymentStatus s = PaymentStatus.SUCCESS;

        System.err.println(f.name());
        System.err.println(p.name());
        System.err.println(s);

    }
}

enum PaymentStatus {
    PENDING,
    PROCESSING,
    SUCCESS,
    FAILED
}