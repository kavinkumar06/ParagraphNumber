# ParagraphNumber
import java.io.*;
import java.util.*;
public class ParagraphNumber
{
  public static void main(String args[])
  {
         Scanner in = new Scanner(System.in);           

            System.out.println("enter the string ");
            String input = in.next();

        
            int lines = 0;
            

            while(in.hasNextLine())
            {
                in.nextLine();
                lines++;
            }

            while(in.hasNextByte())
            {
                in.nextByte();
                chars++;
            }

            System.out.println("Number of lines: " + lines);
            
    }
}
