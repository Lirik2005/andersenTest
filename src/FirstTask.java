import java.util.Scanner;

public class FirstTask {

    private Integer enteredNumber;

    public void consoleOut() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        enteredNumber = in.nextInt();
        System.out.println("Your number is: " + enteredNumber);
        if (enteredNumber > 7) {
            System.out.println("Hello" + "\n");
        } else {
            System.out.print("\n");
        }
    }

}
