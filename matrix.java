class matrix 
{
    static boolean checkmat(int i,int j,int n,boolean align) 
    {
        int temp=0;
        if(align)
        {
            temp=i;
            i=j;
            j=temp;
        }
        for(int l=i;l<=(i+2);l++)
        {
            for(int k=j;k<=(j+2);k++)
            {
                if(start.a[l][k]==n)
                    return true;
            }
        }
        return false;
    }
}