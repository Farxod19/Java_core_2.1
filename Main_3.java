import java.util.Scanner;

public class Taks3 {
    public static void main(String[] args){
        Scanner few=new Scanner(System.in);

        System.out.print("Vazni kiriting (kg): ");
        double a=few.nextDouble();

        System.out.print("Bo'yni kiriting (m): ");
        double b=few.nextDouble();

        double S=calculateDistance(a, b);

        System.out.print("BMI: " + S);
    }  

    public static double calculateDistance(double a, double b){
        return a/(b*b);
    }
}
