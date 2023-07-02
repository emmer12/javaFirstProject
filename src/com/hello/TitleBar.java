package com.hello;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
    Color bColor = Color.decode("#0f3857");
   TitleBar(){
       this.setPreferredSize(new Dimension(400,80));
       JLabel titleText = new JLabel("Todo List");
       titleText.setPreferredSize(new Dimension(200,80));
       titleText.setFont(new Font("Sans-serif", Font.BOLD,20));
       titleText.setForeground(Color.white);
       titleText.setHorizontalAlignment(JLabel.CENTER);
       setBackground(bColor);

       this.add(titleText);
   }
}
