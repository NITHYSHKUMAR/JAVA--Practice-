package javapractice;

public class new {
   


    public static int doUnion(int a[], int n, int b[], int m) 
    {   HashSet<Integer> union = new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            int j=a[i];
            union.add(j);
        }
        for(int i=0;i<m;i++)
        {
            int j = b[i];
            union.add(j);
        }
        int num=union.size();
        
        return num;
        
    }
}
    
+
