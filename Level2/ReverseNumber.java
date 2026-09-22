import java.util.*;
class ReverseNumber
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
int number=sc.nextInt();
int temp=number;
int count=0;
while(temp!=0)
{
count++;
temp=temp/10;
}
int[] digits=new int[count];
temp=number;
for(int i=count-1;i>=0;i--)
{
digits[i]=temp%10;
temp=temp/10;
}
int[] reverse=new int[count];
for(int i=0;i<count;i++)
{
reverse[i]=digits[count-1-i];
}
System.out.print("Reversed Number: ");
for(int i=0;i<count;i++)
{
System.out.print(reverse[i]);
}
}
}