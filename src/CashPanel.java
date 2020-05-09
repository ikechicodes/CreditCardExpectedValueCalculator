import javax.swing.*;
import java.awt.*;

/**
 * This CashPanel receives information presents
 */

public class CashPanel extends JPanel
{
    // Declare components.
    private JLabel cashLabel;
    private JTextField cashBonus;

    private JLabel travelLabel;
    private JTextField travelTextField;

    private JLabel milesLabel;
    private JTextField milesTextField;

    private JLabel bonusLabel;
    private JTextField bonusMultiplier;
    private JTextField bonusTextField;

    private JLabel bonusLabel2;
    private JTextField bonusMultiplier2;
    private JTextField bonusTextField2;

    private JLabel bonusLabel3;
    private JTextField bonusMultiplier3;
    private JTextField bonusTextField3;

    private JLabel nonBonusLabel;
    private JTextField nonBonusSpend;

    /**
     * Constructor
     */

    public CashPanel()
    {
        // Initialize components
        setLayout(new GridLayout(17, 1));

        cashLabel = new JLabel("Cash Bonus");
        cashBonus = new JTextField(1);

        add(cashLabel);
        add(cashBonus);

        travelLabel = new JLabel("Points Bonus");
        travelTextField = new JTextField(1);

        add(travelLabel);
        add(travelTextField);

        milesLabel = new JLabel("Miles Bonus");
        milesTextField = new JTextField(1);

        add(milesLabel);
        add(milesTextField);

        bonusLabel = new JLabel("Bonus Category Multiplier / Spend");
        bonusMultiplier = new JTextField(1);
        bonusTextField = new JTextField(1);

        add(bonusLabel);
        add(bonusMultiplier);
        add(bonusTextField);

        bonusLabel2 = new JLabel("Bonus Category Multiplier / Spend");
        bonusMultiplier2 = new JTextField(1);
        bonusTextField2 = new JTextField(1);

        add(bonusLabel2);
        add(bonusMultiplier2);
        add(bonusTextField2);

        bonusLabel3 = new JLabel("Bonus Category Multiplier / Spend");
        bonusMultiplier3 = new JTextField(1);
        bonusTextField3 = new JTextField(1);

        add(bonusLabel3);
        add(bonusMultiplier3);
        add(bonusTextField3);

        nonBonusLabel = new JLabel("Non Bonus Spend");
        nonBonusSpend = new JTextField(1);

        add(nonBonusLabel);
        add(nonBonusSpend);

    }
}
