import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * The CreditCardCalculator class creates the GUI for the
 * for the CreditCardCalculator application.
 *
 */

public class CreditCardCalculator extends JFrame
{
    // Declare all of the components for the CreditCardCalculator.
    HeaderPanel headerPanel = new HeaderPanel();
    CreditCardInfoPanel creditCardInfoPanel = new CreditCardInfoPanel();
    CashPanel cashPanel = new CashPanel();
    JPanel middlePanel;

    /**
     * Constructor
     */

    public CreditCardCalculator()
    {
        // Give the content pane a grid layout with 6 rows and 1 column.
        //=setLayout(new BoxLayout(6, 1));
        middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(2, 1));

        // Add the panels to the content pane.
        add(headerPanel, BorderLayout.NORTH);


        //add(new JLabel());
        add(creditCardInfoPanel, BorderLayout.WEST);
        add(cashPanel, BorderLayout.CENTER);

        // Set Default close operation.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Pack and set visible.
        pack();
        setVisible(true);
    }

    /**
     * Main method
     */

    public static void main(String[] args)
    {
        new CreditCardCalculator();
    }

}
