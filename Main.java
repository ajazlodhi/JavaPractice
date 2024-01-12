// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Pen pen = new Pen();
  /*  pen.describePen();
    pen.setManufacturer("Eagle Pen");
    pen.setColor("Red "); 
    pen.setType("Ball Point"); */
    System.out.println("Manufacturer = " + pen.getManufacturer());
    System.out.println("Color = " + pen.getColor());
    System.out.println("Type = " + pen.getType());
    pen.describePen();

    }
}
