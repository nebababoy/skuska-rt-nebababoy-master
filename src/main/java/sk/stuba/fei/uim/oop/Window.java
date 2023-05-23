package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Window {

    public Window(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 770);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setFocusable(true);
        frame.requestFocusInWindow();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
