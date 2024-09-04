import java.util.*;
public class Bst {
    class Solution{
    
        
        int findPlatform(int arr[], int dep[], int n)
        {
           
            sort(arr,arr+n);
            sort(dep,dep+n);
            queue<int> q;
            int ans=0;
            for(int i=0;i<n;i++) {
                q.push(dep[i]);
                while(q.front() < arr[i]) q.pop();
                ans = max(ans,int(q.size()));
            }
            return ans;
        }
    };
    
}
