package rbg.view;

import javax.swing.*;

public class BackgroundFrame extends JFrame {

    public BackgroundFrame(){
        super("Hintergrundfarbe ändern");
        BackgroundLayoutPanel panel = new BackgroundLayoutPanel();
        this.add(panel); //getPanel aufrufen?
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800,400);
    }
}
