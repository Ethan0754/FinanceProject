public class Account {
    private final Budget budgetItem;

    Account() {
        budgetItem = new Budget();
    }

    public Budget getBudgetItem() {
        return budgetItem;
    }
}
