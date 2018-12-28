package View;

import Controler.*;
import javax.swing.*;

public class Panel extends JPanel {
    JButton create;

    Panel (){
        IControler controler = new Controler();
        IFabrica DialogFabrica = new IFabrica;
        setLayout(null);
        create = new JButton("Create");
        create.setBounds(10,10,100,30);

        add(create);

        create.addActionListener(e -> controler.openCreateDialog());
    }

}
