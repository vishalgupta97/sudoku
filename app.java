import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class app extends JFrame implements ActionListener
{    
    static jpanel b[]={new jpanel(),new jpanel(),new jpanel(),new jpanel(),new jpanel(),new jpanel(),new jpanel(),new jpanel(),new jpanel()};
    JButton button,clear,reset;
    String s="";
    static int pos=0;
    public app()
    {
        super("Sudoku");
        super.setBounds(100,100,300,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        Container cp=getContentPane();
        cp.setBackground(Color.WHITE);
        for(int i=0;i<9;i++)        
            cp.add(b[i]);        
        button=new JButton("Ok");
        cp.add(button);
        button.addActionListener(this);
        clear=new JButton("Clear");
        cp.add(clear);
        clear.addActionListener(this);
        reset=new JButton("Reset");
        cp.add(reset);
        reset.addActionListener(this);
        getRootPane().setDefaultButton(button);
        b[0].a1[0].requestFocus();
        super.setVisible(true);
    }    

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            int cnt=0;
            for(int i=0;i<9;i++)
                for(int j=0;j<9;j++)
                    if(start.a[i][j]!=0)
                        cnt++;
            if(cnt>16)
                start.starter();
            else
             JOptionPane.showMessageDialog(null,"Enter atleast 17 Digits","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        if(e.getSource()==clear)
        {
            for(int i=0;i<9;i++)
            {
                b[i].clearer(i);
            }
        }
        else
        if(e.getSource()==reset)
        {   
            for(int i=0;i<9;i++)
                for(int j=0;j<9;j++)
                    start.a[i][j]=start.atemp[i][j];
            app.output(false);
        }
    }

    public static void output(boolean state)
    {
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
            {
                start.row=i;
                start.col=j;
                if(start.atemp[i][j]==0)
                    app.b[controller.checkMat()].a1[controller.checkGrid()].setForeground(Color.black);
                if(state)
                    app.b[controller.checkMat()].a1[controller.checkGrid()].setText(start.a[i][j]+"");
                else
                {
                    if(start.atemp[i][j]==0)
                        app.b[controller.checkMat()].a1[controller.checkGrid()].setText("");
                    else
                        app.b[controller.checkMat()].a1[controller.checkGrid()].setText(start.atemp[i][j]+"");
                }
        }
    }
}