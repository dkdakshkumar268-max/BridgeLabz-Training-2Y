import java.util.Scanner;
class SubString 
{
static String mySubstring(String s,int start,int end)
{
String result="";
for(int i=start;i<end;i++)
{
result+=s.charAt(i);
}
return result;
}
static boolean compare(String a,String b)
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
System.out.println("Enter a string :");
Scanner sc=new Scanner(System.in);
String s=sc.next();
System.out.println("Enter start and end index :");
int start=sc.nextInt();
int end=sc.nextInt();
String sub1=mySubstring(s,start,end);
String sub2=s.substring(start,end);
System.out.println("CharAt Substring: "+sub1);
System.out.println("Built-in Substring: "+sub2);
System.out.println("Both Same? "+compare(sub1,sub2));
}
}

