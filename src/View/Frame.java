package View;

import javax.swing.*;

public class Frame extends JFrame{
    public Frame() {
            setBounds(400, 150, 800, 500);
            setTitle("model.Person V1");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            add(new Panel());
            setVisible(true);
    }
}
