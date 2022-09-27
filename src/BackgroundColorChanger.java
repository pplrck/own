import javax.swing.*;
import java.awt.*;

/**
 * ColorButtonFrame sets up a JFrame which has buttons
 * to change the background color of this frame or darken the background color.
 */
public class BackgroundColorChanger extends JFrame {

    private JButton green, red, darker;

    /**
     * Initialize the frame and set up some attribute
     */
    public BackgroundColorChanger() {
        super("Hintergrundfarbe wechseln");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400, 250);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        initButton();
        initLayout();
        changeColorOnClick();
        darkenColorOnClick();
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
     * Set up layout, add buttons.
     */
    private void initLayout() {
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.CENTER);
        this.setLayout(flowLayout);
        this.add(green);
        this.add(darker);
        this.add(red);
    }

    /**
     * Changes background color based on button selection.
     */
    private void changeColorOnClick() {
        green.addActionListener(greenClick -> this.getContentPane().setBackground(Color.GREEN));
        red.addActionListener(redClick -> this.getContentPane().setBackground(Color.RED));
    }

    /**
     * Darkens background color for current background.
     */
    private void darkenColorOnClick() {
        darker.addActionListener(darkerClick -> {
            if (this.getContentPane().getBackground().equals(Color.RED)) {
                this.getContentPane().setBackground(Color.RED.darker());
            } else if (this.getContentPane().getBackground().equals(Color.GREEN)) {
                this.getContentPane().setBackground(Color.GREEN.darker());
            }
        });
    }
}
