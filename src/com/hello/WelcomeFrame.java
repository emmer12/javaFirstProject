package com.hello;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WelcomeFrame extends  JFrame {
    private JPanel mainPanel;
    private TitleBar title;
    private List list;

    private ButtonPanel btnPanel;

    private JButton addTask;
    private JButton clearTask;


    public WelcomeFrame(){
        add(mainPanel);
        setTitle("First JavaUi");
        setSize(400,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        title= new TitleBar();
        list = new List();
        btnPanel = new ButtonPanel();

        this.add(title, BorderLayout.NORTH);
        this.add(list, BorderLayout.CENTER);
        this.add(btnPanel, BorderLayout.SOUTH);

        addTask = btnPanel.getAddTask();
        clearTask = btnPanel.getClearTask();

        this.revalidate();

        addListeners();
    }


    public void addListeners(){
        addTask.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
              Task task = new Task();
                list.add(task);
                list.updateNumbers();
              task.getDone().addMouseListener(new MouseAdapter() {
                  @Override
                  public void mousePressed(MouseEvent e) {
                      task.changeState();
                      revalidate();
                  }
              });

                clearTask.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        list.removeCompleted();
                        list.repaint();
                    }
                });


          }
        });


    }

    public static void main(String[] args) {
        WelcomeFrame myFrame = new WelcomeFrame();
    }
}
