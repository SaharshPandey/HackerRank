import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
       // double result=0;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
           int result=0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j=0;j<n;j++)
                {
                
                    result=(int) (result+(b*(Math.pow(2,j))));
                   //result=result+a;
                int ans=a+result;
                 System.out.print(ans+" ");
                ans=0;
              }
            System.out.println("");
            
        }
        in.close();
    }
}
