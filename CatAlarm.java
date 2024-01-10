import java.util.Scanner;
public class CatAlarm {
    public static boolean Wakeup(boolean yowl,int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        if (yowl && (hourOfDay < 8 || hourOfDay > 22)) {
           return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("If the cat yowling ? true/false ? ");
        boolean yowl = scanner.nextBoolean();
        System.out.print("What is the hour of the day 0-23 ? ");
        int hourOfDay = scanner.nextInt();
        boolean shouldWakeup = Wakeup(yowl,hourOfDay);
        if (shouldWakeup){
            System.out.println("Time to Wakeup");
        }
        else {
            System.out.println("Keep Sleeping  ..... ");
        }
    }

}
