class changeValue 
{ 
    static void change(int n,int j,boolean align)
    {
        int cnt=0,position=0;
        for(int i=0;i<9;i++)
        {
            if(start.pos[i]==1)
            {
                cnt++;
                position=i;
            }
        }
        if(cnt==1)
        {
            int x=start.gesfll.size()-1;
            start.tnof++;
            if(align)
            {    
                start.a[j][position]=n;
                start.gesfll.set(x,start.gesfll.get(x)+j+position);
            }
            else
            {
                start.a[position][j]=n;
                start.gesfll.set(x,start.gesfll.get(x)+position+j);
            }
        }
    }
}