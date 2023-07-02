package com.hello;

import javax.swing.*;
import java.awt.*;

public class List extends JPanel {
    Color bColor = Color.decode("#185A89");
    List(){
        GridLayout layout = new GridLayout(10,1);
        layout.setVgap(5);
        this.setLayout(layout);
        this.setPreferredSize(new Dimension(400,560));
        setBackground(bColor);
    }


    public void updateNumbers(){
        Component[] listItems = this.getComponents();

        for (int i = 0; i< listItems.length; i++)
        {
            if (listItems[i] instanceof Task) {
                ((Task)listItems[i]).changeIndex(i+1);
            }

        }
    }

    public void removeCompleted(){
        for (Component c:getComponents()){
            if(c instanceof Task){
                if(((Task)c).getState()){
                     remove(c);
                     updateNumbers();
                }
            }
        }
    }
}
