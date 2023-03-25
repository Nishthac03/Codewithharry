import java.util.Scanner;
public class cwh_15
{
    public static void main(String[] args)
    {
        /*problem 1
        to convert a string to lower case
         */
        String name="Jack Parker";
        System.out.println(name.toLowerCase());
        /*
        problem 2
        replace space with underscore in the text input by the user
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the text:");
        String a=sc.nextLine();
        a=a.replace(" ","_");
        System.out.println(a);
    }
}
