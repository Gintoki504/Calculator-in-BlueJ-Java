
import java.awt.event.*;
import java.awt.*;
import java.applet.*;


public class calcul extends Applet implements ActionListener
{
String s[]={"CE","C","ON","OFF","7","8","9","/","4","5","6","*","1","2","3","-","0",".","+","="};
String msg="0";
TextField t;
int n=0,x=20,y=100;char ch1=' ';
int flg=0;
int t1=0,flg1=0,flg2=0,cnt=0;
double no=0,res=0;
Button b;
Checkbox c;
public void init()
{
setBackground(Color.gray);
setLayout(null);
t=new TextField("",12);
t.setBounds(100,65,150,25);
add(t);

for(int i=0;i<5;i++)
{
x=100;
for(int j=0;j<4;j++)
{
b=new Button(s[n]);
b.setBounds(x,y,30,25);
add(b);
b.addActionListener(this);
x+=40;
n++;
}
y+=30;
}
}
public void paint(Graphics g)
{
t.setText(msg);
}
public void actionPerformed(ActionEvent ae)
{


String temp1=ae.getActionCommand();
char ch=temp1.charAt(0);
t1=ch;
switch(ch)
{
case '+': res=no;flg=1;ch1=ch;
break;
case '-': res=no;flg=1;ch1=ch;
break;
case '/': res=no;flg=1;ch1=ch;
break;
case '*': res=no;flg=1;ch1=ch;
break;
case '%': res=no;flg=1;ch1=ch;
break;
}
if(temp1.equals("="))
{
{
switch(ch1)
{
case '+': res+=no;//flg=0;
break;
case '-': res-=no;//flg=0;
break;
case '/': res/=no;//flg=0;
break;
case '*': res*=no;//flg=0;
break;
case '%': res%=no;//flg=0;
break;
}

}
msg=""+res;
}

if(flg==1)// || flg1==)
{
msg="";
flg=0;
}

if((t1>=48&&t1<=57)||t1==46)
{
if(cnt==0)
msg="";
cnt++;
flg2=1;
msg+=ch;
if(t1==46) flg1=1;
}
if(flg2==1)
{
no=Integer.parseInt(msg);
/*if(flg1==1)
{
no=Float.parseFloat(msg);
//flg1=0;
}
else
{
no=Integer.parseInt(msg);
flg1=0;
}*/
flg2=0;
}

if(temp1.equals("OFF") )
{
msg="";
res=0;
no=0;
}

if(temp1.equals("ON") || temp1.equals("CE") || temp1.equals("C"))
msg="0";
repaint();
}
}
