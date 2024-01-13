import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
    Library myLibrary = new Library("CentralLibrary", 5000,"123 MainStreet");
    System.out.println(myLibrary.getName());
    System.out.println(myLibrary.getNumBooks());
    System.out.println(myLibrary.getAddress());
    myLibrary.setName("Downtown Library");
    myLibrary.setNumBooks(6500);
    myLibrary.setAddress("657 Bay Street Toronto");
    System.out.println("=====================");
    System.out.println(myLibrary.getName());
    System.out.println(myLibrary.getNumBooks());
    System.out.println(myLibrary.getAddress());
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the Library Name : ");
    String name = scanner.nextLine();
    System.out.print("Enter the Number of book ");;
    int numBooks = scanner.nextInt();
    System.out.print("Enter the Address : ");
    String address = scanner.next();
    Library myNew = new Library(name,numBooks,address);
    System.out.println("Address : " + myNew.getName());
    System.out.println("Total Books " + myNew.getNumBooks());
    System.out.println("Address " + myNew.getAddress());
    }
}
