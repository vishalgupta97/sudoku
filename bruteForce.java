class bruteForce
{
    static void possibility(int last)
    {
        outer:for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                if(start.a[i][j]==0)
                    for(int n=last+1;n<10;n++)
                        if(!check.checki(i,j,n,false))
                            if(!check.checkhv(i,n,false))
                                if(!check.checkhv(j,n,true))
                                {
                                    start.ges.add(100*i+j*10+n);
                                    start.a[i][j]=n;
                                    break outer;
        }
        control.loop();
    }

    static int deadEnd()
    {
        int cnt=0,last=0;
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                if(start.a[i][j]==0)
                    for(int n=1;n<10;n++)
                        if(!check.checki(i,j,n,false))
                            if(!check.checkhv(i,n,false))
                                if(!check.checkhv(j,n,true))
                                {
                                    cnt++;
                                    break;
        }
        if(cnt==0)
            last=remove();
        return last;
    }

    static int remove()
    {
        int size=start.gesfll.size()-1;
        String s=start.gesfll.get(size);
        int i,j;
        i=start.ges.get(size)/100;
        j=start.ges.get(size)%100/10;
        for(int k=0;k<s.length();k=k+2)
            start.a[Integer.parseInt(s.charAt(k)+"")][Integer.parseInt(s.charAt(k+1)+"")]=0;      
        start.gesfll.remove(size);
        int num=start.ges.get(size)%10;
        start.a[i][j]=0;         
        start.ges.remove(size);
        if(checkPossibility(i,j,num))
            num=remove();
        return num;
    }

    static boolean checkPossibility(int i,int j,int num)
    {
        int last=0;
        for(int n=1;n<10;n++)
            if(!check.checki(i,j,n,false))
                if(!check.checkhv(i,n,false))
                    if(!check.checkhv(j,n,true))
                        last=n;
        if(last==num)
            return true;
        return false;
    }
}                     
