import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        String no="";
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
               
                if(s1.length()<11 && x<=999)
                    {
                    for(int j=s1.length();j<15;j++)
                        {
                         s1=s1+" ";
                        
                         }
                    no=String.valueOf(x);
                    if(no.length()==1)
                        {
                        no="00"+no;
                    System.out.println(s1+""+no);
                    }
                   else if(no.length()==2)
                        {
                        no="0"+no;
                    System.out.println(s1+""+no);
                   }
                   else if(no.length()==3)
                        {
                        no=""+no;
                    System.out.println(s1+""+no);
                   }
            }
                
                
            

    }
System.out.println("================================");
    }
}

