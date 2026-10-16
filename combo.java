import javax.swing.*;
import java.awt.*;
public class combo{
    public static void main(String[]args){
        JFrame p=new JFrame("Enrollment Form");
        JLabel fn=new JLabel("First Name");
        JLabel sn=new JLabel("Surname");
        JLabel ct=new JLabel("County");

        fn.setBounds(30,50,100,150);
        sn.setBounds(30,80,100,150);
        ct.setBounds(30,110,100,150);

        p.add(fn);
        p.add(sn);
        p.add(ct);

        p.setSize(300,400);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setVisible(true);
    }
}

