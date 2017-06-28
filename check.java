class check  
{
    static boolean checki(int p,int i,int n,boolean align)
    {
        start.pChange=0;
        if(p==0||p==1||p==2)
            if(checkj(0,i,n,align))
            {
                start.temp=2;
                return true;
        }
        if(p==3||p==4||p==5)
            if(checkj(3,i,n,align))
            {
                start.temp=5;
                return true;
        }
        if(p==6||p==7||p==8)
            if(checkj(6,i,n,align))
            {
                start.temp=8;
                return true;
        }
        return false;
    }

    static boolean checkj(int i,int j,int n,boolean align)
    {
        boolean x;
        if(j==0||j==1||j==2)
        {
            x=matrix.checkmat(i,0,n,align);
            return x;
        }
        else
        if(j==3||j==4||j==5)
        {
            x=matrix.checkmat(i,3,n,align);
            return x;
        }
        else
        if(j==6||j==7||j==8)
        {
            x=matrix.checkmat(i,6,n,align);
            return x;
        }
        else
            return false;
    }

    static boolean checkhv(int x,int n,boolean align)
    {
        int y;
        for(int k=0;k<9;k++)
        {
            if(align)
                y=start.a[k][x];
            else
                y=start.a[x][k];
            if(y==n)
            {
                start.pos[x]=0;
                return true;
            }
            else
                start.pos[x]=1;
        }
        return false;
    }
}