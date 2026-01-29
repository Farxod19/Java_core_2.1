import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args){
        Scanner few=new Scanner(System.in);
        double S=0;

        System.out.print("Vazni kiriting (kg): ");
        double a=few.nextDouble();

        System.out.print("Bo'yni kiriting (m): ");
        double b=few.nextDouble();

        if(a <= 0 || b <=0 ){
            System.out.print("Error!");
        }

        else {
             S=a/(b*b);
        }

        System.out.print("BMI: " + S);
    }
}
