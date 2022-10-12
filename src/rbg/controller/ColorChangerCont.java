package rbg.controller;

import rbg.view.BackgroundLayoutPanel;

import javax.swing.*;

public class ColorChangerCont extends JFrame{


    public ColorChangerCont(){
        super("Hintergrundfarbe wechseln");
        BackgroundLayoutPanel panel = new BackgroundLayoutPanel();
        this.add(panel.getPanel());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800, 400);
    }
}
