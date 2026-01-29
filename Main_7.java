import java.util.Scanner;

public class Main_7 {
    public static void main(String[] args){
        Scanner few=new Scanner(System.in);
        
        System.out.print("Fahrenheit: ");
        double F=few.nextDouble();

        double S=(F-32)*5/9;

        System.out.print("Celsius: " + S);
    }
}
