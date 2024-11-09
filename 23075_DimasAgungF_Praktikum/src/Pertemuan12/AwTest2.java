package Pertemuan12;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwTest2 extends WindowAdapter {
    Frame f;
    public AwTest2() {
        f = new Frame();
        Button btn = new Button("Button Test");
        btn.setBounds(80, 80, 100, 50);
        f.add(btn);
        f.setSize(300, 250);
        f.setTitle("AWT Test");
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public void windowClosing (WindowEvent e) {
        f.dispose();
    }
    
    public static void main(String[] args) {
        AwTest2 awt = new AwTest2();
    }
}
