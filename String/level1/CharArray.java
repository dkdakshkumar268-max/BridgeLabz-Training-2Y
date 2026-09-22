import java.util.Scanner;
class CharArray 
{
static char[] myToCharArray(String s)
{
char[] arr=new char[s.length()];
for(int i=0;i<s.length();i++)
{
arr[i]=s.charAt(i);
}
return arr;
}
static boolean compareArrays(char[] a,char[] b)
{
if(a.length!=b.length) 
return false;
for(int i=0;i<a.length;i++)
{
if(a[i]!=b[i]) 
return false;
}
return true;
}
public static void main(String[] args)
{
System.out.println("Enter a string :");
Scanner sc=new Scanner(System.in);
String s=sc.next();
char[] arr1=myToCharArray(s);
char[] arr2=s.toCharArray();
System.out.println("Both Same? "+compareArrays(arr1,arr2));
}
}

