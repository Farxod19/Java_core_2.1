import java.util.Scanner;

public class Taks6 {
    public static void main(String[] args){
        Scanner few = new Scanner(System.in);

        System.out.print("boolean1: ");
        boolean b1 = few.nextBoolean();

        System.out.print("boolean2: ");
        boolean b2 = few.nextBoolean();

        boolean And = false; 
        boolean Or = false;

        // AND 
        if (b1 == true) {
            if (b2 == true) {
                And = true;
            } else {
                And = false;
            }
        } else {
            And = false; 
        }

        // OR 
        if (b1 == true) {
            Or = true;
        } else if (b2 == true) {
            Or = true;
        } else {
            Or = false;
        }

        System.out.println("AND: " + And + ", OR: " + Or);
    }
}
