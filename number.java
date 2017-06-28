class number
{
    static void supercnt()
    {
        minCount();
        start.supercount=0;
        for(int i=0;i<=8;i++)
        {
            if(start.count[i]==9)
                start.supercount++;
        }
    }

    static void minCount()
    {
        int n;
        for(int i=0;i<9;i++)
            start.count[i]=0;
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
            {
                n=start.a[i][j];
                if(n!=0)
                    start.count[n-1]+=1;
        }
    }
}