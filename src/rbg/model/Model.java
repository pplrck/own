package rbg.model;

import rbg.BackgroundColorChanger;
import rbg.UserColor;

import javax.swing.*;
import java.awt.*;

public class Model {

    BackgroundColorChanger backgroundColorChanger;
    UserColor userColor;

    public Model() {
        backgroundColorChanger = new BackgroundColorChanger();
        userColor = new UserColor();
    }

    private void changeColorRedClicked() {
        backgroundColorChanger.getRedButton().addActionListener(redCLicked -> backgroundColorChanger.getPanel().setBackground(Color.RED));
    }

    private void changeColorGreenClicked() {
        backgroundColorChanger.getGreenButton().addActionListener(greenClicked -> backgroundColorChanger.getPanel().setBackground(Color.GREEN));
    }

    private void darkenColorOnClick() {
        JButton darken = backgroundColorChanger.getDarkerButton();
        Color backgColor = backgroundColorChanger.getBackground();
        darken.addActionListener(darker -> {
            if (backgColor == Color.GREEN) {
                backgroundColorChanger.getPanel().setBackground(Color.GREEN.darker());
            } else if (backgColor == Color.RED) {
                backgroundColorChanger.getPanel().setBackground(Color.RED.darker());
            }
        });
    }

    private void rbgButtonOnClick() {
        backgroundColorChanger.getRgbButton().addActionListener(rbgButtonClicked -> {
            userColor.readRBGValuesPane();
            backgroundColorChanger.getPanel().setBackground(userColor.getColor());
        });
    }
}
