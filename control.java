class control 
{
    static void loop()
    { 
        int last=0;
        start.tnof=1;
        start.supercount=0;
        int i=1;
        while(start.tnof!=0&&start.supercount<9)
        {
            start.tnof=0;
            start.supercount=0;
            lineWise.vertical();
            lineWise.horizontal();
            number.supercnt();
            i++;
        }
        if(start.supercount==9)
            app.output(true);
        else
        {
            last=bruteForce.deadEnd();
            start.gesfll.add("");
            bruteForce.possibility(last);
        }
    }
}