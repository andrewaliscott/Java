import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    public static void main(String[] args) {

        JFrame myFrame=new JFrame();
        JPanel myPanel=new JPanel();
        myPanel.setBackground(Color.DARK_GRAY);

        JButton btn1=new JButton("shock me");
        //Font big=new Font("serif",Font.BOLD,28);
        //btn1.setFont(big);
        JButton btn2=new JButton("bliss");
        JButton btn3=new JButton();
        myPanel.setLayout(new BoxLayout(myPanel,BoxLayout.Y_AXIS));
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myPanel.add(btn1);
        myPanel.add(btn2);
        myFrame.getContentPane().add(BorderLayout.EAST,myPanel);
        myFrame.setSize(250,200);
        myFrame.setVisible(true);






    }
}
