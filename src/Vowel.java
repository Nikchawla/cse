import java.util.*;
class Vowel {

    
  public static void main(String args[])
    { 
    String ch;
    Scanner in = new Scanner(System.in);
    System.out.print("Input an alphabet: ");
    String input = in.nextLine();
    if(input.equals("a")|| input.equals("e") || input.equals("o") || input.equals("i")|| input.equals("u"))
    {
    System.out.print("Input letter is vowel");}
       
    else if (input.length() > 1)
    {
        System.out.println("Error. Not a single character.");
    }
    else
    {
        System.out.println("Input letter is Consonant");
    }
    }
    }