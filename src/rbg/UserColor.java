package rbg;

import javax.swing.*;
import java.awt.*;

/**
 * UserColor lets one set the background of the JFrame freely
 * based on RBG input value. Uses JOptionPane for some interaction with the user
 * Additionally user is able to choose between sRBG(standard RBG) and RBG input values
 */
public class UserColor {

    private int red, green, blue;

    public UserColor() {
    }

    /**
     * Initializes the layout for RBG value input.
     */
    public void readRBGValuesPane() {
        red = Integer.parseInt(JOptionPane.showInputDialog(new JTextField(1), "RBG Wert für rot eingeben", "Rot", JOptionPane.INFORMATION_MESSAGE));
        checkRBGValues(red);
        green = Integer.parseInt(JOptionPane.showInputDialog(new JTextField(1), "RBG Wert für grün eingeben", "Grün", JOptionPane.INFORMATION_MESSAGE));
        checkRBGValues(green);
        blue = Integer.parseInt(JOptionPane.showInputDialog(new JTextField(1), "RBG Wert für blau eingeben", "Blau", JOptionPane.INFORMATION_MESSAGE));
        checkRBGValues(blue);
    }

    private void checkRBGValues(int value){
        if(value < 0 || value > 255){
            JOptionPane.showMessageDialog(null, "Eingabe muss zwischen 0 und 255 liegen");
        }
    }

    /**
     * Changes user input to color input. In order to change the background color.
     *
     * @return The color chosen by user.
     */
    public Color getColor() {
        return new Color(red, green, blue);
    }
}