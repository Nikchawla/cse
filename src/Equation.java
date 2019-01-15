import java.util.Scanner;
class Equation {


    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
    System.out.print("Enter x");
    int x = in.nextInt();
    System.out.print("Enter n");
    int n = in.nextInt();
    
                int j,k,f,sum=0;
    for(int i=1;i<=n;i++)
    {
        k=1;
        for( j=1;j<i;j++)
        {
            k=x*k;
        }
        
        f=1;
        for(j=i-1;j>=1;j--)
        {
            f=f*j;
        }
        sum=sum+(k/f);
        
    }
    
    System.out.println("answer="+sum);
    
    }
    
}