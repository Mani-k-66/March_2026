import javax.swing.*;
public class studentform{
public static void main(String args[]){
JFrame f=new JFrame("student Details");
f.setLayout (null);
JLabel L1=new JLabel("student Name");
JLabel L2=new JLabel("Mother Name");
JLabel L3=new JLabel("Fother Name");
JLabel L4=new JLabel("Qualification");
JTextField t1=new JTextField(15);
JTextField t2=new JTextField(15);
JTextField t3=new JTextField(15);
JTextField t4=new JTextField(15);
JButton b1=new JButton("submit");
JButton b2=new JButton("save");
JButton b3=new JButton("edit");
L1.setBounds (30,50,120,30);
t1.setBounds (160,50,150,30);
L2.setBounds (30,100,120,30);
t2.setBounds (160,100,150,30);
L3.setBounds (30,150,120,30);
t3.setBounds (160,150,150,30);
L4.setBounds (30,200,120,30);
t4.setBounds (160,200,150,30);
b1.setBounds(20,260,100,30);
b2.setBounds(130,260,100,30);
b3.setBounds(240,260,100,30);
f.add(L1);
f.add(t1);
f.add(L2);
f.add(t2);
f.add(L3);
f.add(t3);
f.add(L4);
f.add(t4);
f.add(b1);
f.add(b2);
f.add(b3);
f.setSize(400,350);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}
}



