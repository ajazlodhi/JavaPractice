import java.util.Scanner;
public class NextCharacterScanner {
    // Java Scanner char input example
    public static void main(String[] args) {
        System.out.println("Provide the Java Scanner char input: ");
        Scanner charScanner = new Scanner(System.in);
        charScanner.useDelimiter("");
        while (charScanner.hasNext()) {
            char name = charScanner.next().charAt(0);
            System.out.println(name);
            if (name == '\n') {
                return;
            }
        }
    }
}
