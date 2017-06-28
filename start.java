import java.util.*;
class start
{
    static int temp,pChange,tnof;     
    static int a[][]=new int[9][9];
    static int atemp[][]=new int[9][9];
    static int pos[]=new int[9];
    static int supercount=0;
    static int count[]=new int[9];
    static ArrayList <Integer>ges=new  ArrayList <Integer>();
    static ArrayList <String>gesfll=new ArrayList <String>();
    static int row=0;
    static int col=0;
    static int desig[]={00,01,02,10,11,12,20,21,22};
    public static void starter()
    {
        start.gesfll.add("");
        start.ges.add(0);
        control.loop();        
    } 
}