import java.util.Scanner;
public class DigitFrequency 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
long number = sc.nextLong();
long temp = number;
int count = 0;
while(temp != 0) 
{
count++;
temp /= 10;
}
int[] digits = new int[count];
temp = number;
for(int i = count - 1; i >= 0; i--) 
{
digits[i] = (int)(temp % 10);
temp /= 10;
}
int[] frequency = new int[10];
for (int i = 0; i < count; i++) 
{
frequency[digits[i]]++;
}
System.out.println("\nDigit Frequencies:");
for(int i = 0; i < 10; i++) 
{
if(frequency[i] > 0) 
{
System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
}
}
}
}
