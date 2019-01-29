public class Error4
{  
public static void main(String args[]){  
try{  
//code that may raise exception  
String s=null;
System.out.print(s.length());
}catch(ArithmeticException e){System.out.println(e);}  
 //rest code of the program   
System.out.println("rest of the code...");  
 }  
}  

