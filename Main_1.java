import java.util.Scanner;

public class Taks1 {
    public static void main(String[] args){
        Scanner few=new Scanner(System.in);

        System.out.print("x1: ");
        double x1=few.nextDouble();

        System.out.print("y1: ");
        double y1=few.nextDouble();

        System.out.print("x2: ");
        double x2=few.nextDouble();
        
        System.out.print("y2: ");
        double y2=few.nextDouble();

        double S=calculateDistance(x1, y1, x2, y2);

        System.out.print("Javob: " + S);
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2){
        double a=x2-x1;
        double b=y2-y1;
        return Math.sqrt(a*a+b*b);
    }
}
