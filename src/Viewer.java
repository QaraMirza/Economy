import java.text.DecimalFormat;

public class Viewer {
    double value;
    String stringValue;

    public static void view(double value) throws InterruptedException {
        System.out.println(new DecimalFormat("#0.00").format(value) + "\t");
        Thread.sleep(1000);
    }

    public static void view(double value, int year) throws InterruptedException {
        System.out.println(new DecimalFormat("#0.00").format(value) + "\t" + year);
        Thread.sleep(1000);
    }
}
