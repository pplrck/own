import javax.swing.*;
import java.awt.*;

/**
 * ColorButtonFrame sets up a JFrame which has buttons
 * to change the background color of this frame or darken the background color.
 */
public class BackgroundColorChanger extends JPanel {

    private JButton green, red, darker;
    private final FlowLayout flowLayout;

    /**
     * Initialize the frame and set up some attribute
     */
    public BackgroundColorChanger() {
        this.setBackground(Color.DARK_GRAY);
        flowLayout = new FlowLayout();
        initButton();
        initLayout();
        changeColorOnClick();
        darkenColorOnClick();
    }

    public FlowLayout getFlowLayout() {
        return flowLayout;
    }

    public JPanel getPanel() {
        return this;
    }

    /**
     * Initialize the buttons.
     */
    private void initButton() {
        green = new JButton("Grün");
        red = new JButton("Rot");
        darker = new JButton("Dunkler");
    }

    /**
     * Set up layout for buttons.
     */
    private void initLayout() {
        flowLayout.setAlignment(FlowLayout.CENTER);
        this.add(green);
        this.add(darker);
        this.add(red);
    }

    /**
     * Changes background color based on button selection.
     */
    private void changeColorOnClick() {
        green.addActionListener(greenClick -> this.setBackground(Color.GREEN));
        red.addActionListener(redClick -> this.setBackground(Color.RED));
    }

    /**
     * Darkens background color for current background.
     */
    private void darkenColorOnClick() {
        darker.addActionListener(darkerClick -> {
            if (this.getBackground().equals(Color.RED)) {
                this.setBackground(Color.RED.darker());
            } else if (this.getBackground().equals(Color.GREEN)) {
                this.setBackground(Color.GREEN.darker());
            }
        });
    }
}
