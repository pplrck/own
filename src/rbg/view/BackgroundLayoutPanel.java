package rbg.view;

import rbg.model.UserColor;

import javax.swing.*;
import java.awt.*;

/**
 * ColorButtonFrame sets up a JFrame which has several buttons
 * to change the background color on button usage
 */
public class BackgroundLayoutPanel extends JPanel {

    private JButton green, red, darker, rgbButton;
    private final FlowLayout flowLayout;
    private final UserColor inputColor;

    /**
     * Initialize the frame and set up some attribute
     */
    public BackgroundLayoutPanel() {
        this.setBackground(Color.DARK_GRAY);
        flowLayout = new FlowLayout();
        inputColor = new UserColor();
        initButton();
        initLayout();
    }

    public JButton getGreenButton() {
        return green;
    }

    public JButton getRedButton() {
        return red;
    }

    public JButton getDarkerButton() {
        return darker;
    }

    public JButton getRgbButton() {
        return rgbButton;
    }

    public JPanel getPanel(){
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
