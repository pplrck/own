package rbg.model;

import javax.swing.*;
import java.awt.*;

/**
 * UserColor lets one set the background of the JFrame freely
 * based on RBG input value. Uses JOptionPane for some interaction with the user
 * Additionally user is able to choose between sRBG(standard RBG) and RBG input values
 */
public class UserColor {

    private int red, green, blue;

    /**
     * Initializes the layout for RBG value input.
     */
    public void readRBGValuesPane() {
        red = Integer.parseInt(JOptionPane.showInputDialog(new JTextField(1), "RBG Wert für Rot eingeben", "Rot", JOptionPane.INFORMATION_MESSAGE));
        green = Integer.parseInt(JOptionPane.showInputDialog(new JTextField(1), "RBG Wert für Grün eingeben", "Grün", JOptionPane.INFORMATION_MESSAGE));
        blue = Integer.parseInt(JOptionPane.showInputDialog(new JTextField(1), "RBG Wert für Blau eingeben", "Blau", JOptionPane.INFORMATION_MESSAGE));
        checkRGBValues(red, green, blue);
    }

    /**
     * Checks for valid user input.
     * If user input is corrupt user has to choose between new input or chancel input.
     *
     * @param red Red RBG value to be checked
     * @param green Green RBG value to be checked
     * @param blue Blue RBG value to be checked
     */
    private void checkRGBValues(int red, int green, int blue){
        if((red < 0 || red > 255) || (green < 0 || green > 255) || (blue < 0 || blue > 255) ){
           int confirm = JOptionPane.showConfirmDialog(null, "Werte müssen zwischen 0 und 255 liegen \n Neue Eingabe starten?", "Eingabe Fehler", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                readRBGValuesPane();
            }
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