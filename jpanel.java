import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class jpanel extends JPanel implements KeyListener,FocusListener
{
    JTextField a1[]={new JTextField("",2),new JTextField("",2),new JTextField("",2),new JTextField("",2),new JTextField("",2),new JTextField("",2),new JTextField("",2),new JTextField("",2),new JTextField("",2),};
    jpanel()
    {
        setBackground(Color.white);
        setLayout(new GridLayout(3,3));
        for(int i=0;i<a1.length;i++)
        {
            a1[i].setText("");
            add(a1[i]);
            a1[i].addKeyListener(this);
            a1[i].setName(new String(start.desig[i]+""));
            a1[i].addFocusListener(this);
            a1[i].setForeground(Color.red);
        }
        controller.designation();
    }
    
    void clearer(int x)
    {
        for(int i=0;i<9;i++)
        {
            a1[i].setText("");
            a1[i].setForeground(Color.red);
            start.a[x][i]=0;
            start.atemp[x][i]=0;
        }
    }

    public void keyReleased(KeyEvent e)
    {       
        controller.direction(e);
    }

    public void keyTyped(KeyEvent e){}

    public void keyPressed(KeyEvent e){}

    public void focusGained(FocusEvent e)
    {
        start.row=(Integer.parseInt(e.getComponent().getName()))/10;
        start.col=(Integer.parseInt(e.getComponent().getName()))%10;
    }

    public void focusLost(FocusEvent e){}
}