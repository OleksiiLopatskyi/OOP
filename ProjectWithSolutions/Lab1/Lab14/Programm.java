package ProjectWithSolutions.Lab1.Lab14;
import java.util.Scanner;
public class Programm {
    public static void main(String[] args) {
        Array a = new Array(5);
        Array b = new Array(3);
        String choice = null;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println();
            System.out.println("[1] - Array input");
            System.out.println("[2] - Set value by index");
            System.out.println("[3] - Concatenate between array a and b");
            System.out.println("[4] - Print array a");
            System.out.println("[5] - Print array b");
            System.out.println("[6] - Get value of array a by index");
            System.out.println("[7] - Get value of array b by index");
            System.out.println("[0] - Quit");
            System.out.println("Select an action: ");
            choice = scan.nextLine();
            switch (choice) {
                case "1":                    a.read();
                    break;
                case "2":                    b.setValueByIndex(0, "1tz");
                    b.setValueByIndex(1, "3tz");
                    b.setValueByIndex(2, "5tz");
                    b.display();
                    break;
                case "3":                    Array c = a.concatenate(b);
                    c.display();
                    break;
                case "4":                    a.display();
                    break;
                case "5":                    b.display();
                    break;
                case "6":                    a.printByIndex(1);
                    break;
                case "7":                    b.printByIndex(3);
                    break;
                case "0":                    break;
                default:                    System.out.println("You have entered an incorrect value!");
                    System.out.println("Enter the number - the number of the selected menu item");
                    System.out.println();
            }
        }
 while (!choice.equals("0"));
    }
}