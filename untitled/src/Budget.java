import javax.swing.*;
import java.awt.*;

public class Budget {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Budget");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BudgetPanel panel = new BudgetPanel();

        frame.setContentPane(panel);

        frame.setVisible(true);
    }
}