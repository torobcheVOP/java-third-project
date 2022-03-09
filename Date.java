package date;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) throws Exception {
        System.out.println("please enter a number to show the day and the month and the year:");
        Scanner scanner=new Scanner(System.in);
        String y=scanner.nextLine();


        try
        {
            if(y==null)
            {
                throw new NullPointerException("it cant be Null");
            }
            else if(Integer.parseInt(y)==0)
            {
                throw new Exception("the number you entered cant be 0");
            }
            else if(Integer.parseInt(y)>365)
            {
                throw new Exception("the number is out of range");
            }
            else if(Integer.parseInt(y)<0)
            {
                throw new StringIndexOutOfBoundsException("nice try to insert a negative");
            }
            int p=Integer.parseInt(y);
            The_sec_proc the_sec_proc=new The_sec_proc(y);
            the_sec_proc.Proc();
        }
        catch (StringIndexOutOfBoundsException siob)
        {
            System.out.println("negetive");
        }
        catch (NumberFormatException nfe)
        {
System.out.println("i told you to enter a number");
        }
        catch (NullPointerException np)
        {
System.out.println("really Null?");
        }
        catch (Exception e)
        {
            System.out.println("do you Know how many days are in the year?");
        }



        finally {
            System.out.println("have fun -_-");
        }

    }
}
