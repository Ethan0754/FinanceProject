import javax.swing.*;
import java.util.Scanner;

public class BudgetPanel extends JPanel{

    public static void main(String[] args) {
        Account acc = new Account();

        String[] stringInput = new String[2];
        boolean[] boolInput = new boolean[2];
        int amtInput = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a budget type: ");
        stringInput[0] = scanner.nextLine();

        System.out.println("Enter a budget category: ");
        stringInput[1] = scanner.nextLine();

        System.out.println("Is this a credit? (T/F)");
        boolInput[0] = scanner.nextBoolean();

        System.out.println("Is this a recurring budget item? (T/F)");
        boolInput[1] = scanner.nextBoolean();

        System.out.println("What is the budget amount?");
        amtInput = scanner.nextInt();

        acc.getBudgetItem().add((new BudgetType(stringInput[0], stringInput[1], boolInput[0], boolInput[1])), amtInput);


        System.out.println(acc.getBudgetItem().toString());
    }
}
