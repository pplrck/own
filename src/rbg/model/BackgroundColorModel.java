package rbg.model;

import rbg.view.BackgroundLayoutPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Model uses input from UI  and class UserColor to change the background color of the JFrame
 */
public class BackgroundColorModel {

    BackgroundLayoutPanel backgroundLayoutPanel;
    UserColor userColor;


    public BackgroundColorModel() {
        backgroundLayoutPanel = new BackgroundLayoutPanel();
        userColor = new UserColor();
        changeColorGreenClicked();
        changeColorRedClicked();
        changeColorDarkenClicked();
        changeColorRBGValues();
    }

    /**
     * Changes background color to red, if clicked
     */
    private void changeColorRedClicked() {
        backgroundLayoutPanel.getRedButton().addActionListener(redCLicked -> backgroundLayoutPanel.getPanel().setBackground(Color.RED));
    }

    /**
     * Changes background color to green, if clicked
     */
    private void changeColorGreenClicked() {
        backgroundLayoutPanel.getGreenButton().addActionListener(greenClicked -> backgroundLayoutPanel.getPanel().setBackground(Color.GREEN));
    }

    /**
     * Darkens background color for current red or green background
     */
    private void changeColorDarkenClicked() {
        JButton darken = backgroundLayoutPanel.getDarkerButton();
        Color backgColor = backgroundLayoutPanel.getBackground();
        darken.addActionListener(darker -> {
            if (backgColor == Color.GREEN) {
                backgroundLayoutPanel.getPanel().setBackground(Color.GREEN.darker());
            } else if (backgColor == Color.RED) {
                backgroundLayoutPanel.getPanel().setBackground(Color.RED.darker());
            }
        });
    }

    /**
     * Calls method from class UserColor to read user input from
     * Sets new background color with rbg values from user
     */
    private void changeColorRBGValues() {
        backgroundLayoutPanel.getRgbButton().addActionListener(rbgButtonClicked -> {
            userColor.readRBGValuesPane();
            backgroundLayoutPanel.getPanel().setBackground(userColor.getColor());
        });
    }
}
