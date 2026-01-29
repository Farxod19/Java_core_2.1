import java.util.Scanner;

public class Taks7 {
    public static void main(String[] args){
        Scanner few = new Scanner(System.in);

        System.out.print("Fahrenheit: ");
        double fahrenheit = few.nextDouble(); 

        double celsius = calculateF(fahrenheit);

        System.out.print("Celsius: " + celsius);
    }

    public static double calculateF(double F){
        return (F - 32)*5/9;
    }
}
