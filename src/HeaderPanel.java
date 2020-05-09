import javax.swing.*;
import java.awt.*;

/**
 * The header panel displays the header of the application.
 */
public class HeaderPanel extends JPanel
{
    // Declare the components for the Header panel.
    private JLabel headerLabel;

    /**
     * Constructor
     */

    public HeaderPanel()
    {
        // Create label.
        headerLabel = new JLabel("SHOULD YOU APPLY?");
        headerLabel.setFont(new Font("Verdana", Font.BOLD, 30));

        headerLabel.setForeground(Color.WHITE);
        headerLabel.setBackground(Color.BLUE);

        // Add the label to the panel.
        add(headerLabel);

        // Place a border around this panel.
        //setBorder(BorderFactory.createLineBorder(Color.BLUE));
        setBackground(Color.BLUE); // Set color to blue.
    }

}
