import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

public class AddBudgetModal extends JDialog {
    private record Attribute(String name, JComponent value) {}
    private ArrayList<Attribute> attributes;


    AddBudgetModal() {
        this.setBackground(Color.DARK_GRAY);
        this.setTitle("Add Event");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setPreferredSize(new Dimension(500, 300));
        this.add(AddBudgetPanel());
        this.pack();
        this.setVisible(true);
    }

    private JPanel AddBudgetPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        panel.setBackground(Color.GREEN);

        attributes = new ArrayList<>();


        attributes.add(new Attribute("Budget Type", new JTextField(10)));
        attributes.add(new Attribute("Budget Category", new JTextField(10)));
        attributes.add(new Attribute("Credit", new JTextField(10)));
        attributes.add(new Attribute("Recurring", new JTextField(10)));
        attributes.add(new Attribute("Amount", new JTextField(10)));

        attributes.forEach(attr -> {
            JLabel label = new JLabel(attr.name);
            panel.add(label);
            panel.add(attr.value);
        });

        return panel;
    }
}
