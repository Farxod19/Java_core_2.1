import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args){
        Scanner few=new Scanner(System.in);
        
        System.out.print("x1= ");
        int x1=few.nextInt();

        System.out.print("y1= ");
        int y1=few.nextInt();

        System.out.print("x2= ");
        int x2=few.nextInt();
        
        System.out.print("y2= ");
        int y2=few.nextInt();
        
        int a=x2-x1;
        int b=y2-y1;

        double S=Math.sqrt(a*a+b*b);

        System.out.print("Javob:" + S);

    }
}
