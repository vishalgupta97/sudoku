class lineWise 
{

    static void vertical()
    {
        first :for(int n=1;n<=9;n++)
        { 
            second:for(int j=0;j<9;j++)
            {
                third:for(int i=0;i<9;i++) 
                {
                    if(start.a[i][j]==n)
                        continue second;
                    else
                    if(start.a[i][j]==0)
                        start.pos[i]=0;
                    else
                    if(start.a[i][j]!=0)
                        start.pos[i]=-1;
                }
                for(int p=0;p<9;p++)
                {
                    if(start.pos[p]==0)
                    {
                        if(check.checki(p,j,n,false))
                        {
                            p=start.temp;
                            continue;
                        }
                        for(int k=0;k<9;k++)
                        {
                            if(start.a[p][k]==n)
                            {
                                start.pos[p]=0;
                                break;
                            }
                            else
                                start.pos[p]=1;
                        }
                    }
                }
                changeValue.change(n,j,false);
            }
        }
    }

    static void horizontal()
    {
        first :for(int n=1;n<=9;n++)
        { 
            second:for(int i=0;i<9;i++)
            {
                third:for(int j=0;j<9;j++)
                {
                    if(start.a[i][j]==n)
                        continue second;                    
                    else
                    if(start.a[i][j]==0)
                        start.pos[j]=0;
                    else
                    if(start.a[i][j]!=0)
                        start.pos[j]=-1;
                }
                for(int p=0;p<9;p++)
                {
                    if(start.pos[p]==0)
                    {
                        if(check.checki(p,i,n,true))
                        {
                            p=start.temp;
                            continue;
                        }
                        for(int k=0;k<9;k++)
                        {
                            if(start.a[k][p]==n)
                            {
                                start.pos[p]=0;
                                break;
                            }
                            else
                                start.pos[p]=1;
                        }
                    }
                }
                changeValue.change(n,i,true);
            }
        }
    }
}
