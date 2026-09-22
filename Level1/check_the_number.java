import java.util.Scanner;
public class check_the_number
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int i=0;
        System.out.println("Enter 5 numbers:");
        for (i=0;i<numbers.length;i++)
        {
            System.out.print("Number "+(i+1)+": ");
            numbers[i]=sc.nextInt();
        }
        System.out.println("\nChecking Numbers:\n");
        for (i=0;i<numbers.length;i++)
        {

            if (numbers[i] >0)
            {
                if (numbers[i]%2==0)
                {
                    System.out.println(numbers[i]+" is Positive and Even.");
                } else
                {
                    System.out.println(numbers[i] + " is Positive and Odd.");
                }
            }
            else if (numbers[i]<0)
            {
                System.out.println(numbers[i] + " is Negative.");
            }
            else
            {
                System.out.println(numbers[i]+" is Zero.");
            }
        }
        System.out.println("\nComparing First and Last Elements:\n");
        if(numbers[0]==numbers[numbers.length-1])
        {
            System.out.println("First and Last elements are Equal.");
        }
        else if (numbers[0]>numbers[numbers.length-1])
        {
            System.out.println("First element is Greater than Last element.");
        }
        else
        {
            System.out.println("First element is Less than Last element.");
        }
    }
}