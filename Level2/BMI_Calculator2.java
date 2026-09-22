import java.util.Scanner;
class BMI_Calculator2 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of persons: ");
int number = sc.nextInt();

double[][] personData = new double[number][3];
String[] weightStatus = new String[number];
for (int i = 0; i < number; i++) 
{
System.out.println("\nEnter details for Person " + (i + 1));
double weight;
do 
{
System.out.print("Enter weight (kg): ");
weight = sc.nextDouble();
if(weight <= 0) 
{
System.out.println("Weight must be positive. Please re-enter.");
}
}while(weight <= 0);
double height;
do 
{
System.out.print("Enter height (meters): ");
height = sc.nextDouble();
if (height <= 0) 
{
System.out.println("Height must be positive. Please re-enter.");
}
}while (height <= 0);
personData[i][0] = weight;
personData[i][1] = height;
double bmi = weight / (height * height);
personData[i][2] = bmi;
if(bmi<=18.4) 
{
weightStatus[i] = "Underweight";
} 
else if (bmi >= 18.5 && bmi <= 24.9) 
{
weightStatus[i] = "Normal weight";
} 
else if (bmi >= 25 && bmi < 39.9) 
{
weightStatus[i] = "Overweight";
} 
else 
{
weightStatus[i] = "Obese";
}
}
System.out.println("\n---- BMI REPORT ----");
for (int i = 0; i < number; i++) 
{
System.out.println("\nPerson " + (i + 1));
System.out.println("Weight (kg): " + personData[i][0]);
System.out.println("Height (m): " + personData[i][1]);
System.out.println("BMI: " + personData[i][2]);
System.out.println("Status: " + weightStatus[i]);
}
}
}
