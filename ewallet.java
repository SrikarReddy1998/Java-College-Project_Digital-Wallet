import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import javax.swing.*;
public class ewallet extends Frame implements ActionListener
{  
int bal=0;
Button b1,b2,b3,b4,b5,b6,bt1,bt2;
Label l1,l2,l4,l5,l6,l7,l8,l9,l10,l11,l12,label,label1,label2,lb1,lb2,lb3;
TextField t1,t2,t3,t4,t5,t6,t7,t8,text,text1,text2,txt1,txt2;
TextArea ta,ta1,ta2;
Choice c2;
Panel tabs; 
CardLayout cl;
FlowLayout fl,fl1,fl2,fl3;
ewallet()
{
super("ewallet");
setLayout(new BorderLayout());
bt1=new Button("REGISTER");
b5=new Button("LOGIN"); 
b1=new Button("PAY");
b2=new Button("ADD MONEY");
Panel p1=new Panel();
p1.add(bt1);
p1.add(b5);	
p1.add(b1);
p1.add(b2);
add(p1,BorderLayout.NORTH);
cl=new CardLayout();
tabs=new Panel();
tabs.setSize(500,500);
tabs.setLayout(cl);
fl=new FlowLayout(FlowLayout.LEFT,10,10);
lb1=new Label("ENTER MOBILE NUMBER TO REGISTER:");
txt1=new TextField("",20);
lb2=new Label("SET PASSWORD");
txt2=new TextField("",20);
txt2.setEchoChar('*');
bt2=new Button("REGISTER"); 
lb3=new Label("REGISTRATION STATUS:");
ta2=new TextArea(2,50);
Panel a4=new Panel();
       a4.add(lb1);
       a4.add(txt1);
       a4.add(lb2);
       a4.add(txt2);
       a4.add(bt2);
       a4.add(lb3);
       a4.add(ta2);
       a4.setLayout(fl);
fl1=new FlowLayout(FlowLayout.LEFT,5,5);  
label=new Label("ENTER REGISTERED MOB. NO:");
     text=new TextField("",20);
      label1=new Label("PASSWORD");
      text1=new TextField("",20);
     text1.setEchoChar('*');
      b6=new Button("LOGIN"); 
      label2=new Label("AMOUNT IN YOUR ACC. IS");
text2=new TextField(30);
Panel a3=new Panel();
       a3.add(label);
       a3.add(text);
       a3.add(label1);
       a3.add(text1);
       a3.add(b6);
       a3.add(label2);
       a3.add(text2);
       a3.setLayout(fl1);      
fl2=new FlowLayout(FlowLayout.LEFT,5,5);
l1=new Label("ENTER PHONE NUMBER:");
     t1=new TextField("",10);
     l2=new Label("AMOUNT TO PAY:");
     t2=new TextField(10);
    l4=new Label("REMAINING BALANCE ON YOUR ACCOUNT:");
     t3=new TextField(10);
     l5=new Label("MESSAGE:");
     ta=new TextArea(2,50);
     b3=new Button("PROCEED TO PAY");
Panel a1=new Panel();
     a1.add(l1);
     a1.add(t1);
     a1.add(l2);
     a1.add(t2);
     a1.add(b3);
     a1.add(l4);
     a1.add(t3);
     a1.add(l5);
     a1.add(ta);
     a1.setLayout(fl2);
fl3=new FlowLayout(FlowLayout.LEFT,5,5);  
  l6=new Label("ENTER THE NAME AS ON THE CARD:");
     t4=new TextField(30);
     l7=new Label("ENTER THE AMOUNT:");
     t5=new TextField(30);
     l8=new Label("MODE TO ADD MONEY:");
     c2=new Choice();
     c2.add("CREDIT CARD");
     c2.add("DEBIT CARD");
     c2.add("NET BANKING");
     c2.add("OTHERS");
     l9=new Label("ENTER CARD NUMBER:");
     t6=new TextField(16);
     l10=new Label("CVV:");
     t7=new TextField(3);     
     l11=new Label("YOUR CURRENT ACCOUNT BALANCE:");
     t8=new TextField(30);
     l12=new Label("DETAILS OF ADDED MONEY:");
     ta1=new TextArea(2,100);
     b4=new Button("PROCEED");
             Panel a2=new Panel();
     a2.add(l6);
     a2.add(t4);
     a2.add(l7);
     a2.add(t5);
     a2.add(l8);
     a2.add(c2);
     a2.add(l9);
     a2.add(t6);
     a2.add(l10);
     a2.add(t7);
     a2.add(b4);
     a2.add(l11);
     a2.add(t8);
     a2.add(l12);
     a2.add(ta1);
     a2.setLayout(fl3);
    tabs.add(a4,"REGISTER");
    tabs.add(a3,"LOGIN");
    tabs.add(a1,"PAY");
    tabs.add(a2,"ADD MONEY");
    add(tabs,BorderLayout.CENTER);
    b1.addActionListener(this);
    b2.addActionListener(this); 
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    bt1.addActionListener(this);
    bt2.addActionListener(this); 
    setSize(500,500);
    setVisible(true);
    addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent we){
    System.exit(0);
    }
    });
    }
  public void actionPerformed(ActionEvent ae)
     {
 	if(ae.getSource() == bt1)
            {
	   cl.show(tabs,"REGISTER");
           }
    if(ae.getSource() == bt2)
        {
Long xyz=Long.parseLong(txt1.getText());
      String pqr=txt2.getText();
      ta2.setText(xyz+" NUMBER IS REGISTERED ");
//    else
  //  {
    // ta2.setText("ENTER USER NAME AND PASSWORD TO REGISTER");
     //}
      
        } 
       if(ae.getSource() == b1) 
        { 
             cl.show(tabs,"PAY");
        }
       if(ae.getSource() == b6) 
        { 
	  String usrnm=txt1.getText();
          String usrin=text.getText();
          String pin=txt2.getText();
         String pr=text1.getText();
              if(pin.equals(pr)&&usrnm.equals(usrin)&&!usrnm.equals(""))
           { 
             
    text2.setText("BALANCE IN YOUR ACCOUNT"+usrin+"  is"+bal+"/-");
           }
    if(!(usrnm.equals(usrin)) || (!pin.equals(pr)) )
           {
        {
    text2.setText(usrin+" IS INCORRECT PH.NO OR USERNAME"+pr+""+pin);
             }
      }   
      }
    if(ae.getSource() == b3)
       { 
       String usrnm=txt1.getText();
          String usrin=text.getText();
       String pin=txt2.getText();
         String pr=text1.getText();
              if(pin.equals(pr)&&usrnm.equals(usrin)&&!usrnm.equals(""))
           { 
               int n2=Integer.parseInt(t2.getText()); 
               bal=bal-n2;
               ta.setText(n2+" RUPEES PAID TO THE NUMBER" +t1.getText()+" SUCCESFULLY..!!!");
               t3.setText(bal+"");
            }
           else
                 {
                       Dialog d = new Dialog(this,"Warning..!!",false);		
               d.add("Center",new Label("LOGIN PROPERLY AND TRY AGAIN"));
		d.add("South",new Button("OK"));
	    d.pack();
		d.setVisible(true);}
           
       } 
     if(ae.getSource() == b2) 
        { 
             cl.show(tabs,"ADD MONEY");
        }
        
        if(ae.getSource() == b5) 
        { 
             cl.show(tabs,"LOGIN");
        }

            if(ae.getSource() == b4)
           {  
                String usrnm=txt1.getText();
                String usrin=text.getText();
          
                String pin=txt2.getText();
                String pr=text1.getText();
              if(pin.equals(pr)&&usrnm.equals(usrin)&&!usrnm.equals(""))
              { 
               
                int n1=Integer.parseInt(t5.getText());
                ta1.setText(n1+"  RUPEES HAS BEEN ADDED TO YOUR ACCOUNT SUCCESFULLY..!!");
                bal=bal+n1;
                t8.setText(bal+"");
               }  
            else
                 {
                       Dialog d = new Dialog(this,"Warning..!!",false);		
		d.add("Center",new Label("LOGIN PROPERLY AND TRY AGAIN"));
	        d.add("South",new Button("OK"));
	        d.pack();
	        d.setVisible(true);}}}  
     public static void main(String args[])
     {		 
         new ewallet();
     }
     }

