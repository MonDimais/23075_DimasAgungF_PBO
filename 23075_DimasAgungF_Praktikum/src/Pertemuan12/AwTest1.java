package Pertemuan12;

import java.awt.*;

public class AwTest1 {
    public AwTest1() {
        Frame f = new Frame();
        Button btn = new Button("Button Test");
        btn.setBounds(80, 80, 100, 50);
        f.add(btn);
        f.setSize(300, 250);
        f.setTitle("AWT Test");
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        AwTest1 awt = new AwTest1();
    }
}
