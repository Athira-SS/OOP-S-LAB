import java.awt.*;
import java.awt.event.*;
class calculator implements
ActionListener{f=new Frame();
Label l1=new Label("fisrt number");
Label l2=new Label("second
number"); Label l3=new
Label("result");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
Button b1=new Button("Add");
Button b2=new Button("Mult");
Button b3=new Button("Sub");
Button b4=new Button("Div");
Button b5=new Button("cancel");
calculator()
{f.add(l1);f.add(l2);
f.add(l3);f.add(t1);
f.add(t2);f.add(t3);
f.add(b1);f.add(b2);f.add(b3);
f.add(b4);f.add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
f.setLayout(null); f.setVisible(true);
f.setSize(400,450);
f.setLocation(500,200);
f.setBackground(Color.gray);
}
public void actionPerformed(ActionEvent e)
{
int n1=Integer.parseInt(t1.getText());
int n2=Integer.parseInt(t2.getText());
 if(e.getSource()==b1)
{
t3.setText(String.valueOf(n1+n2));
}
if(e.getSource()==b3)
{
t3.setText(String.valueOf(n1-n2));
}
if(e.getSource()==b2)
{
t3.setText(String.valueOf(n1*n2));
}
if(e.getSource()==b4)
{
t3.setText(String.valueOf(n1/n2));
}if(e.getSource()==b5)
{
System.exit(0);
}}public static void main(String args[])
{
new calculator();
}
}