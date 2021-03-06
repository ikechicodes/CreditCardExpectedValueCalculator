import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This CreditCardInfoPanel receives information about the credit card.
 */

public class CreditCardInfoPanel extends JPanel
{
    // Declare the components for the CreditCardInfoPanel.
    private JLabel namePrompt;
    private JTextField nameTextField;

    private JLabel eligibilityPrompt;
    private JRadioButton eligibilityYes;
    private JRadioButton eligibilityNo;
    private ButtonGroup eligibilityGroup;

    private JLabel cardTypePrompt;
    private JRadioButton cashType;
    private JRadioButton travelType;
    private JRadioButton airlineType;
    private ButtonGroup typeGroup;

    private JLabel featuresPrompt;
    private JLabel featuresPrompt2;
    private JTextField featureInput;
    private JTextField featureInput2;

    /**
     * Constructor
     */

    public CreditCardInfoPanel()
    {
        // Create a Grid Layout with 11 rows and 1 column.
        setLayout(new GridLayout(11,1, 1, 1));
        setBackground(Color.WHITE);

        // Instantiate the components.

        // For the name of the card.
        // namePrompt = new JLabel("Enter the name of credit card:");
        // nameTextField = new JTextField(5);
        // nameTextField.addActionListener(new TextFieldListener());
        // namePrompt.setFont(new Font("Verdana", Font.BOLD, 14));
        // nameTextField.setFont(new Font("Verdana", Font.BOLD, 14));

        // add(namePrompt);
        // add(nameTextField);

        // For the eligibility prompt.
        eligibilityPrompt = new JLabel("Are you eligible for the sign up bonus?");
        eligibilityYes = new JRadioButton("Yes");
        eligibilityNo = new JRadioButton("No");
        eligibilityGroup = new ButtonGroup();
        eligibilityGroup.add(eligibilityYes);
        eligibilityGroup.add(eligibilityNo);

        eligibilityPrompt.setFont(new Font("Verdana", Font.BOLD, 14));
        eligibilityYes.setFont(new Font("Verdana", Font.BOLD, 14));
        eligibilityYes.setBackground(Color.WHITE);
        eligibilityNo.setFont(new Font("Verdana", Font.BOLD, 14));
        eligibilityNo.setBackground(Color.WHITE);

        add(eligibilityPrompt);
        add(eligibilityYes);
        add(eligibilityNo);

        // For the card type.
        cardTypePrompt = new JLabel("Enter the card type: ");
        cashType = new JRadioButton("Cash");
        travelType = new JRadioButton("Travel");
        airlineType = new JRadioButton("Airline");
        typeGroup = new ButtonGroup();
        typeGroup.add(cashType);
        typeGroup.add(travelType);
        typeGroup.add(airlineType);

        cashType.setBackground(Color.WHITE);
        travelType.setBackground(Color.WHITE);
        airlineType.setBackground(Color.WHITE);

        cardTypePrompt.setFont(new Font("Verdana", Font.BOLD, 14));
        cashType.setFont(new Font("Verdana", Font.BOLD, 14));
        travelType.setFont(new Font("Verdana", Font.BOLD, 14));
        airlineType.setFont(new Font("Verdana", Font.BOLD, 14));

        add(cardTypePrompt);
        add(cashType);
        add(travelType);
        add(airlineType);

        // For the features.
        featuresPrompt = new JLabel("Enter any special features: ");
        featureInput = new JTextField(1);
        featuresPrompt2 = new JLabel("Enter the value you place on these features: ");
        featureInput2 = new JTextField(1);

        featuresPrompt.setFont(new Font("Verdana", Font.BOLD, 14));
        featuresPrompt2.setFont(new Font("Verdana", Font.BOLD, 14));
        featureInput.setFont(new Font("Verdana", Font.BOLD, 14));
        featureInput2.setFont(new Font("Verdana", Font.BOLD, 14));

        add(featuresPrompt);
        add(featureInput);
        add(featuresPrompt2);
        add(featureInput2);
    }

    /**
     * Private inner class to handle events generated by the Card Name Text Field.
     */

    private class TextFieldListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // When text field changes, update eligibility prompt.
            eligibilityPrompt.setText("Are you eligible for the sign up bonus of the " +
                    nameTextField.getText() + "?");

            // Repaint
            repaint();
        }
    }


}
