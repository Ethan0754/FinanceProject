import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountsPanel extends JPanel{
    private JButton addBudget;
    private Account account;


    public AccountsPanel() {
        setPreferredSize(new Dimension(500, 500));



        addBudget = new JButton("Add Budget");
        addBudget.addActionListener(e -> {
            new AddBudgetModal();
        });







        // Add panels to main panel
        add(addBudget);



    }
}
