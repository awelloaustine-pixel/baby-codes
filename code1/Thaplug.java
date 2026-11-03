
package thaplug;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Thaplug {

    
    public static void main(String[] args) {
        JFrame wun=new JFrame("SIMPLE CALCULATOR");
        JLabel num1=new JLabel("Number 1");
        JLabel num2=new JLabel("Number 2");
        JLabel rsl=new JLabel("Result");
        wun.setLayout(null);
        num1.setBounds(20,50,100,25);
        num2.setBounds(20,85,100,25);
        rsl.setBounds(20,120,100,25);
        
        
        final JTextField textnum1=new JTextField();
        final JTextField textnum2=new JTextField();
        final JTextField textrsl=new JTextField();
        
        textnum1.setBounds(140,50,190,25);
        textnum2.setBounds(140,85,190,25);
        textrsl.setBounds(140,120,190,25);
        
        wun.add(textnum1);
        wun.add(textnum2);
        wun.add(textrsl);
        
        wun.setSize(370,450);
        wun.setVisible(true);
        wun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        wun.add(num1);
        wun.add(num2);
        wun.add(rsl);
        
        JButton a=new JButton("ADD");
        JButton b=new JButton("SUBTRACT");
        JButton c=new JButton("DIVIDE");
        JButton d=new JButton("MULTIPLICATION");
        JButton e=new JButton("MODE");
        JButton f=new JButton("COS");
        JButton g=new JButton("SIN");
        JButton h=new JButton("TAN");
        JButton i=new JButton("LOG");
        JButton j=new JButton("ROOT");
        JButton k=new JButton("3ROOT");
        JButton l=new JButton("SQUARE");
        JButton m=new JButton("CUBE");
        JButton n=new JButton("LN");
        JButton o=new JButton("E");
        JButton p=new JButton("4XP");
        
        wun.add(a);
        wun.add(b);
        wun.add(c);
        wun.add(d);
        wun.add(e);
        wun.add(f);
        wun.add(g);
        wun.add(h);
        wun.add(i);
        wun.add(j);
        wun.add(k);
        wun.add(l);
        wun.add(m);
        wun.add(n);
        wun.add(o);
        wun.add(p);
        
        a.setBounds(20,250,100,30);
        b.setBounds(120,250,100,30);
        c.setBounds(220,250,100,30);
        d.setBounds(20,300,100,30);
        e.setBounds(120,300,100,30);
        f.setBounds(220,300,100,30);
        g.setBounds(20,350,100,30);
        h.setBounds(120,350,100,30);
        i.setBounds(220,350,100,30);
        j.setBounds(20,200,100,30);
        k.setBounds(120,200,100,30);
        l.setBounds(220,200,100,30);
        m.setBounds(20,250,100,30);
        n.setBounds(120,250,100,30);
        o.setBounds(220,250,100,30);
        m.setBounds(220,350,100,30);
        
        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double num1=Double.parseDouble(textnum1.getText());
                    double num2=Double.parseDouble(textnum2.getText());
                    textrsl.setText(String.valueOf(num1+num2));
                    
                }catch(Exception ex){
                    textrsl.setText("Invalid Input");
                }
            }
        });
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double num1=Double.parseDouble(textnum1.getText());
                    double num2=Double.parseDouble(textnum2.getText());
                    textrsl.setText(String.valueOf(num1-num2));
                    
                }catch(Exception ex){
                    textrsl.setText("Invalid Input");
                }
            }
        });
        
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double num1=Double.parseDouble(textnum1.getText());
                    double num2=Double.parseDouble(textnum2.getText());
                    textrsl.setText(String.valueOf(num1/num2));
                    
                }catch(Exception ex){
                    textrsl.setText("Invalid Input");
                }
            }
        });
        
        d.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double num1=Double.parseDouble(textnum1.getText());
                    double num2=Double.parseDouble(textnum2.getText());
                    textrsl.setText(String.valueOf(num1*num2));
                }catch(Exception ex){
                    textrsl.setText("Invalid Input");
                }
            }
        });
        
        e.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double num1=Double.parseDouble(textnum1.getText());
                    double num2=Double.parseDouble(textnum2.getText());
                    textrsl.setText(String.valueOf(num1%num2));
                    
                }catch(Exception ex){
                    textrsl.setText("Invalid Input");
                }
            }
        });
        
        f.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double num1=Double.parseDouble(textnum1.getText());
                    double num2=Double.parseDouble(textnum2.getText());
                    textrsl.setText(String.valueOf(Math.cos(Math.toRadians(num2))));
                    
                }catch(Exception ex){
                    textrsl.setText("Invalid Input");
                }
            }
        });
        
        g.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double num1=Double.parseDouble(textnum1.getText());
                    double num2=Double.parseDouble(textnum2.getText());
                    textrsl.setText(String.valueOf(Math.sin(Math.toRadians(num2))));
                    
                }catch(Exception ex){
                    textrsl.setText("Invalid Input");
                }
            }
        });
        
        h.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double num1=Double.parseDouble(textnum1.getText());
                    double num2=Double.parseDouble(textnum2.getText());
                    textrsl.setText(String.valueOf(Math.tan(Math.toRadians(num2))));
                    
                }catch(Exception ex){
                    textrsl.setText("Invalid Input");
                }
            }
        });
        
        i.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double num1=Double.parseDouble(textnum1.getText());
                    double num2=Double.parseDouble(textnum2.getText());
                    textrsl.setText(String.valueOf(Math.log10(num2)));
                    
                }catch(Exception ex){
                    textrsl.setText("Invalid Input");
                }
            }
        });
        
        
        
    }
    
}
