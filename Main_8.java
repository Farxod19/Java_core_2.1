import java.util.Scanner;

public class Taks8 {
    public static void main(String[] args) {
        Scanner few = new Scanner(System.in);

        System.out.print("Birinchi sonni kiriting: ");
        double a = few.nextDouble();

        System.out.print("Ikkinchi sonni kiriting: ");
        double b = few.nextDouble();

        System.out.println("Yig'indi: " + s1(a, b));
        System.out.println("Ayirma: " + s2(a, b));
        System.out.println("Ko'paytma: " + s3(a, b));

        if (b != 0) {
            System.out.println("Bo'linma: " + s4(a, b));
        } else {
            System.out.println("Bo'linma: Xato! Nolga bo'lish mumkin emas.");
        }

    }

    public static double s1(double n1, double n2) {
        return n1 + n2;
    }

    public static double s2(double n1, double n2) {
        return n1 - n2;
    }

    public static double s3(double n1, double n2) {
        return n1 * n2;
    }

    public static double s4(double n1, double n2) {
        return n1 / n2;
    }
}
