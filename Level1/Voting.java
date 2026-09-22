import java.util.Scanner;
public class Voting
    {
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            int[] age = new int[10];
            System.out.println("Enter the ages of 10 students:");
            for(int i=0;i<age.length;i++)
            {
                System.out.print("Age of student "+(i+1)+": ");
                age[i] = sc.nextInt();
            }
            System.out.println("\nChecking Voting Eligibility:\n");
            for(int i=0;i<age.length;i++)
            {
                if(age[i]<0)
                {
                    System.out.println("Invalid age: "+age[i]);
                }
                else if(age[i]>=18)
                {
                    System.out.println("The student with the age "+age[i]+" can vote.");
                }
                else
                {
                    System.out.println("The student with the age "+age[i]+" cannot vote.");
                }
            }
        }
    }
