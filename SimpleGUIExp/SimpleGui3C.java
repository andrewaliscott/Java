import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C implements ActionListener {

    JFrame frame;
    JButton button;
    MyDrawPanel myDraw;


    public void go(){

        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button=new JButton("Click Me");
        myDraw=new MyDrawPanel();
        button.addActionListener(this);

       frame.getContentPane().add(BorderLayout.SOUTH,button);
       frame.getContentPane().add(BorderLayout.CENTER,myDraw);
        frame.setSize(300,300);
        frame.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        frame.repaint();

    }
}
