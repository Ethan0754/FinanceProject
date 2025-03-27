import javax.swing.*;

public class BankView {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Budget");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AccountsPanel panel = new AccountsPanel();

        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}