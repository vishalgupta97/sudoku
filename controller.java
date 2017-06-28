import java.awt.event.*;
import javax.swing.*;
class controller
{
    static void direction(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case 8:start.a[start.row][start.col]=0;
                   start.atemp[start.row][start.col]=0;
                   app.b[controller.checkMat()].a1[controller.checkGrid()].setText("");
                   break;
            case 37:if(start.col!=0)
                start.col--;
            break;
            case 38:if(start.row!=0)
                start.row--;
            break;
            case 39:if(start.col!=8)
                start.col++;
            break;
            case 40:if(start.row!=8)
                start.row++;
            break;
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:if(start.a[start.row][start.col]==0)
            {
                start.a[start.row][start.col]=Integer.parseInt(new String(e.getKeyChar()+""));
                start.atemp[start.row][start.col]=Integer.parseInt(new String(e.getKeyChar()+""));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Enter a Single Digit No. Only","Warning",JOptionPane.WARNING_MESSAGE);
                app.b[controller.checkMat()].a1[controller.checkGrid()].setText(start.a[start.row][start.col]+"");
            }
            if(start.col==8)
            {
                if(start.row!=8)
                    start.row++;
                else
                    start.row=0;
                start.col=0;
            }
            else
                start.col++;            
            break;
        }
        controller.onFocus();
    }

    static void onFocus()
    {
        app.b[controller.checkMat()].a1[controller.checkGrid()].requestFocus();
    }

    static int checkMat()
    {
        if(start.row<3)
        {
            if(start.col<3)
                return 0;
            else
            if(start.col<6)
                return 1;
            else
                return 2;
        }
        else 
        if(start.row<6)
        {
            if(start.col<3)
                return 3;
            else
            if(start.col<6)
                return 4;
            else
                return 5;
        }
        else
        {
            if(start.col<3)
                return 6;
            else
            if(start.col<6)
                return 7;
            else
                return 8;
        }
    }

    static int checkGrid()
    {
        if(start.row%3==0)
        {
            if(start.col%3==0)
                return 0;
            else
            if(start.col%3==1)
                return 1;
            else
                return 2;
        }
        else 
        if(start.row%3==1)
        {
            if(start.col%3==0)
                return 3;
            else
            if(start.col%3==1)
                return 4;
            else
                return 5;
        }
        else
        {
            if(start.col%3==0)
                return 6;
            else
            if(start.col%3==1)
                return 7;
            else
                return 8;
        }
    }

    static void designation()
    {
        if(start.desig[8]%10!=8)
            for(int i=0;i<9;i++)
                start.desig[i]+=3;
        else
            for(int i=0;i<9;i++)
                start.desig[i]+=24;
    }
}
