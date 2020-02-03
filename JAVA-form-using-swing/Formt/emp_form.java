//import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Formt{
public Formt() {
JFrame jFrame = new JFrame(&quot;Employee Form&quot;);
jFrame.setSize(900,750);
JTextField name,email,mob;
JLabel l1,l2,l3, dob,gender,pos;
JComboBox year,month,day;
JRadioButton male, female,manager, assmanager,coder,ca;
ButtonGroup genderGrp,posGrp;
final JTextArea data;
JButton submit,cancel;
//adding labels
l1=new JLabel(&quot;registerd full name&quot;);
l1.setBounds(50,32,130,45);
jFrame.add(l1);
l2=new JLabel(&quot;email&quot;);
l2.setBounds(50,65,130,45);
jFrame.add(l2);
l3=new JLabel(&quot;mob.no&quot;);
l3.setBounds(50,97,130,45);
jFrame.add(l3);
dob= new JLabel(&quot;Date of Birth&quot;);
dob.setBounds(50,129,130,45);
jFrame.add(dob);
gender =new JLabel(&quot;gender&quot;);
gender.setBounds(50,151,100,45);
jFrame.add(gender);

pos= new JLabel(&quot;position applying&quot;);
pos.setBounds(50,184,200,45);
jFrame.add(pos);
//adding text fields
name=new JTextField();
name.setBounds(220,32,170,15);
jFrame.add(name);
email=new JTextField();
email.setBounds(220,65, 170,15);
jFrame.add(email);
mob=new JTextField();
mob.setBounds(220,97,170,15);
jFrame.add(mob);
//going for dob
String yr[]={&quot;1996&quot;,&quot;1995&quot;,&quot;1994&quot;,&quot;1993&quot;,&quot;1992&quot;,&quot;1991&quot;,&quot;1990&quot;};
year=new JComboBox(yr);
year.setActionCommand(&quot;Select Year&quot;);
year.setBounds(220, 129, 60, 26);
jFrame.add(year);
String mn[]={&quot;jan&quot;,&quot;feb&quot;,&quot;mar&quot;,&quot;apr&quot;,&quot;may&quot;,&quot;june&quot;,&quot;july&quot;,&quot;aug&quot;
,&quot;sep&quot;,&quot;oct&quot;,&quot;nov&quot;,&quot;dec&quot;};
month=new JComboBox(mn);
month.setActionCommand(&quot;select month&quot;);
month.setBounds(300,129,60,26);
jFrame.add(month);
String d[]= new String[31];
for(int i=0;i&lt;31;i++)
{d[i]=String.valueOf(i+1);
}
day=new JComboBox(d);
day.setActionCommand(&quot;select day&quot;);
day.setBounds(380,129,60,26);
jFrame.add(day);
//adding male , female
male=new JRadioButton(&quot;male&quot;);
male.setEnabled(true);
male.setBounds(220,151,55,30);
jFrame.add(male);