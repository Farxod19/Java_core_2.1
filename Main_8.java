import java.util.Scanner;

public class Main_8 {
    public static void main(String[] args) { 
        Scanner few = new Scanner(System.in);

        System.out.print("son1: ");
        double a = few.nextDouble();

        System.out.print("son2: ");
        double b = few.nextDouble();

        double S1 = a + b;
        double S2 = a - b;
        double S3 = a * b;

        if (b != 0) {
            double S4 = a / b;
            System.out.println("Yig'indi: " + S1 + ", Ayirma: " + S2 + ", Ko'paytma: " + S3 + ", Bo'linma: " + S4);
        } else {
            System.out.println("Yig'indi: " + S1 + ", Ayirma: " + S2 + ", Ko'paytma: " + S3 + ", Bo'linma: Nolga bo'lish mumkin emas!");
        }
        
        few.close();
    }
}