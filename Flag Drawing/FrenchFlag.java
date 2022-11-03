package FlagDrawing;
import javax.swing.*;
import java.awt.*;
public class FrenchFlag {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("French Flag");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel eastPanel = new Panel();
        Panel centerPanel = new Panel();
        Panel westPanel = new Panel();
        westPanel.setBackground(Color.blue);
        eastPanel.setBackground(Color.red);
        centerPanel.setBackground(Color.white);
        Container pane = frame.getContentPane();
        pane.setLayout(new GridLayout(1, 3));
        pane.add(westPanel);
        pane.add(centerPanel);
        pane.add(eastPanel);
        frame.setVisible(true);
    }
}