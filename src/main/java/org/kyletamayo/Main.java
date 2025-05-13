package org.kyletamayo;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pomodoro Timer");
        JPanel panel = new JPanel();
        Label clock = new Label("00:00:00");
        Button start = new Button("Start");
        Button stop = new Button("Stop");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(clock);
        panel.add(start);
        panel.add(stop);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(320, 160);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
