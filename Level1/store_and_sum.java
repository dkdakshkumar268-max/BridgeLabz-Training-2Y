import java.util.Scanner;
class store_and_sum 
{
public static void main(String[]args) 
{
Scanner sc = new Scanner(System.in);
double[] numbers=new double[10];
double total = 0.0;
int index=0;
while(true) 
{
if(index==10) 
{
break;
}
System.out.print("Enter a number: ");
double input=sc.nextDouble();
if(input<=0) 
{
break;
}
numbers[index]=input;
index++;
}
System.out.println("\nNumbers entered:");
for(int i=0;i<index;i++) 
{
System.out.println(numbers[i]);
total +=numbers[i];
}
System.out.println("\nTotal sum = " + total);
}
}