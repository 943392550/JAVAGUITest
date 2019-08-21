import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener {
    JButton button1;
    JButton button2;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        button1 = new JButton("click me");
        button2 = new JButton("this is button 2");
        //add listener to button
        button1.addActionListener(this);

        //add button to frame
        frame.getContentPane().add(BorderLayout.WEST,button1);
        frame.getContentPane().add(BorderLayout.EAST,button2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

        frame.setTitle("This is the GUI test!\n"); // 设定窗体标题
    }

    //@Override
    public void actionPerformed(ActionEvent event)
    {
        button1.setText("I've been clicked!");
    }
}
