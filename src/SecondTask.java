import java.util.Scanner;

public class SecondTask {

    private String enteredName;

    public void greeting() {
        System.out.print("Enter your name: ");
        Scanner in = new Scanner(System.in);
        enteredName = in.next();
        System.out.println("Your name is: " + enteredName.substring(0, 1).toUpperCase() + enteredName.substring(1));
        if (enteredName.equalsIgnoreCase("вячеслав")) {
            System.out.println("Привет, Вячеслав" + "\n");
        } else {
            System.out.println("Нет такого имени" + "\n");
        }

    }
}
