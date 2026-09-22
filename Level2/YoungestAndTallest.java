import java.util.Scanner;
class YoungestAndTallest 
{
public static void main(String[]args) 
{
Scanner sc=new Scanner(System.in);
String[] names={"Amar","Akbar","Anthony"};
int[] ages=new int[3];
double[] heights=new double[3];
for(int i=0;i<3;i++) 
{
System.out.println("Enter age of "+names[i]+": ");
ages[i]=sc.nextInt();
System.out.println("Enter height of "+names[i]+": ");
heights[i]=sc.nextDouble();
}
int youngestIndex=0;
int tallestIndex=0;
for(int i=1;i<3;i++) 
{
if(ages[i]<ages[youngestIndex]) 
{
youngestIndex=i;
}
if(heights[i]>heights[tallestIndex]) 
{
tallestIndex=i;
}
}
System.out.println("\nYoungest Friend: " + names[youngestIndex]);
System.out.println("Age: " + ages[youngestIndex]);
System.out.println("\nTallest Friend: " + names[tallestIndex]);
System.out.println("Height: " + heights[tallestIndex]);
}
}