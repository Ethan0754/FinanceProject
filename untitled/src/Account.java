import java.util.Objects;
import java.util.Scanner;

public class Account {
    private final BudgetItem budgetItem;

    Account() {
        budgetItem = new BudgetItem();
    }

    public BudgetItem getBudgetItem() {
        return budgetItem;
    }
}
