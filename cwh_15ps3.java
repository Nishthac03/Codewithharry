import java.sql.SQLOutput;
import java.util.Scanner;
public class cwh_15ps3
{
    public static void main(String[] args)
    {
       
        /*
        problem 4 detecting double and triple spaces
        */
        Scanner sn=new Scanner(System.in);
        System.out.println("ENTER a string:");
        String b=sn.nextLine();
        System.out.println(b.indexOf("  "));
        System.out.println(b.indexOf("   "));
        
        /*
        problem 5
        wap to format the following string using escape sequence characters
        string="Dear Harry,This java course is nice.Thanks"
        escape sequence characters are  \n for new line \t for a tab
         */
        String c="Dear Harry,\n\tThis java course is nice.\nThanks.";
        System.out.println(c);
    }
}
