public class Error2
{  
public static void main(String args[]){  
try{  
//code that may raise exception  
int a[]=new int[5];
a[10]=50;  
}catch(ArithmeticException e){System.out.println(e);}  
 //rest code of the program   
System.out.println("rest of the code...");  
 }  
}  