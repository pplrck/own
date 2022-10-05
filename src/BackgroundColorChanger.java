import rbg.UserColor;

import javax.swing.*;
import java.awt.*;

/**
 * ColorButtonFrame sets up a JFrame which has buttons
 * to change the background color of this frame or darken the background color.
 */
public class BackgroundColorChanger extends JPanel {

    private JButton green, red, darker, rgbButton;
    private final FlowLayout flowLayout;
    private final UserColor inputColor;

    /**
     * Initialize the frame and set up some attribute
     */
    public BackgroundColorChanger() {
        this.setBackground(Color.DARK_GRAY);
        flowLayout = new FlowLayout();
        inputColor = new UserColor();
        initButton();
        initLayout();
        changeColorOnClick();
        darkenColorOnClick();
        rbgButtonOnClick();
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
        rgbButton = new JButton("RBG Werte");
    }

    /**
     * Set up layout for buttons.
     */
    private void initLayout() {
        flowLayout.setAlignment(FlowLayout.CENTER);
        this.add(green);
        this.add(darker);
        this.add(red);
        this.add(rgbButton);
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

    /**
     * Calls method from class UserColor to read user input from
     */
    private void rbgButtonOnClick() {
        rgbButton.addActionListener(rbgClicked -> {
            inputColor.readRBGValuesPane();
            this.setBackground(inputColor.getColor());
        });
    }
}
