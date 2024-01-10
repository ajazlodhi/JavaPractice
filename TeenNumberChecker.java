import java.util.Scanner;

public class TeenNumberChecker{
    public static boolean FindTeen(int num1, int num2, int num3) {
        boolean isTeen = false;
        if (isInRange(num1) || isInRange(num2) || isInRange(num3)){
            isTeen = true;
        }
        return isTeen;
    }
    public static boolean isInRange (int num){
        return num >= 13 && num <= 19;
    }
import java.util.Scanner;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the Third Number : ");
        int num3 = scanner.nextInt();
        boolean isTeen = FindTeen(num1,num2,num3);
        if (isTeen){
            System.out.println("At Least one number is Teena");
        }
        else {
            System.out.println("No number in Teen Range  ");
        }

    }
}
