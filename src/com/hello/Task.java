package com.hello;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {

    private JLabel index;
    private JTextField taskName;
    private JButton done;
    private boolean checked;
    Color tColor = Color.decode("#1a486a");
    Color iColor = Color.decode("#0f3857");

    Color dColor = Color.decode("#2ECC71");
    Color idColor = Color.decode("#1fad5b");
    Insets padding = new Insets(0, 10, 0, 10); // top, left, bottom, right


    Task(){
        this.setPreferredSize(new Dimension(400 ,20));
        this.setBackground(iColor);


        this.setLayout(new BorderLayout());

        checked = false;

        index = new JLabel();
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        index.setForeground(Color.white);
        this.add(index, BorderLayout.WEST);

        taskName = new JTextField("Your task here");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(tColor);
        taskName.setForeground(Color.white);
        taskName.setMargin(padding);

        this.add(taskName, BorderLayout.CENTER);

        done = new JButton("Done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());

        this.add(done, BorderLayout.EAST);

    }


    public JButton getDone (){
        return done;
    }


    public void changeIndex(int num){
        this.index.setText(num+"");
        this.revalidate();
    }

    public void changeState(){
        taskName.setBackground(dColor);
        this.setBackground(idColor);
        this.revalidate();
        this.checked = true;
    }


    public boolean getState(){
        return this.checked;
    }
}
