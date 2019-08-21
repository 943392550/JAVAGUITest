import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame1 extends JFrame // 设计一个窗体类
{
    JButton jb1, jb2, jb3; // 按钮
    JLabel jl; // 标签

    Frame1() // 构造方法
    {
        jb1 = new JButton("红色"); // 创建按钮对象
        jb2 = new JButton("绿色");
        jb3 = new JButton("蓝色");

        // 给jb1添加监听事件
        jb1.addActionListener(new ActionListener() {

            // 覆写actionPerformed方法
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setForeground(Color.RED);


            }
        });

        // 给jb2添加监听事件
        jb2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setForeground(Color.GREEN);


            }
        });

        // 给jb3添加监听事件
        jb3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setForeground(Color.BLUE);


            }
        });

        jl = new JLabel("设定标签颜色"); // 创建标签对象
        jl.setFont(new Font("隶书", Font.PLAIN, 32)); // 标签字体

        JPanel jp1 = new JPanel(); // 面板1
        JPanel jp2 = new JPanel(); // 面板2
        jp1.add(jl); // 标签放入面板1
        jp2.add(jb1); // 三个按键放入面板2
        jp2.add(jb2);
        jp2.add(jb3);
        setLayout(new BorderLayout()); // 窗体设定为边界布局
        this.add(jp1, BorderLayout.NORTH); // 标签面板放在窗体上端
        this.add(jp2, BorderLayout.CENTER); // 按钮面板放在窗体中间
        setBounds(400, 300, 300, 140); // 设定窗体大小和位置
        setTitle("【实验10-1】座号25，王涛\n"); // 设定窗体标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // 设定窗体可见
    }
}

public class Experiment10_1 {
    public static void main(String[] args) {
        new Frame1();
    }
}