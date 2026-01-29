import java.util.Scanner;

public class Main_5{
    public static void main(String[] args){
        Scanner few=new Scanner(System.in);

        System.out.print("Teksni kiriting: ");
        String a=few.nextLine();

        String reverse=new StringBuilder(a).reverse().toString();

        System.out.print("Natija: " + reverse);
    }
}