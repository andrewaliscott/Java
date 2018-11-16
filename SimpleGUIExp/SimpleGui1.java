import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui1 implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    JComboBox comboBox;
    MyDrawPanel myDraw;

    public void go(){

        JFrame frame=new JFrame();
        button=new JButton("Click Me");
        checkBox=new JCheckBox("sdsds");
        comboBox=new JComboBox();
        myDraw=new MyDrawPanel();

        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.getContentPane().add(checkBox);
        frame.getContentPane().add(comboBox);
        frame.getContentPane().add(myDraw);
        frame.setSize(300,300);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        button.setText("I have been Clicked");

    }
}
