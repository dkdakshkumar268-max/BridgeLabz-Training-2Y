import java.util.Scanner;
class StudentGrade2 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of students: ");
int n = sc.nextInt();
double[][] marks = new double[n][3];
double[] percentage = new double[n];
String[] grade = new String[n];
for(int i = 0; i < n; i++) 
{
System.out.println("\nEnter marks for Student " + (i + 1));
for(int j = 0; j < 3; j++) 
{
do 
{
if(j == 0)
System.out.print("Physics: ");
else if(j == 1)
System.out.print("Chemistry: ");
else
System.out.print("Maths: ");
marks[i][j] = sc.nextDouble();
if(marks[i][j] < 0)
System.out.println("Marks cannot be negative. Please re-enter.");
}while(marks[i][j] < 0);
}
double total = 0;
for(int j = 0; j < 3; j++) 
{
total += marks[i][j];
}
percentage[i] = total / 3.0;
if(percentage[i] >= 80)
grade[i] = "A";
else if(percentage[i] >= 70)
grade[i] = "B";
else if(percentage[i] >= 60)
grade[i] = "C";
else if(percentage[i] >= 50)
grade[i] = "D";
else if(percentage[i] >= 40)
grade[i] = "E";
else
grade[i] = "R";
}
System.out.println("\n----- RESULT -----");
for(int i = 0; i < n; i++) 
{
System.out.println("\nStudent " + (i + 1));
System.out.println("Physics: " + marks[i][0]);
System.out.println("Chemistry: " + marks[i][1]);
System.out.println("Maths: " + marks[i][2]);
System.out.println("Percentage: " + percentage[i]);
System.out.println("Grade: " + grade[i]);
}
}
}