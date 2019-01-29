public class TestThrow1
{
 public static void main(String args[]){
  String s=null;
  try
  {
  if(s==null)
  {
    throw new Exception("u entered a null string");
  }
  
  else
  System.out.print("welcome to vote"+s);
  }
  catch(Exception e)
  {
  System.out.print(e);
  }
  finally
  {
  System.out.println("rest of the code..."); 
  }
}
}  
   