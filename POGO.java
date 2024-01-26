import java.util.Scanner;
import java.util.concurrent.Callable;

public class POGO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Floor width : " );
        double width = scanner.nextDouble();
        System.out.print("Enter the Floor Length : " );
        double length = scanner.nextDouble();
        Floor floor = new Floor(width ,length );
        System.out.print("Enter the Price per SQF : " );
        double cost = scanner.nextDouble();
        Carpet carpet = new Carpet(cost);
        double areaTotal = floor.getArea();
        System.out.println("Total SQFT Area SQF : " + areaTotal);
        Calculator calculator = new Calculator(floor,carpet);
        double totalCost = calculator.getTotalCost();
        System.out.println("Total Cost for Carpet is $ " + totalCost );
    }
}
