import java.util.HashMap;
import java.util.Map;

public class Budget {
    private final Map<BudgetType, Integer> budget;

    Budget() {budget = new HashMap<BudgetType, Integer>();}

    //adds a specific budget type form the budget
    public void add(BudgetType b, int amt) {
        budget.put(b, amt);
    }

    //removes a specific budget type from the budget
    public Integer remove(BudgetType b, int amt) {
        return budget.remove(b);
    }

    //gets the total amount in the budget
    public double getTotal(){
        double total = 0;
        for (Map.Entry<BudgetType, Integer> bills : budget.entrySet()) {
            total += bills.getValue();
        }
        return total;
    }

    public String toString(){
        StringBuilder rep = new StringBuilder();
        for (Map.Entry<BudgetType, Integer> bills : budget.entrySet()) {
            rep.append(bills.getKey().type()).append(": ").append(bills.getValue()).append("\n");
        }
        return rep.toString();
    }
}
