import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.PublicKey;

public class SimpleGui3C implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change Colours!");
        button.addActionListener(this);

        //DrawPanel
        MyDrawerPanel drawerPanel = new MyDrawerPanel();

        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.CENTER,drawerPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        frame.repaint();
    }
}

    class MyDrawerPanel extends JPanel{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        //random generate start color
        int red = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        Color startColor = new Color(red,blue,green);
        //random generate end color
        red = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        Color endColor = new Color(red,blue,green);

        GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,150,150);

    }
}
