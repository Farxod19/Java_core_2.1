import java.util.Scanner;

public class Taks4 {
    public static void main(String[] args){
        Scanner few=new Scanner(System.in);

        System.out.print("Parol kiriting: ");
        String password = few.nextLine();
        
        String pattern = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[!@#$%^&*]).{8,}$";

        if(password.matches(pattern)){
            System.out.print("Parol qabul qilindi");
        }
        else {
            System.out.println("Parol chuda sodda!");
            System.out.print("kamida 1 ta harf, sinvol, son bolishi shart");
        }

    }
}
