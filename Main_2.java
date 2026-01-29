import java.util.Scanner;

public class Taks2 {
    public static void main(String[] args){
        Scanner few=new Scanner(System.in);

        System.out.print("Radiusni kiriting: ");
        double R=few.nextDouble();

        if(R<=0){
            System.out.print("Error! ");
        }else{
            double S=Math.PI*R*R;
            System.out.print("Natija: " + S);
        }

    }
}
