package com.hello;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private JButton addTask;
    private JButton clearTask;

    Border emptyBorder =  BorderFactory.createEmptyBorder();
    Color bColor = Color.decode("#0f3857");
    ButtonPanel(){
        this.setPreferredSize(new Dimension(400,60));
        setBackground(bColor);
        addTask = new JButton("Add Task");
        this.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif",Font.PLAIN,20));
        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));

        clearTask = new JButton("Clear Task");
        this.setBorder(emptyBorder);
        clearTask.setFont(new Font("Sans-serif",Font.PLAIN,20));
        this.add(clearTask);
    }

    public JButton getAddTask(){
        return addTask;
    }

    public  JButton getClearTask(){
        return clearTask;
    }
}
