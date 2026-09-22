import java.util.Scanner;
class StringComparison 
{
static boolean compareUsingCharAt(String a,String b)
{
if(a.length()!=b.length()) 
return false;
for(int i=0;i<a.length();i++)
{
if(a.charAt(i)!=b.charAt(i)) 
return false;
}
return true;
}
public static void main(String[] args)
{
System.out.println("Enter two Strings :");
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
boolean result1=compareUsingCharAt(s1,s2);
boolean result2=s1.equals(s2);
System.out.println("CharAt Result: "+result1);
System.out.println("Equals Result: "+result2);
System.out.println("Both Same? "+(result1==result2));
}
}



