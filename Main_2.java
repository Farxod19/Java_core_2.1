import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args){
        Scanner few=new Scanner(System.in);

        System.out.print("Radiusni kiriting: ");
        double R=few.nextDouble();

        if(R<0){
            System.out.print("Radius musbat son bolishi kerak");
        }
        else if(R >= 0){
            double S=Math.PI*(R*R);
            System.out.print("Javob: " + S);
        }

    }
}