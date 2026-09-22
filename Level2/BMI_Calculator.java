import java.util.*;
class BMI_Calculator
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of persons: ");
int n=sc.nextInt();
double[] weight=new double[n];
double[] height=new double[n];
double[] bmi=new double[n];
String[] status=new String[n];
for(int i=0;i<n;i++)
{
System.out.println("\nPerson "+(i+1));
System.out.print("Enter weight (kg): ");
weight[i]=sc.nextDouble();
System.out.print("Enter height (meters): ");
height[i]=sc.nextDouble();
}
for(int i=0;i<n;i++)
{
bmi[i]=weight[i]/(height[i]*height[i]);
if(bmi[i]<=18.4)
{
status[i]="Underweight";
}
else if(bmi[i]>=18.5&&bmi[i]<=24.9)
{
status[i]="Normal weight";
}
else if(bmi[i]>=25.0&&bmi[i]<=39.9)
{
status[i]="Overweight";
}
else
{
status[i]="Obese";
}
}
System.out.println("\n--- BMI Report ---");
for(int i=0;i<n;i++)
{
System.out.println("\nPerson "+(i+1));
System.out.println("Height: "+height[i]+" m");
System.out.println("Weight: "+weight[i]+" kg");
System.out.printf("BMI: %.2f\n", bmi[i]);
System.out.println("Status: " + status[i]);
}
}
}