package rbg.controller;

import javax.swing.*;

public class ColorChangerFrame extends JFrame {

    public static void main(String[] args) {
        ColorChangerFrame frame = new ColorChangerFrame();
        frame.setVisible(true);
    }

    public ColorChangerFrame(){
        super("Hintergrundfarbe wechseln");
        BackgroundColorChanger panel = new BackgroundColorChanger();
        this.add(panel.getPanel());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800, 400);
    }
}
