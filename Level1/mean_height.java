import java.util.Scanner;
public class mean_height 
{
public static void main(String[]args) 
{
Scanner sc=new Scanner(System.in);
double[] heights = new double[11];
double sum = 0.0;
System.out.println("Enter the heights of 11 football players:");
for(int i=0;i<heights.length;i++) 
{
System.out.print("Height of player "+(i+1)+": ");
heights[i]=sc.nextDouble();
}
for(int i=0;i<heights.length;i++) 
{
sum+=heights[i];
}
double mean = sum/11;
System.out.println("\nMean height of the football team = "+mean);
}
}