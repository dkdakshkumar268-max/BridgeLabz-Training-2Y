import java.util.Scanner;
class EmployeeBonus 
{
public static void main(String[]args) 
{
Scanner sc=new Scanner(System.in);
double[] salary=new double[10];
double[] years=new double[10];
double[] bonus=new double[10];
double[] newSalary=new double[10];
double totalBonus=0.0;
double totalOldSalary=0.0;
double totalNewSalary=0.0;
for(int i=0;i<10;i++) 
{
System.out.println("Enter salary for employee "+(i+1)+":");
double s=sc.nextDouble();
System.out.println("Enter years of service for employee "+(i+1)+":");
double y=sc.nextDouble();
if(s<=0||y<0) 
{
System.out.println("Invalid input.Please enter again.");
i--;
continue;
}
salary[i]=s;
years[i]=y;
}
for(int i=0;i<10;i++) 
{
if(years[i]>5) 
{
bonus[i]=salary[i]*0.05;
} 
else 
{
bonus[i]=salary[i]*0.02;
}
newSalary[i]=salary[i]+bonus[i];
totalBonus+=bonus[i];
totalOldSalary += salary[i];
totalNewSalary += newSalary[i];
}
System.out.println("Total Bonus Payout = "+totalBonus);
System.out.println("Total Old Salary = "+totalOldSalary);
System.out.println("Total New Salary = " + totalNewSalary);
}
}